<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%= request.getContextPath() %>/">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="<%= request.getContextPath() %>/FindAllProductController">Listado</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath() %>/products/new.jsp">Nuevo Producto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Ejercicios
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href=" <%= request.getContextPath() %>/ejercicios/html-js/index.html">HTML</a></li>
            <li><a class="dropdown-item" href="<%= request.getContextPath() %>/ejercicios/css-bootstrap/index.jsp">CSS - Bootstrap</a></li>
          </ul>
        </li>

      </ul>
      <form class="d-flex" role="search" action="<%= request.getContextPath()%>/SearchProductController">
        <input class="form-control me-2" type="search" placeholder="T?tulo de producto..." aria-label="Search" id="searchKey" name="searchKey" required>
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>