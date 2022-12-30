package ar.com.codoacodo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IProductoDao;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;


@WebServlet("/UpdateProductController")
public class UpdateProductController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Defino las variables que voy a actualizar
		String id = req.getParameter("idproducto");
		String titulo = req.getParameter("titulo");
		Double price = Double.parseDouble(req.getParameter("precio"));
		String autor = req.getParameter("autor");
		String imagen = req.getParameter("img");
		
		
		IProductoDao dao = new ProductoDAOMysqlImpl();
		
		try {
			
			//instancio el producto
			Producto p = dao.getById(Long.parseLong(id));
			
			//actualizo los campos
			p.setTitulo(titulo);
			p.setPrecio(price);
			p.setAutor(autor);
			p.setImage(imagen);
			
			dao.update(p);

			}

			
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/FindAllProductController").forward(req, resp);
	
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
		
	}
}
