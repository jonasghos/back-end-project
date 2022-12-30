<!DOCTYPE html>
<!-- Directiva para importar clases -->
<%@page import="ar.com.codoacodo.domain.Producto"%>
<%@page import="java.util.List"%>

<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="../components/styles.jsp"></jsp:include>
	<title>Listado de productos</title>
    

</head>
<body>
	<header id="navBar" > 
		<jsp:include page="../components/navBar.jsp"></jsp:include>
	</header>
	<main class='container bg'>
		<section>
			
			<% if ( request.getAttribute("msjAlert") == "") { %> 
				<div class="alert alert-danger" role="alert" style="margin-top: 30px;">
					<i class="fa-solid fa-circle-exclamation fa-4x text-center" style=" width: 100%"></i>		
					<p class="text-center" style=" width: 100%; margin-top: 20px;" >No se pueden buscar cadenas vacias, por favor intente nuevamente!</p>
				</div>
			<%} else {%>
				
				<% if(request.getAttribute("msjEmpty") != null ){%>
					
					<div style="margin-top: 30px;" >
						<p class= "fs-5">Resultados de la busqueda de: <span class= "fs-4">"<%= request.getAttribute("msjEmpty") %>"</span> </p>
						<br>
						<p class= "fs-6">No se encontraron coincidencias.</p>
					</div>
				
				<% } else {%>
				
					<p class= "fs-5">Resultados de la busqueda de: <span class= "fs-4">"<%= request.getAttribute("keyWord") %>"</span> </p>
					<table class="table table-responsive" >
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
										<button type="button" class= "fa-solid fa-pen-to-square nav-link active" data-bs-toggle="modal" data-bs-target="#exampleModal"
												onclick="setValues(<%= p.getId() %>,'<%=p.getCodigo()%>', '<%= p.getTitulo() %>', <%= p.getPrecio() %>, '<%= p.getAutor() %>', '<%=p.getImage()%>' )">										
		        						</button>	
		        						
						                <button type="button"  class="fa-solid fa-trash nav-link active" data-bs-toggle="modal" data-bs-target="#staticBackdrop"
						                		onclick="deleteId(<%= p.getId()%>, '<%= p.getTitulo() %>')">
						                </button>
					                </div>
					            </td>	
					        </tr>
					        <% } %>
				        </tbody>  		  
		    	</table>
		    <% } }%>

		</section>	
		

           
	</main>
	
	<jsp:include page="./modalUpdateProduct.jsp"></jsp:include>
	<jsp:include page="./modalDeleteProduct.jsp"></jsp:include>
    <jsp:include page="../components/scripts.jsp"></jsp:include>
    

</body>
</html>