$(document).ready(function () {
  mostrarTodos();


  $('#AgregarPaciente').click(function (e) {
    e.preventDefault();
    var data;
    var url = "http://localhost:8090/pacientes/guardar";

   
      
        data = JSON.stringify({           
          //id: $('#id_p').val(),
          nombre: $('#nombre').val(),
          app: $('#app').val(),
          apm: $('#apm').val(),
          curp: $('#curp').val(),
          fechaNac: $('#fechaNac').val(),
          nss: $('#nss').val(),
          sexo: $('#sexo').val(),
          tipoSangre: $('#tipoSangre').val()
        });

        console.log(data.fechaNacimiento);
        

        $.ajax({
          method: "POST",
          url: url,
          data: data,
          dataType: 'json',
          contentType: "application/json",
          success: function (data) {
            console.log('Rellenando la tabla');
            clearModal();
            mostrarTodos();
            $('.alert-success').html('Se añadio el paciente').fadeIn().delay(4000).fadeOut('snow');

          },
          error: function (errors) {
            $('.alert-success').html('No fue posible añadir el paciente').fadeIn().delay(4000).fadeOut('snow');
            console.log(errors);
          }
        });
  });

function clearModal() {
  $("#nombre").val("");
  $('#app').val("");
  $('#apm').val("");
  $('#curp').val("");
  $('#fechaNac').val("");
  $('#nss').val("");
  $('#sexo').val("M");
  $('#tipoSangre').val("A+");
}

  $("#btnEditarPaciente").click(function (e) {
    e.preventDefault();
    var url = "http://localhost:8090/pacientes/actualizar";
    var data = JSON.stringify({
      pacienteId: $('#edit_id').val(),
      nombre: $('#edit_nombre').val(),
      app: $('#edit_app').val(),
      apm: $('#edit_apm').val(),
      curp: $('#edit_curp').val(),
      fechaNac: $('#edit_fechaNac').val(),
      nss: $('#edit_nss').val(),
      sexo: $('#edit_sexo').val(),
      tipoSangre: $('#edit_tipoSangre').val()
    });

    $.ajax({
      type: 'PUT',
      url: url,
      data: data,
      dataType: 'json',
      contentType: "application/json; charset=utf-8",
      success: function (data) {
        mostrarTodos();
        $('.alert-warning').html('Se editó el paciente').fadeIn().delay(4000).fadeOut('snow');
        console.log("Actualizado correctamente")
      },
      error: function (errors) {
        $('.alert-warning').html('No se pudo editar el paciente').fadeIn().delay(4000).fadeOut('snow');
        console.log(errors);
      }
    });
  });

  $("#busqueda").keyup(function (e) {
    var keyword = $("#busqueda").val();
    console.log(keyword);

    var url = "http://localhost:8081/CrudHibernate/CrudHibernate/Malcom/busquedaTiempoReal";
    var data = JSON.stringify({
      nombre: keyword
    });

    $.ajax({
      method: "POST",
      url: url,
      data: data,
      dataType: 'json',
      contentType: "application/json",
      success: function (response, data) {
        console.log('Rellenando la tabla de supers');
        
        //console.log('response' + response.nombre);
        $("tbody").children().remove();
        
          
          for (i = 0; i < response.length; i++) {
            console.log(response[i].id + ' ' + response[i].nombre + ' ' +
              response[i].app + ' ' + response[i].caracteristica);
            $("#tablaEmpleado").append(
              '<tr><td>' + response[i].id + '</td><td>' +
              response[i].nombre + '</td><td>'
              + response[i].app + '</td><td>'
              + response[i].caracteristica + '</td><td>'
              + '<button type="button" class="btn btn-warning col-sm-4" id="btnEditarPaciente" onclick="showEditModal(' + response[i].id + ')"><i class="fa fa-edit"></i></button><button type="button" class="btn btn-danger col-sm-4 float-right" onclick="eliminarPaciente(' + response[i].id + ')"><i class="fa fa-ban"></i></button></td></tr>');
          }            
      },
      error: function (errors) {
        
        console.log(errors);
      }
    });
  });

});

function showEditModal(e) {
  var url = "http://localhost:8090/pacientes/buscar-por-id/"+e;

  $.ajax({
    method: "GET",
    url: url,
    dataType: 'json',
    success: function (response, data) {
      console.log('Rellenando el formulario para editar');
      //console.log('response' + response.nombre);

      $('#edit_id').val(response.pacienteId);
      $('#edit_nombre').val(response.nombre);
      $('#edit_app').val(response.app);
      $('#edit_apm').val(response.apm);
      $('#edit_curp').val(response.curp);
      $('#edit_fechaNac').val(response.fechaNac);
      $('#edit_nss').val(response.nss);
      $('#edit_sexo').val(response.sexo);
      $('#edit_tipoSangre').val(response.tipoSangre);

      $('#modalEditar').modal("show");
    },
    error: function (errors) {
      console.log(errors);
    }
  });

}


function eliminarPaciente(e) {
  swal({
    title: "¿Está seguro?",
    text: "Esta acción es irreversible",
    icon: "warning",
    buttons: ["Cancelar", "Eliminar"],
    dangerMode: true,
    closeModal: false,
  }).then(function (data) {
    if (data) {
      var url = "http://localhost:8090/pacientes/eliminar/"+e;
      $.ajax({

        type: 'DELETE',
        url: url,
        data: data,
        success: function () {
          $('.alert-danger').html('Se eliminó de la base de datos').fadeIn().delay(4000).fadeOut('snow');
          swal("Eliminado correctamente", "success");
          mostrarTodos();
        },
        error: function (errors) {          
          $('.alert-danger').html('No fue posible eliminar este personaje.').fadeIn().delay(4000).fadeOut('snow');
          swal("Hubo un error al eliminar este empleado");
          mostrarTodos();
        }
      });
    } else {
      console.log("HOLA 4");
      swal("Cancelado", "Se canceló la operación", "error");
      mostrarTodos();
    }
  });
}


function mostrarTodos() {
  $.get("http://localhost:8090/pacientes/mostrar-todos", function (response, state) {
    //$("#proveedor").empty();
    $("tbody").children().remove();
    for (i = 0; i < response.length; i++) {
      console.log(response[i].pacienteId + ' ' + response[i].nombre + ' ' + response[i].app + ' ' + response[i].apm + ' ' +
        response[i].curp + ' ' + response[i].fechaNac + '' +response[i].nss + '' +response[i].sexo + '' +response[i].tipoSangre);
      
      $('#tablaPaciente').append(
        '<tr><td>' + response[i].pacienteId + '</td><td>' +
        response[i].nombre + '</td><td>'
        + response[i].app + '</td><td>'
        + response[i].apm + '</td><td>'
        + response[i].curp + '</td><td>'
        + response[i].fechaNac + '</td><td>'
        + response[i].nss + '</td><td>'
        + response[i].sexo + '</td><td>'
        + response[i].tipoSangre + '</td><td>'
        + '<button type="button" class="btn btn-warning col-sm-4" id="btnEditarPaciente" onclick="showEditModal(' + response[i].pacienteId + ')"><i class="fa fa-edit"></i></button></td><td><button type="button" class="btn btn-danger col-sm-4 float-right" onclick="eliminarPaciente(' + response[i].pacienteId + ')"><i class="fa fa-ban"></i></button></td></tr>');
    }
  }, 'json');
}
