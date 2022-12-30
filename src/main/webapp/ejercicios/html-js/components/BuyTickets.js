function BuyTickets(){
    const mainHtml = `
        <div class="container-fluid">
            <section class="categories" id="categories">
                <div class="card shadow-sm text-center border-primary rounded-0 student" id="student">
                    <div class="card-body" >
                        <h5 class="card-title fs-2">Estudiante</h5>
                        <p class="card-text fs-4">Tienen un descuento</p>
                        <p class="card-text fw-bold fs-5">80%</p>
                        <p class="card-text text-muted fs-5">* presentar documentación</p>
                    </div>
                </div>
                <div class="card shadow-sm text-center border-info rounded-0 trainee "id="trainee">
                    <div class="card-body">
                        <h5 class="card-title fs-2">Trainee</h5>
                        <p class="card-text fs-4">Tienen un descuento</p>
                        <p class="card-text fw-bold fs-5">50%</p>
                        <p class="card-text text-muted fs-5">* presentar documentación</p>
                    </div>
                </div>
                <div class="card shadow-sm text-center border-warning rounded-0 junior"  id="junior">
                    <div class="card-body">
                        <h5 class="card-title fs-2">Junior</h5>
                        <p class="card-text fs-4">Tienen un descuento</p>
                        <p class="card-text fw-bold fs-5">15%</p>
                        <p class="card-text text-muted fs-5">* presentar documentación</p>
                    </div>
                </div>
            </section>
            <section class="tickets">
                <p class="fs-4 text-center fw-light">VENTA</p>
                <h2 class="fs-3 text-center">VALOR DE TICKET $200</h2>
                <form class= "form-buy-tickets" id="formTickets">
                    <div class="row mb-3">
                        <div class="col">
                            <input type="text" class="form-control form-input" placeholder="Nombre" id="inputName" required>
                        </div>
                        <div class="col">
                            <input type="text" class="form-control form-input" placeholder="Apellido" aria-label="Last name" id="inputLastName" required>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <input type="email" class="form-control"  placeholder="Correo" id="inputEmail" required>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <label for="" class="form-label">Cantidad</label>
                            <input type="number" class="form-input form-control form-input" name="amount" id="amount" min="1" required>
                        </div>
                        <div class="col">
                            <label for="validationCustom04" class="form-label">Categoría</label>
                            <select class="form-select" id="category" name="category" required>
                                <option selected  value="80" id="student" >Estudiante</option>
                                <option selected  value="50" id="option" >Trainee</option>
                                <option selected  value="15" id="option" >Junior</option>
                            </select>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <p class="form-control text-primary fw-bolder bg-info bg-opacity-25" id="total" > Total a Pagar: $ <span id="result">  </span></p>   
                                
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <button type="reset" class="btn-form " id="btn-reset">
                                <p class="fs-4" >Borrar</p>
                            </button>
                        </div>
                        <div class="col">
                            <button  type="submit"  class="btn-form " id='btn-resume'>
                                <p class="fs-4" >Resumen</p>
                            </button>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    `   
    return mainHtml;
}

document.addEventListener('DOMContentLoaded', function(){
    const result = document.getElementById('result') 
    const form = document.getElementById('formTickets')  
    form.addEventListener('submit', (e)=>{
        e.preventDefault();
        let data = new FormData(form)
        let amount = parseInt(data.get('amount'))
        let discount = parseInt(data.get('category'))
    
        let total = (amount*200)*(100-discount)/100;
        result.innerText  = total;


    });
    const btnClear = document.getElementById('btn-reset');
    btnClear.addEventListener('click', ()=>{
        result.innerText = '';
    })
})











