package com.msvc.usuario.service;

import com.msvc.usuario.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario saveUsuario(Usuario usuario);

    List<Usuario> getAllUsuarios();

    Usuario getUsiario(String id);
}
