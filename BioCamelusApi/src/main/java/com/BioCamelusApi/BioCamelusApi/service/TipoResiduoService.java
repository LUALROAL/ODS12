package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.TipoResiduoEntity;
import com.BioCamelusApi.BioCamelusApi.repository.TipoResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class TipoResiduoService {
    @Autowired
    TipoResiduoRepository tipoResiduoRepository;

    public List<TipoResiduoEntity> list() {
        return tipoResiduoRepository.findAll();
    }

    public Optional<TipoResiduoEntity> getById(int id) {
        return tipoResiduoRepository.findById(id);
    }

    public TipoResiduoEntity save(TipoResiduoEntity TipoResiduo) {
        return tipoResiduoRepository.save(TipoResiduo);
    }

    public void update(TipoResiduoEntity TipoResiduo) {
        tipoResiduoRepository.save(TipoResiduo);
    }

    public void delete(int id) {
        tipoResiduoRepository.deleteById(id);
    }

}

