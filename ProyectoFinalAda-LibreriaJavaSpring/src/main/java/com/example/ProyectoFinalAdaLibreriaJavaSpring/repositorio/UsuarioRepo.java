package com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UsuarioRepo extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String email);

}
