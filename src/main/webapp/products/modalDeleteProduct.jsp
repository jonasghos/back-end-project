<!-- Modal -->
<form action="<%= request.getContextPath()%>/DeleteProductController"
		id="deleteProduct">
	<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h1 class="modal-title fs-5" id="staticBackdropLabel">Eliminar producto</h1>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	      		<input type="hidden" id="deleteId" name="deleteId">
	       		<p>�Desea eliminar el producto: <span id="deleteTitulo"></span>?</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
	        <button type="submit" class="btn btn-primary" id="alert" onclick="showAlert()">Confirmar</button>
	      </div>
	    </div>
	  </div>
	</div>
</form>