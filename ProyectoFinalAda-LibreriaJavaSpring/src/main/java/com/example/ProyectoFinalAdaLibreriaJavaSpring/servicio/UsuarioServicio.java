package com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.dto.UsuarioRegistroDTO;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
//se extiende de registro dto y se guarda, se usa en el post de usuarioregistrocontrolador

public interface UsuarioServicio extends UserDetailsService{

    public Usuario guardar(UsuarioRegistroDTO usuarioRegistroDTO);
    public List<Usuario> listarUsuario();

}




