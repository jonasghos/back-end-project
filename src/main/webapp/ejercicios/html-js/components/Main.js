function Main(){
    const mainHtml= `
    <div class="container-fliud">
        <section class="container-fluid intro">
            <div class="card-intro">
                <h2 class="text-white">Conf Bs AS</h2>
                <p class="text-white">Bs As llega por primera vez a Argentina. Un evento para compartir con nuestra comunidad el conocimiento y experiencia de los expertos que están creando el futuro de Internet. Ven a conocer a los miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. ¡Te esperamos!</p>
                <div class="buttons">
                    <button type="button" class="btn btn-outline-light btn-intro">Quiero ser orador</button>
                    <a class="btn btn-success btn-intro" href="./buyTickets.html" >Comprar Tickets</a>
                </div>
            </div>
        </section>
        <section class="container-fluid speakers">
            <div class="speakers-title">
                <p class="text-center" style="height: 12px;">Conoce a los </p>  
                <p class="text-center fs-1">ORADORES</p>
            </div>
            <div class="row speakers-list d-flex justify-content-center">
                <div class="card col-sm-12" style="width: 23rem;">
                    <img src="./images/steve.jpg" class="card-img-top card-img" alt="...">
                    <div class="card-body">
                        <div class="btns-group  ">
                            <button type="button" class="btn btn-warning btns text-black badge">JavaScript</button>
                            <button type="button" class="btn btn-info btns text-white badge">React</button>
                        </div>
                        <h5 class="card-title">Steve Jobs</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Obcaecati, modi dicta, eligendi ratione dolores, facere distinctio non quidem libero deserunt nobis!</p>

                    </div>
                </div>
                <div class="card col-sm-12" style="width: 23rem;">
                    <img src="./images/bill.jpg" class="card-img-top card-img" alt="...">
                    <div class="card-body">
                        <div class="btns-group  ">
                            <button type="button" class="btn btn-warning btns text-black badge">JavaScript</button>
                            <button type="button" class="btn btn-info btns text-white badge">React</button>
                        </div>
                        <h5 class="card-title">Bill Gates</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum molestias hic provident repudiandae eligendi veniam itaque eaque natus pariatur error.</p>
                    </div>
                </div>
                <div class="card" style="width: 23rem;">
                    <img src="./images/ada.jpeg" class="card-img-top card-img" alt="...">
                    <div class="card-body">
                        <div class="btns-group  ">
                            <button type="button" class="btn btn-secondary btns text-white badge">Negocios</button>
                            <button type="button" class="btn btn-danger btns text-white badge">Startups</button>
                        </div>
                        <h5 class="card-title">Ada Lovelace</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus ipsum recusandae pariatur adipisci, deserunt, nihil atque maiores molestias id quam sed laborum.</p>
                    </div>
                </div>
            </div>

        </section>
        <section class="img-text d-flex justify-content-end">
            <div class="img"></div>
            <div class="text-img bg-dark">
                <h2 class="text-white">Bs AS - Octubre</h2>
                <p class="text-white">Buenos Aires es la provincia y localidad más grande del estado de Argentina, em los Estados Unidos. Honolulu es la más sureña de entre las principales ciudades estadounidenses. Aunque el nombre de Honolulu se refiere al área urbana en la costa sureste de la isla de Oahu, la ciudad y el condado de Honolulu han formado una ciudad condado consolidada que cubre (aproximadamente 600 km2 de superficie)</p>
                <button type="button" class="btn btn-outline-light">Conocé más</button>
            </div>

        </section>
        <section class="form-speaker">
            <div class="speakers-title" >
                <p class="text-center" style="height: 12px;">CONVÍERTETE EN UN </p>  
                <p class="text-center fs-1">ORADOR</p>
                <h5 class="text-center" >Anótate como orador para dar una charla ignite. Cuéntanos de que quieres hablar!</h5>
            </div>
            <div class="form d-flex justify-content-between  flex-wrap">
                <div class=" form-name">
                    <input type="text" class="form-control" placeholder="Nombre" aria-label="First name">
                </div>
                <div class=" form-lastname">
                    <input type="text" class="form-control" placeholder="Apellido" aria-label="Last name">
                </div>
                <div class="col-12 form-textarea">
                    <textarea class="form-control form__message" id="exampleFormControlTextarea1" rows="6" placeholder="Mensaje.."></textarea>
                </div>
                <div class="col-12">
                    <p>Recuerda incluir un título para tu charla</p>
                </div>
                <div class="col-12">
                    <button type="submit" class="btn-form ">
                        <p class="fs-4" >Enviar</p>
                    </button>
                </div>
            </div>
        </section>
    </div>
    `

    return mainHtml;
}

