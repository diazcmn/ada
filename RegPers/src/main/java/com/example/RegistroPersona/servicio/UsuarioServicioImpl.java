package com.example.RegistroPersona.servicio;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


import com.example.RegistroPersona.dto.UsuarioRegistroDTO;
import com.example.RegistroPersona.entidad.Rol;
import com.example.RegistroPersona.entidad.Usuario;
import com.example.RegistroPersona.repositorio.UsuarioRepositorio;
import com.example.RegistroPersona.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//Agregue la clase de impl de Usuarioservicio, encargada de guardar los usuarios con permisos
//Donde podre: crear los usuarios y guardarlos con ayuda de la clase UsuarioRegistroDTO
//Pasar un rol designado, para alojar en la bases de datos
//Configurar que el usuario este correctamente registrado con su coreo y contraseña
//Y tambien listar los usuarios registrados
@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    //Inyeccion de dependencias para encriptar la contraseña
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    //Guardamos el usuario con ayuda del dto, con el nombre, apellido, correo
    // pass encriptada y rol asignado
    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(),registroDTO.getEmail(),
                passwordEncoder.encode(registroDTO.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(usuario);
    }


    //Verificamos su registro si son validos correo o pass desde el login
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByEmail(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario o password inválidos");
        }
        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }

    //listamos usuarios registrados con permisos o roles
    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepositorio.findAll();
    }


}
