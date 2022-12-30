# Administrador de productos con JAVA
 
 
 El proyecto simula una aplicación que te permite administrar (crear, modificar, eliminar) productos almacenados en una DB.
 
## Navegabilidad
La aplicación ofrece una barra de navegación disponible en cualquier vista, con links  a los controller que se conectan con la base de datos.

##FindAllProductController
Renderiza un listado de los productos almacenados en la DB, con botones que te permiten generar modificaciones o eliminar productos.

##CreateProductController
Nos permite dar de alta un nuevo producto en la base a traves de un insert. 
Validaciones: 
-Todos los campos del form tienen validaciones en el front para que no puedan enviarse vacios.
-Antes de generar el insert en la DB, el controller hace un select para saber si existe algun producto con el sku ingresado, en caso de existir renderiza a /FindAllProductController y muestra un mensaje de error.
Si todo esta ok, el producto da de alta en la DB, la app renderiza a /FindAllProductControlle y muestra un mensaje ok.

##DeleteProductController
Nos permite eliminar productos desde el front, ya desea desde la grilla de productos o pasan como parametro el ID del producto a eliminar.
Validaciones: 
- En caso de pasar un ID por parametro evalua si existe en la DB, en caso de que no exista renderiza un mensaje de error.
- Si se intenta enviar un ID vacio renderiza un mensaje de error.
- Si el ID existe, se elimina el producto y renderiza un mensaje Ok.


##UpdateProductController
Nos permite generar modificaciones en los productos de la grilla (titulo, autor, precio, imagen).
Validaciones: 
- Los campos a modificar tienen validaciones en front para que no puedan enviarse vacios.


##SearchProductController
El buscar incluido en la barra de navegación nos permite buscar productos por titulo, tambien se puede pasar un string por url
Validaciones:
-El campo de busqueda tiene una validación en front para que no pueda enviarse como "vacio".
-En caso de pasar un string vacio en la url, la app renderiza un mensaje de error.
-En caso de no encontrar resultados en la DB la app renderiza un mensaje de error.
-Si se encontraron resultados en la DB la app renderiza un mensaje ok.

Como complemento se agregaron los trabajos presentados en entregadas anteriores.


 
 
