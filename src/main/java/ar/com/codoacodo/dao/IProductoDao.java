package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Producto;

public interface IProductoDao {
	//Define los metodos de acceso a la tabla PRODUCTOS
	
		public List<Producto> findAll() throws Exception ; // select * from productos
		public Producto getById(Long id) throws Exception ; // select * from productos where id = @id
		public void delete(Long id) throws Exception; // delete from productos where id = id
		public void update(Producto producto)throws Exception;
		public void create(Producto newProducto)throws Exception; // insert into productos
		public List<Producto> searchProduct(String word) throws Exception;
		Producto getBySKU(String sku) throws Exception;; // select * from where titulo like + @word
}
