function eliminar(id){
	Swal.fire({
  title: "Está seguro de Eliminar?",
  text: "Este cambio no se puede revertir",
  icon: "warning",
  showCancelButton: true,
  confirmButtonColor: "#3085d6",
  cancelButtonColor: "#d33",
  confirmButtonText: "Yes, delete it!"
}).then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminar"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    Swal.fire({
      title: "Eliminar",
      text: "La Tarea ha sido Eliminada",
      icon: "success"
    }).then((ok)=>{
		if(ok){
			location.href="/listar";
		}
	});
  }
});
}
