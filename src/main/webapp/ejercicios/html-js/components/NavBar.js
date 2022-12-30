function NavBar(){
    const navBarHtml = `
    <nav class="navbar navbar-expand-lg bg-dark">
      <div class="container-fluid d-flex justify-content-between">
        <a class="fa-solid fa-arrow-left btn btn-dark" href="http://localhost:8080/app-web/"></a>
          <img src="./images/codoacodo.png" alt="Logo" class="d-inline-block align-text-center logo " style="margin-left: 20px;"/>
          <span class="text-white">Conf Bs As</span>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="col-md-6 collapse navbar-collapse text-center" id="navbarNav" >
          <ul class="container-fluid d-flex justify-content-evenly navbar-nav">
            <li class="nav-item">
              <a class="nav-link text-white" href="#">La conferencia</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="#">Los Oradores</a>
            </li>
            <li class="nav-item">
              <a class="nav-link  text-secondary" href="#">El lugar y la fecha</a>
            </li>
            <li class="nav-item">
              <a class="nav-link  text-secondary" href="#">Conviérte en orador</a>
            </li>
            <li class="nav-item">
              <a class="nav-link  text-success" href="./buyTickets.html" >Comprar tickets</a>
            </li>
          </ul>
        </div>
      </div>
  </nav>
    `

    return navBarHtml;
}