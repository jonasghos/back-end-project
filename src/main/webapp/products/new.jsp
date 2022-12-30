<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<jsp:include page="../components/styles.jsp"></jsp:include>
	<title>Alta de productos</title>
    

</head>
<body>
	<header id="navBar" > 
		<jsp:include page="../components/navBar.jsp"></jsp:include>
	</header>
	<main class='container bg'>
        <div class="row justify-content-center">
			<form 
				action="<%= request.getContextPath() %>/CreateProductController"
				method="POST" 
				class="row g-2" 
				style="width: 80%;">
                <p class="fs-2">Nuevo Producto</p>
			    <div class="col-md-6">
                    <label for="validationCustom01" class="form-label">Código Sku</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="validationCustom01" 
                        name="codigo" 
                        required
                    >
                    <div class="valid-feedback">
                    Looks good!
                    </div>
                </div>
                <div class="col-md-6">
                    <label for="validationCustom02" class="form-label">Título   </label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="validationCustom02" 
                        name="titulo" 
                        required
                    >
                    <div class="valid-feedback">
                    Looks good!
                    </div>
                </div>
                <div class="col-md-6">
                    <label for="validationCustom02" class="form-label">Precio</label>
                    <input 
                        type="number" 
                        class="form-control" 
                        id="validationCustom02" 
                        name="precio"
                        required
                    >
                    <div class="valid-feedback">
                    Looks good!
                    </div>
                </div>
                <div class="col-md-6">
                    <label for="validationCustom02" class="form-label">Autor</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="validationCustom02" 
                        name="autor"
                        required
                    >
                    <div class="valid-feedback">
                    Looks good!
                    </div>  
                </div>
                <div class="col-md-6">
                    <label for="validationCustom02" class="form-label"> Imagen </label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="validationCustom02" 
                        name="img"
                        required
                    >
                    <div class="valid-feedback">
                    Looks good!
                    </div>
                </div>
                <div class="col-12">
                    <button class="btn btn-primary" type="submit" >Crear</button>
                </div>
			</form>
	</main>
    
    <jsp:include page="../components/scripts.jsp"></jsp:include>
</body>
</html>