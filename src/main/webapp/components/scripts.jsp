<!-- Bootstrap  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script><script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

<!-- Font Awesome ICONS  -->
<script src="https://kit.fontawesome.com/f22498bbfa.js" crossorigin="anonymous"></script>

<!-- Functions -->
        <script>
        
	    	function verListado(){
	  			window.location='http://localhost:8080/app-web/FindAllProductController';		
	    	}
	    	
	    	function searchProducts(){
	  			window.location='http://localhost:8080/app-web/SearchProductController';		
	    	}
        
	        function setValues(id,cod, titulo, precio, autor, img){
	        	
	        	
	        	
	        	document.getElementById('idproducto').value= id;
	        	document.getElementById('codigo').value = cod;
	        	document.getElementById('titulo').value= titulo;
	        	document.getElementById('precio').value= precio;
	        	document.getElementById('autor').value= autor;
	        	document.getElementById('img').value= img;
	        	
	        
	        }
	        
	        function deleteId(id, titulo){
	        	document.getElementById('deleteId').value = id;
	        	document.getElementById('deleteTitulo').innerHTML= titulo;
	        }
	
    	
   		</script>
   		
 