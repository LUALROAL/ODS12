package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.PuntoAcopioEntity;
import com.BioCamelusApi.BioCamelusApi.repository.PuntoAcopioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PuntoAcopioService {
    @Autowired
    PuntoAcopioRepository puntoAcopioRepository;

    public List<PuntoAcopioEntity> list() {
        return puntoAcopioRepository.findAll();
    }

    public Optional<PuntoAcopioEntity> getById(int id) {
        return puntoAcopioRepository.findById(id);
    }

    public PuntoAcopioEntity save(PuntoAcopioEntity puntoAcopio) {
        return puntoAcopioRepository.save(puntoAcopio);
    }

    public void update(PuntoAcopioEntity puntoAcopio) {
        puntoAcopioRepository.save(puntoAcopio);
    }

    public void delete(int id) {
        puntoAcopioRepository.deleteById(id);
    }

}

