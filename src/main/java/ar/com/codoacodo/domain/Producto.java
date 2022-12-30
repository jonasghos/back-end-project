package ar.com.codoacodo.domain;

import java.util.Date;

public class Producto {
	private Long id;
	private String codigo;
	private String titulo;
	private Double precio;
	private Date fechaAlta;
	private String Autor;
	private String image;
	
	
	public Producto(String codigo, String titulo, Double precio, Date fechaAlta, String autor, String image) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		Autor = autor;
		this.image = image;
	}


	public Producto(Long id, String codigo, String titulo, Double precio, Date fechaAlta, String autor, String image) {
		
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		Autor = autor;
		this.image = image;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public String getAutor() {
		return Autor;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio
				+ ", fechaAlta=" + fechaAlta + ", Autor=" + Autor + ", image=" + image + "]";
	}
	
	
	
	
}
