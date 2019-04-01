package com.itinajero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itinajero.api.Entity.Usuario;
import com.itinajero.api.services.IUsuarioServices;


@RestController
@RequestMapping("/api")
public class UsuariosController {

	
	@Autowired
	public IUsuarioServices usuarioServices;
	
	@GetMapping("/usuarios")
	public List<Usuario> buscarUsuarios(){
		return usuarioServices.buscarTodos();
	}
	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		usuarioServices.guardar(usuario);
		return usuario;
	} 
	
	
	
}
