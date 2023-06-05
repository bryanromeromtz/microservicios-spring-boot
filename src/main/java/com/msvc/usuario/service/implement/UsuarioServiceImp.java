package com.msvc.usuario.service.implement;

import com.msvc.usuario.entity.Usuario;
import com.msvc.usuario.repository.UsuarioRepository;
import com.msvc.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        String randomUUID = UUID.randomUUID().toString();
        usuario.setUserId(randomUUID);
        String nombre = "Bryan Sakilla";
        usuario.setNombre(nombre);
        String email = "cryptomtz@hotmail.com";
        usuario.setEmail(email);
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsiario(String id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado con el ID: " + id));
    }
}
