package com.example.RegistroPersona.repositorio;

import com.example.RegistroPersona.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String correo);
}
