function Render(){

    const url = window.location.pathname;
        const header = document.createElement('header');
        document.getElementById('body').appendChild(header);

        const navbar = NavBar();
        header.innerHTML = navbar;

        RenderMain(url);

        const footer = document.createElement('footer');
        document.getElementById('body').appendChild(footer);
        footer.innerHTML = Footer();

        var numeros = [1,2,3,4];



}



Render();