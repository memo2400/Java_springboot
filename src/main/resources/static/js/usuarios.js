// Call the dataTables jQuery plugin

/* una vez que se carga la pagina se ejecuta esta funcion */

$(document).ready(function() {

  alert("pagina de Alto Hermetism Inc.");
  cargarUsuarios ();

  /* los usuarios se vuelven en una tabla tipo JScript*/

  $('#usuarios').DataTable();


});

/* agrego esta funcion para cargar los usuarios */

async function cargarUsuarios(){

  /* la funcino awat hace que nuestro codigo se espere hasta que se
    terminde de consultar, para evitar eso usaremos funcuino tipo asyn */
  const request = await fetch(
    'usuario/2244',
    {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }

      // esto solo se usaria si usamos metodo post
      // ,body: JSON.stringify({a: 1, b: 'Textual content'})
    } 
  );

  const usuarios = await request.json();

  console.log(usuarios);

}


