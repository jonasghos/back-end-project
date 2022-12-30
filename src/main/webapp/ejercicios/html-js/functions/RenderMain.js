function RenderMain(url){
    if (url.includes("/index.html") || url === "/tp_integrador/"){
        const main = document.createElement('main');
        document.getElementById('body').appendChild(main);
        main.innerHTML = Main();
    } if
        (url.includes("/buyTickets.html")){
            const main = document.createElement('main');
            document.getElementById('body').appendChild(main);
            main.innerHTML = BuyTickets();
        }

}


