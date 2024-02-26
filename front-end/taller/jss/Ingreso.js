var url = "http://localhost:8080/api/v1/ingreso/";

function listarIngreso() {
  //METODO PARA LISTAR LOS CLIENTES
  //SE CREA LA PETICION AJAX
  $.ajax({
    url: url,
    type: "GET",
    success: function (result) {
      //success: funcion que se ejecuta
      //cuando la peticion tiene exito
      console.log(result);

      var cuerpoTabla = document.getElementById("cuerpoTabla");
      //Se limpia el cuepro de la tabla
      cuerpoTabla.innerHTML = "";
      //se hace un ciclo que recorra l arreglo con los datos
      for (var i = 0; i < result.length; i++) {
        //UNA ETIQUETA tr por cada registro
        var trResgistro = document.createElement("tr");

        var celdaId = document.createElement("td");
        let celdaPaciente = document.createElement("td")
        let celdaMedico = document.createElement("td")
        let celdaHabitacion = document.createElement("td")
        let celdaCama = document.createElement("td")
        let celdaFechaIngreso = document.createElement("td")
        let celdaFechaSalida = document.createElement("td")
        let celdaEstado = document.createElement("td")

        let celdaOpcion = document.createElement("td");
        let botonEditarMedico = document.createElement("button")
        botonEditarMedico.innerHTML = "Editar"
        botonEditarMedico.className = "btn btn-warning"

        let botonDesahabilitarMedico = document.createElement("button")
        botonDesahabilitarMedico.innerHTML = "Desahabilitar"
        botonDesahabilitarMedico.className = "btn btn-danger"

        celdaId.innerText = result[i]["id_ingreso"];
        celdaPaciente.innerText = result[i]["paciente"]["primer_nombre"]+" "+result[i]["paciente"]["segundo_nombre"]+" "+result[i]["paciente"]["primer_apellido"]+" "+result[i]["paciente"]["segundo_apellido"];
        celdaMedico.innerText = result[i]["medico"]["primer_nombre"]+" "+result[i]["medico"]["segundo_nombre"]+" "+result[i]["medico"]["primer_apellido"]+" "+result[i]["medico"]["segundo_apellido"];
        celdaHabitacion.innerText = result[i]["habitacion"];
        celdaCama.innerText = result[i]["cama"];
        celdaFechaIngreso.innerText = result[i]["fecha_ingreso"];
        celdaFechaSalida.innerText = result[i]["fecha_salida"];
        celdaEstado.innerText = result[i]["estado"];


        trResgistro.appendChild(celdaId);
        trResgistro.appendChild(celdaPaciente);
        trResgistro.appendChild(celdaMedico);
        trResgistro.appendChild(celdaHabitacion);
        trResgistro.appendChild(celdaCama);
        trResgistro.appendChild(celdaFechaIngreso);
        trResgistro.appendChild(celdaFechaSalida);
        trResgistro.appendChild(celdaEstado);


        celdaOpcion.appendChild(botonEditarMedico);
        trResgistro.appendChild(celdaOpcion)

        celdaOpcion.appendChild(botonDesahabilitarMedico);
        trResgistro.appendChild(celdaOpcion)

        cuerpoTabla.appendChild(trResgistro);


        //creamos un td por cada campo de resgistro

      }
    },
    error: function (error) {
      /*
      ERROR: funcion que se ejecuta cuando la peticion tiene un error
      */
      alert("Error en la petición " + error);
    }
  })
}

function registrarIngreso() {

  let formData = {
    "paciente": document.getElementById("paciente").value,
    "medico": document.getElementById("medico").value,
    "habitacion": document.getElementById("habitacion").value,
    "cama": document.getElementById("cama").value,
    "fecha_ingreso": document.getElementById("fecha_ingreso").value,
    "fecha_salida": document.getElementById("fecha_salida").value,
    "estado": document.getElementById("estado").value

  };

  if (validarCampos()) {
    $.ajax({
      url: url,
      type: "POST",
      data: formData,
      success: function (result) {
        //
        Swal.fire({
          title: "¡Excelente!",
          text: "Se guardó correctamente",
          icon: "success"
        });
      },
    })
  } else {
    Swal.fire({
      title: "¡Error!",
      text: "Llene todos los campos correctamente",
      icon: "error"
    });
  }
}

//se ejecuta la peticion


function validarCampos() {
  var habitacion = document.getElementById("habitacion");
  return validarHabitacion(habitacion);
}
function validarHabitacion(cuadroNumero) {
  /*
  numero documento 
  min=5
  max=11
  numero entero

  si cumple, se cambia color a verde
  si no, se cambia a rojo
  */
  var valor = cuadroNumero.value;
  var valido = true;
  if (valor.length < 1 || valor.length > 2) {
    valido = false
  }

  if (valido) {
    //cuadro de texto cumple
    cuadroNumero.className = "form-control is-valid";
  } else {
    //cuadro de texto no cumple
    cuadroNumero.className = "form-control is-invalid";
  }
  return valido;

}