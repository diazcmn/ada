package com.example.RegistroPersona.repositorio;

import com.example.RegistroPersona.entidad.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo {
    static Usuario save(Usuario usuario) {
        //este metodo me lo desde usuarioservimp para "save" usuario no se porque
        return usuario;
    }

    public Usuario findByEmail(String correo);
}
