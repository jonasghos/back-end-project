	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="exampleModalLabel">Editar Producto</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <form 
        	action="<%= request.getContextPath()%>/UpdateProductController"
			method="POST" 
        >
	        <div class="modal-body row" >
	        	<input type="hidden" id="idproducto" name="idproducto">
	            <div class="col-md-6">
	                <label for="validationCustom01" class="form-label">Código Sku</label>
	                <input 
	                    type="text" 
	                    class="form-control text-secondary" 
	                    id="codigo" 
	                    name="codigo" 
	                    disabled
	                >
	            </div>
	            <div class="col-md-6">
	                <label for="validationCustom02" class="form-label">Título   </label>
	                <input 
	                    type="text" 
	                    class="form-control text-secondary" 
	                    id="titulo" 
	                    name="titulo" 
	                    required
	                >
	            </div>
	            <div class="col-md-6">
	                <label for="validationCustom02" class="form-label">Precio</label>
	                <input 
	                    type="text" 
	                    class="form-control text-secondary" 
	                    id="precio" 
	                    name="precio"
	                    required
	                >
	            </div>
	            <div class="col-md-6">
	                <label for="validationCustom02" class="form-label">Autor</label>
	                <input 
	                    type="text" 
	                    class="form-control text-secondary" 
	                    id="autor" 
	                    name="autor"
	                    required
	                >
	
	            </div>
	            <div class="col-md-12">
	                <label for="validationCustom02" class="form-label"> Imagen </label>
	                <input 
	                    type="text" 
	                    class="form-control text-secondary" 
	                    id="img" 
	                    name="img"
	                    required
	                >
	            </div>
	        </div>
	        <div class="modal-footer">
		          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
		          <button type="submit" class="btn btn-primary">Guardar Cambios</button>
        	</div>
        </form>

      </div>
    </div>
  </div>