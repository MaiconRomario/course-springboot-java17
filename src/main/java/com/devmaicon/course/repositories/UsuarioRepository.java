package com.devmaicon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaicon.course.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
