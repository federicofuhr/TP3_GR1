document.addEventListener("DOMContentLoaded", init);

function init() {
    "use strict";
    let data = null;
    getData();
    let table = $('#myTable').DataTable( {});
    async function getData() {
        let r = await fetch("rest/estudiantes/listaEstudiantes");
        let json =	 await r.json();
        data = await json;
        showData(data);
    }
   	document.querySelector("#eGenero").addEventListener("click", getEstudiantesByGenero);
    async function getEstudiantesByGenero() {
        event.preventDefault();
	    let genero = document.querySelector("#genero").value;
        let r = await fetch("rest/estudiantes/genero?genero="+genero);
        let json = await r.json();
        data = await json;
        showData(data);
    }
    document.querySelector("#eCarreraResidencia").addEventListener("click", getEstudianteByCarreraResidencia)
    async function getEstudianteByCarreraResidencia() {
        event.preventDefault();
        let carrera = document.querySelector("#carrera").value;
        let ciudad = document.querySelector("#ciudad").value;
        let r = await fetch("rest/estudiantes/listaEstudiantesCarrerasResidencia?carrera="+carrera+"&ciudad="+ciudad);
        let json = await r.json();
        data = await json;
        showData(data);
    }
// boton id="eLegajo"
    document.querySelector("#eLegajo").addEventListener("click", getEstudianteByLegajo)
    async function getEstudianteByLegajo() {
        event.preventDefault();
	    let legajo = document.querySelector("#legajo").value;
        let r = await fetch("rest/estudiantes/obtenerEstudiante?id="+legajo);
        let json = await r.json();
        data = await json;
        console.log(data);
        showData(data);
    }
    async function showData(data){
    	table.destroy();
    	table = $('#myTable').DataTable( {
     	data : data,
	    columns: [
	        { data: 'legajo' },
	        { data: 'nombre' },
	        { data: 'apellido' },
	        { data: 'edad' },
	        { data: 'genero' },
	        { data: 'dni' },
	        { data: 'ciudad_residencia' }
		]
		});
    }
}