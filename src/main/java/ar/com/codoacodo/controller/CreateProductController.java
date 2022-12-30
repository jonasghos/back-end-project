package ar.com.codoacodo.controller;

import ar.com.codoacodo.dao.IProductoDao;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateProductController")
public class CreateProductController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Caputuro los datos que se envian en el form
		String codigo = req.getParameter("codigo");
		String titulo = req.getParameter("titulo");
		Double price = Double.parseDouble(req.getParameter("precio"));
		String autor = req.getParameter("autor");
		String imagen = req.getParameter("img");
		
		
		IProductoDao dao = new ProductoDAOMysqlImpl();
		
		var date = new java.util.Date();

		
	 	Producto newProduct = new Producto(codigo,  titulo, price, date, autor, imagen);

	 	try {
	 		
			
			if (dao.getBySKU(codigo)!=null) {
				req.setAttribute("msjError", codigo);
			} else {
		 		dao.create(newProduct);
		 		req.setAttribute("msjOK", codigo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	 	
	 	getServletContext().getRequestDispatcher("/FindAllProductController").forward(req, resp);
	 	

	}
	

}
