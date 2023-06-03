package com.example.RegistroPersona.servicio;

import com.example.RegistroPersona.dto.UsuarioRegistroDTO;
import com.example.RegistroPersona.entidad.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
//se extiende de registro dto y se guarda, se usa en el post de usuarioregistrocontrolador

public interface UsuarioServicio extends UserDetailsService{

    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    public List<Usuario> listarUsuario();

}













