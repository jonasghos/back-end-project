package ar.com.codoacodo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IProductoDao;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;

@WebServlet("/SearchProductController")
public class SearchProductController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// Defino la variable
		String keyWord = req.getParameter("searchKey");
		
		
		IProductoDao dao = new ProductoDAOMysqlImpl();
	
		List<Producto> listAll = new ArrayList<>();
		
		try {
			
			if(keyWord == "" ) {

				req.setAttribute("msjAlert",keyWord);
				
			} else {
					
				listAll = dao.searchProduct(keyWord);
			
				if (listAll.size() == 0) {
					
					req.setAttribute("msjEmpty", keyWord);
					
				} else {
					req.setAttribute("keyWord", keyWord);
					req.setAttribute("productos", listAll);
					
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		//Bloque de codigos que utilizaremos en todos lados
	 	
		getServletContext().getRequestDispatcher("/products/searchProducts.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
