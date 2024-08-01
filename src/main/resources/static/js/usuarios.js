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
    'usuarios',
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

let listadoUsuariosHTML = ''

for (let usuario of usuarios){
  
  /**
   * AQUI llenaremos los usuarios con eso se hace llamado al server y se trae todo el 
   * listado que pusimos en Usuario controller
   * las comillas deben ser simples para que funcione ''
   */
  
  let usuarioHTML = '<tr><td>4556</td><td>'+usuario.nombre+' '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';

  listadoUsuariosHTML += usuarioHTML;

}



  //console.log(usuarios);
  
  // habia problemas con las commilas dobles, asi que se usa para encerrar todo comilla normal
  // el HTML debe estar en una sola linea para que no de error
  // let usuarioHTML = '<tr><td>4556</td><td>Java Script</td><td>primeroejemplo@yahoo.com</td><td>5245124512</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';

  // Seccion que instruce varoes a la tabla de usuarios del ususarios.HTML
  // aqui se debe poner ahora la lista
  document.querySelector('#usuarios tbody').outerHTML = listadoUsuariosHTML;

}


