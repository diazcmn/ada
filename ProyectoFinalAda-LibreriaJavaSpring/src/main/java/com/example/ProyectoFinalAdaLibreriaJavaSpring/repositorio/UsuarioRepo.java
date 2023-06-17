package com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public class UsuarioRepo extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String correo);
}
