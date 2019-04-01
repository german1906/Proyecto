package com.itinajero.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itinajero.api.Entity.Usuario;
import com.itinajero.api.repository.UsuarioRepository;
import com.itinajero.api.services.IUsuarioServices;


@Service
public class UsuarioServices implements IUsuarioServices {
	
	@Autowired
	public UsuarioRepository usuarioRepo;

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return usuarioRepo.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		usuarioRepo.save(usuario);	
	}

}
