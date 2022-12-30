package ar.com.codoacodo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IProductoDao;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;

@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("deleteId");
		
		IProductoDao dao = new ProductoDAOMysqlImpl();
		
	 	try {
	 		
	 		if(id == "" ) {
				req.setAttribute("msjError", id);
	 		} else {
	 			var p = Long.parseLong(id);
	 			dao.getById(p);
	 			
	 			if (dao.getById(p) == null) {
	 				req.setAttribute("msjAlert",id);
	 			} else {
	 				dao.delete(p);
	 				req.setAttribute("msjConfirm", id);
	 			
	 			}
	 		}
	 	     
	 	} catch (Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	getServletContext().getRequestDispatcher("/products/deleteProduct.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		
	}


}
