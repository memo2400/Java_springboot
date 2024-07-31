// Call the dataTables jQuery plugin

/* una vez que se carga la pagina se ejecuta esta funcion */

$(document).ready(function() {

  alert("pagina de Alto Hermetism Inc.");
  cargarUsuarios ();

  /* los usuarios se vuelven en una tabla tipo JScript*/

  $('#usuarios').DataTable();


});

/* agrego esta funcion para cargar los usuarios */

function cargarUsuarios(){

}
