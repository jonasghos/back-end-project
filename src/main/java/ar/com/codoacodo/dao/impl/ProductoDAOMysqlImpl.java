package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.codoacodo.dao.IProductoDao;
import ar.com.codoacodo.db.AdministradorDeConexiones;
import ar.com.codoacodo.domain.Producto;

public class ProductoDAOMysqlImpl implements IProductoDao {

	@Override
	public Producto getById(Long id) throws Exception {
		//1. Generar la connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2. Armo el Statement (consulta a la DB)
		String sql = "SELECT * FROM PRODUCTOS WHERE ID = " + id;
		
		Statement statement = connection.createStatement();
		
		//3. Ejecutar la consulta
		ResultSet resultSet = statement.executeQuery(sql);
		
		//verifico si hay datos
		if(resultSet.next()) {
			
			Producto p =  this.createProduct(resultSet);
			closeConnection(connection);
			return p;
			
		}
		
		return null;
	}

	@Override
	public List<Producto> findAll() throws Exception{
		//1. Generar la connection
				Connection connection = AdministradorDeConexiones.getConnection();
				
				//2. Armo el Statement (consulta a la DB)
				String sql = "SELECT * FROM PRODUCTOS";
				
				Statement statement = connection.createStatement();
				
				//3. Ejecutar la consulta
				ResultSet resultSet = statement.executeQuery(sql);
				
				//Genero mi arrayList de Productos
				
				var productList = new ArrayList<Producto>();
				
				//verifico si hay datos
				while(resultSet.next()) {
								
					productList.add(this.createProduct(resultSet));
					
				}
				closeConnection(connection);
		return productList;

	}
	
	public List<Producto> searchProduct(String word ) throws Exception {
		//1. Generar la connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2. Armo el Statement (consulta a la DB) 
		String sql = "SELECT * FROM PRODUCTOS WHERE Titulo LIKE '%" + word + "%'";
		
		Statement statement = connection.createStatement();
		
		//3. Ejecutar la consulta
		ResultSet resultSet = statement.executeQuery(sql);
		
		//Genero mi arrayList de Productos
		
		var productList = new ArrayList<Producto>();
		
		//verifico si hay datos
		while(resultSet.next()) {					
			productList.add(this.createProduct(resultSet));
		}
		closeConnection(connection);
		return productList;

	}

	@Override
	public  void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2. Armo el Statement (consulta a la DB)
		String sql = "DELETE FROM PRODUCTOS WHERE ID = " + id;
		
		Statement statement = connection.createStatement();
		
		//3. Ejecutar la consulta
		
		int status = statement.executeUpdate(sql);
		if(status == 1) {
			System.out.println("Se elimino el producto");
		} else {
			System.out.println("No se pudo eliminar el producto");
		}
		closeConnection(connection);
	}

	@Override
	public void update(Producto producto)throws Exception {
		
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection connection = AdministradorDeConexiones.getConnection();
		
		String sql = "UPDATE PRODUCTOS SET Titulo = ?, Precio = ? , Autor = ?, Image = ? WHERE ID = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		

		statement.setString(1, producto.getTitulo());
		statement.setDouble(2, producto.getPrecio());
		statement.setString(3, producto.getAutor());
		statement.setString(4, producto.getImage());
		statement.setLong(5, producto.getId());
		
		statement.execute();
		int status = statement.executeUpdate(sql);		
		closeConnection(connection);

		
	}

	@Override
	public void create(Producto newProducto)throws Exception {
		// TODO Auto-generated method stub
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2. Armo el Statement (consulta a la DB)
		String sql = "INSERT INTO PRODUCTOS (Codigo, Titulo, Precio, FechaAlta ,Autor, Image) values (?,?,?,?,?,?)";
		
		// Cuando hacemos un inserte tenemos que pasar un PreparedStatement.RETURN_GENERATED_KEYS para que genere un nuevo ID
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, newProducto.getCodigo());
		statement.setString(2, newProducto.getTitulo());
		statement.setDouble(3, newProducto.getPrecio());
		statement.setDate(4, new java.sql.Date(newProducto.getFechaAlta().getTime()));
		statement.setString(5, newProducto.getAutor());
		statement.setString(6, newProducto.getImage());
		
		statement.execute();
		
		ResultSet res = statement.getGeneratedKeys();
		
		if(res.next()) {
			newProducto.setId(res.getLong(1));
		}
		closeConnection(connection);
	}
	
		//Creo un metodo que arma un objeto de tipo producto y lo devuelve
		private Producto createProduct(ResultSet resultSet) throws Exception{
		
		
		
			Long idProduct = resultSet.getLong("Id");
			String productCode = resultSet.getString("Codigo");
			String productTitle = resultSet.getString("Titulo");
			Double productPrice = resultSet.getDouble("Precio");
			Date productCreateDate = resultSet.getDate("FechaAlta");
			String productAuthor = resultSet.getString("Autor");
			String productImage = resultSet.getString("Image");
			return new Producto(idProduct, productCode,productTitle, productPrice , productCreateDate, productAuthor, productImage);
		}
	
	
	private void closeConnection(Connection con) throws Exception{
		con.close();
	}
	
	@Override
	public Producto getBySKU(String sku) throws Exception {
		//1. Generar la connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2. Armo el Statement (consulta a la DB)
		String sql = "SELECT * FROM PRODUCTOS WHERE CODIGO = '" + sku + "'";
		
		Statement statement = connection.createStatement();
		
		//3. Ejecutar la consulta
		ResultSet resultSet = statement.executeQuery(sql);
		
		//verifico si hay datos
		if(resultSet.next()) {
			
			Producto p =  this.createProduct(resultSet);
			closeConnection(connection);
			return p;
			
		}
		
		return null;
	}

}
