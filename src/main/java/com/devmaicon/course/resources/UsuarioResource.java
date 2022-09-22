package com.devmaicon.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devmaicon.course.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "maicon", "maicon@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
