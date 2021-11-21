package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioEntity;
import com.BioCamelusApi.BioCamelusApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> list() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioEntity> getById(int id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void update(UsuarioEntity usuario) {
        usuarioRepository.save(usuario);
    }

    public void delete(int id) {
        usuarioRepository.deleteById(id);
    }

}

