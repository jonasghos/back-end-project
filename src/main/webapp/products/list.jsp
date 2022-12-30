<!DOCTYPE html>
<!-- Directiva para importar clases -->
<%@page import="ar.com.codoacodo.domain.Producto"%>
<%@page import="java.util.List"%>

<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://localhost:8080/app-web/components/style.css">
	<jsp:include page="../components/styles.jsp"></jsp:include>
	<title>Listado de productos</title>
    

</head>
<body >
	<header id="navBar" > 
		<jsp:include page="../components/navBar.jsp"></jsp:include>
	</header>
	<main class="container-fluid bg-dark-subtle">
			<table class="table table-responsive text-center" style = "width: 80%; margin-left: auto; margin-right: auto;margin-top: 15px;" >
		        <thead>
			        <tr >
			            <th scope="col" class="th--row">Id</th>
			            <th scope="col" class="th--row">Codigo</th>
			            <th scope="col" class="th--row">Titulo</th>
			            <th scope="col" class="th--row">Precio</th>
			            <th scope="col" class="th--row">Fecha Alta</th>
			            <th scope="col" class="th--row">Autor</th>
			            <th scope="col" class="th--row">Imagen</th>
			            <th scope="col" class="th--row">Acciones</th>
		            </tr>
		        </thead>
		        <tbody>
		      
					<% //scriplet - Lo usamos para obtener la lista de productos que guardamos en FindAllProductController
					List<Producto> listado = (List<Producto>)request.getAttribute("productos");
					for (Producto p : listado){
					%>
					<tr>
			            <th scope="row" class="th--row" ><%= p.getId() %></th>
			            <td class="th--row"><%= p.getCodigo() %></td>
			            <td class="th--row"><%= p.getTitulo() %></td> 
			            <td class="th--row"><%= p.getPrecio() %></td>
			            <td class="th--row"><%= p.getFechaAlta() %></td>
			            <td class="th--row"><%= p.getAutor() %></td>
			            <td class="th--row"><%=p.getImage()%></td>
			            <td>
			            	<div class="justify-content-around" style ="display: flex;" > 
								<button type="button" class= "fa-solid fa-pen-to-square nav-link active btn btn-info btn-list" data-bs-toggle="modal" data-bs-target="#exampleModal"
										onclick="setValues(<%= p.getId() %>,'<%=p.getCodigo()%>', '<%= p.getTitulo() %>', <%= p.getPrecio() %>, '<%= p.getAutor() %>', '<%=p.getImage()%>' )">										
           							
        						</button>	
        						
				                <button type="button"  class="fa-solid fa-trash nav-link active btn btn-danger btn-list " data-bs-toggle="modal" data-bs-target="#staticBackdrop"
				                		onclick="deleteId(<%= p.getId()%>, '<%= p.getTitulo() %>')">
				                      
				                </button>
			                </div>
			            </td>	
			        </tr>
			        <% } %>
		        </tbody>  		  
    	</table>	
    	
    		
			<% if (request.getAttribute("msjError") != null){ %>
					<p class="alert alert-danger" style = "width: 100%; margin-left: auto; margin-right: auto;margin-top: 15px;margin-bottom: 15px;"> El codigo <%= request.getAttribute("msjError") %> ya se encuentra registrado, por favor intenta con otro!</p>
			<%} %>
			<% if (request.getAttribute("msjOK") != null){ %>
						<p class="alert alert-success" style = "width: 100%; margin-left: auto; margin-right: auto;margin-top: 15px;margin-bottom: 15px;" >
							Alta del codigo <%= request.getAttribute("msjOK") %> exitosa!
						</p>
			<%} %>

	</main>
	
	<jsp:include page="./modalUpdateProduct.jsp"></jsp:include>
	<jsp:include page="./modalDeleteProduct.jsp"></jsp:include>
    <jsp:include page="../components/scripts.jsp"></jsp:include>
    

</body>
</html>