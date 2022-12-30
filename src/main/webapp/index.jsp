<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://localhost:8080/app-web/components/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Ejercicio Integrador</title>
</head>
<body class="bg">
	<header id="navBar" > 
		<jsp:include page="./components/navBar.jsp"></jsp:include>
	</header>
    <main class="contaier main-home">
    	<img alt="" src="./images/codoacodo.png">
    	<button class="btn btn-outline-light" onclick='verListado()'> 
    		Ver Listado de productos
    	</button>
    </main>
    
    <jsp:include page="./components/scripts.jsp"></jsp:include>
</body>
</html>