package com.enade.enade.repository;

import org.springframework.data.repository.CrudRepository;

import com.enade.enade.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}
