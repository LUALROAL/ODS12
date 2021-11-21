package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioProductoEntity;
import com.BioCamelusApi.BioCamelusApi.repository.UsuarioProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioProductoService {
    @Autowired
    UsuarioProductoRepository usuarioProductoRepository;

    public List<UsuarioProductoEntity> list() {
        return usuarioProductoRepository.findAll();
    }

    public Optional<UsuarioProductoEntity> getById(int id) {
        return usuarioProductoRepository.findById(id);
    }

    public UsuarioProductoEntity save(UsuarioProductoEntity UsuarioProducto) {
        return usuarioProductoRepository.save(UsuarioProducto);
    }

    public void update(UsuarioProductoEntity UsuarioProducto) {
        usuarioProductoRepository.save(UsuarioProducto);
    }

    public void delete(int id) {
        usuarioProductoRepository.deleteById(id);
    }

}

