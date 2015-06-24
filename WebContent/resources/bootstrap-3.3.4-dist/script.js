$(document).ready(
		function() {

			$('#registration-form').validate(
					{
						rules : {
							alu_doc_id : {
								required : true,
								required : true
							},

							alu_dni : {
								required : true,
								required : true,
								number: true
							},

							alu_nombre : {
								required : true,
								minlength : 2,
								maxlength: 40
							},
							
							alu_apellido : {
								required : true,
								minlength : 2,
								maxlength: 40
							},

							alu_telefono : {
								required : true
							},


							alu_email : {
								required : true,
								email : true
							},

							alu_domicilio : {
								minlength : 10,
								required : true
							},

							alu_sexo : {
								required : true
							},
							
							dia : {
								required : true
							},
							
							mes : {
								required : true
							},
							
							anio : {
								required : true
							},
							

						},
						highlight : function(element) {
							$(element).closest('.control-group').removeClass(
									'success').addClass('error');
						},
						success : function(element) {
							element.text('OK!').addClass('valid').closest(
									'.control-group').removeClass('error')
									.addClass('success');
						}
					});

		}); // end document.ready
