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

  console.log(usuarios);
  
  // habia probemas con las commilas dobles, asi que se usa para encerrar todo comilla normal
  let usuario = '<tr>
                  <td>4556</td>
                  <td>KAi Hansen</td>
                  <td>gamma@yahoo.com</td>
                  <td>5245124512</td>
                  <td><a href="#" class="btn btn-danger btn-circle btn-sm">
                    <i class="fas fa-trash"></i>
                    </a>
                  </td>                                            
                </tr>';

  // Seccion que instruce varoes a la tabla de usuarios del ususarios.HTML
  document.querySelector('#usuarios tbody').outerHTML = usuario;

}


