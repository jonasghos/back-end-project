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

@WebServlet("/FindAllProductController")

public class FindAllProductController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		IProductoDao dao = new ProductoDAOMysqlImpl();
		
	 	List<Producto> productos = new ArrayList<>(); 
	 		
	 	//En caso de que ocurra algun error lo atrapo y lo muestro por consola
	 	try {
	 		productos = dao.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	 	
	 	
	 	req.setAttribute("productos", productos);
	 	
	 	//Bloque de codigos que utilizaremos en todos lados
	 	
	 	getServletContext().getRequestDispatcher("/products/list.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
