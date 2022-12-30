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
	<main class='container'>
		<section>
			
			<% if ( request.getAttribute("msjError") == "" ) { %> 
				<div class="alert alert-danger" role="alert" style="margin-top: 30px;">
					<i class="fa-solid fa-circle-exclamation fa-4x text-center" style=" width: 100%"></i>
					<%= request.getAttribute("msjError")%>		
					<div class="row justify-content-center" >
						<p class="text-end col-4" style=" width: 60%; margin-top: 20px;padding-right: 2px;" >
							Campo vacio, por favor intente nuevamente!...
						</p>
						<a class="text-start col-4" style=" width: 40%;margin-top: 20px;padding-left: 1px;" href="<%= request.getContextPath() %>/FindAllProductController">Listado</a>		
					</div>
				</div>
			<%} else { %>
				<% if (request.getAttribute("msjAlert") != null ) {%>
					<div class="alert alert-danger" role="alert" style="margin-top: 30px;">
						<i class="fa-solid fa-circle-exclamation fa-4x text-center" style=" width: 100%"></i>		
						<div class="row justify-content-center" >
							<p class="text-end col-4" style=" width: 60%; margin-top: 20px;padding-right: 2px;" >
								El ID ingresado no existe, por favor intente nuevamente...
							</p>
							<a class="text-start col-4" style=" width: 40%;margin-top: 20px;padding-left: 1px;" href="<%= request.getContextPath() %>/FindAllProductController">Listado</a>		
						</div>
					</div>	
								
						
			 <%} else { %>
			 		<div class="alert alert-success" role="alert" style="margin-top: 30px;">
						<i class="fa-solid fa-circle-check fa-4x text-center" style=" width: 100%"></i>		
						<div class="row justify-content-center" >
							<p class="text-end col-4" style=" width: 60%; margin-top: 20px;padding-right: 2px;" >
								El producto fue eliminado exitosamente, volver a...
							</p>
							<a class="text-start col-4" style=" width: 40%;margin-top: 20px;padding-left: 1px;" href="<%= request.getContextPath() %>/FindAllProductController">Listado</a>		
						</div>
					</div>	
			 <%	} }%>
				
				
		</section>	
		

           
	</main>
	
	<jsp:include page="./modalUpdateProduct.jsp"></jsp:include>
	<jsp:include page="./modalDeleteProduct.jsp"></jsp:include>
    <jsp:include page="../components/scripts.jsp"></jsp:include>
    

</body>
</html>