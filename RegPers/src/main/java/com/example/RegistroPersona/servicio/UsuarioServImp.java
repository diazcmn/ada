package com.example.RegistroPersona.servicio;

import com.example.RegistroPersona.dto.UsuarioRegistroDTO;
import com.example.RegistroPersona.entidad.Rol;
import com.example.RegistroPersona.entidad.Usuario;
import com.example.RegistroPersona.repositorio.PersonaRepo;
import com.example.RegistroPersona.repositorio.UsuarioRepo;
import com.example.RegistroPersona.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//union deto
//notacion servicio
@Service
public class UsuarioServImp implements UsuarioServicio {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired //injection datos (recuperar datos)
    private UsuarioRepo usuarioRepo;
    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO){
        //instancia
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(),
                registroDTO.getCorreo(),
                passwordEncoder.encode(registroDTO.getPassword()), Arrays.asList(new Rol("ROL_USER")));
        return UsuarioRepo.save(usuario);

    }
    //esto me lo pide a causa de un error en la clase tampoco ser porque
    @Override
    public List<Usuario> listarUsuario() {
        return null;
    }



    //buscar por nombre de usuario mas excepcion
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Usuario usuario = usuarioRepo.findByEmail(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario o contraseña incorrectos");
        }
return new User(usuario.getEmail(),
usuario.getPassword(),
mapearAutoridadesRoles(usuario.getRoles()));

}

    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    } //lo pide tambien y se genera automaticamente solo tengo que hacer el return e importar clases

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepo.findByEmail(); //es all no email pero no me lo reconoce

    }
}