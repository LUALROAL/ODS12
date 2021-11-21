package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.ResiduoEntity;
import com.BioCamelusApi.BioCamelusApi.repository.ResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ResiduoService {
    @Autowired
    ResiduoRepository residuoRepository;

    public List<ResiduoEntity> list() {
        return residuoRepository.findAll();
    }

    public Optional<ResiduoEntity> getById(int id) {
        return residuoRepository.findById(id);
    }

    public ResiduoEntity save(ResiduoEntity Residuo) {
        return residuoRepository.save(Residuo);
    }

    public void update(ResiduoEntity Residuo) {
        residuoRepository.save(Residuo);
    }

    public void delete(int id) {
        residuoRepository.deleteById(id);
    }

}

