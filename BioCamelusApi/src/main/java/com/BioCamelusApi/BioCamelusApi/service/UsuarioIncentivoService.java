package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioIncentivoEntity;
import com.BioCamelusApi.BioCamelusApi.repository.UsuarioIncentivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioIncentivoService {
    @Autowired
    UsuarioIncentivoRepository usuarioIncentivoRepository;

    public List<UsuarioIncentivoEntity> list() {
        return usuarioIncentivoRepository.findAll();
    }

    public Optional<UsuarioIncentivoEntity> getById(int id) {
        return usuarioIncentivoRepository.findById(id);
    }

    public UsuarioIncentivoEntity save(UsuarioIncentivoEntity UsuarioIncentivo) {
        return usuarioIncentivoRepository.save(UsuarioIncentivo);
    }

    public void update(UsuarioIncentivoEntity UsuarioIncentivo) {
        usuarioIncentivoRepository.save(UsuarioIncentivo);
    }

    public void delete(int id) {
        usuarioIncentivoRepository.deleteById(id);
    }

}

