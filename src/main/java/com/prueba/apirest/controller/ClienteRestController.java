package com.prueba.apirest.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.apirest.bean.Usuario;
import com.prueba.apirest.bus.AccesoBus;
import com.prueba.apirest.util.Constantes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
@Api(value = "Acceso")
public class ClienteRestController {
	
	private final Logger log = LoggerFactory.getLogger(ClienteRestController.class);
	
	@Autowired
	private AccesoBus accesoBus;
	
	@ApiOperation(value = "Validar Usuario", tags="seguridad")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Consulta exitosa!"),
			@ApiResponse(code = 500, message = "Error al realizar la consulta en la base de datos!")
	})
	@GetMapping("/validarUsuario/{usuario}")
	public ResponseEntity<?> validarUsuario(@PathVariable String usuario){
		
		Map<String, Object> response = new HashMap<>();
		Usuario usu = null;
		
		try {
			
			usu = accesoBus.validarUsuario(usuario);
			
		} catch(DataAccessException e) {
			
			response.put(Constantes.MENSAJE_RETORNO, "Error al realizar la consulta!");
			response.put(Constantes.ERROR, e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Usuario>(usu, HttpStatus.OK);
				
	}
	
}
