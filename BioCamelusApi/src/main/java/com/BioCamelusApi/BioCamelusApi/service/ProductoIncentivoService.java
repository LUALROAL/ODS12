package com.BioCamelusApi.BioCamelusApi.service;

import com.BioCamelusApi.BioCamelusApi.entity.ProductoIncentivoEntity;
import com.BioCamelusApi.BioCamelusApi.repository.ProductoIncentivoRepository;
import com.BioCamelusApi.BioCamelusApi.repository.ProductoIncentivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoIncentivoService{
    @Autowired
    ProductoIncentivoRepository productoIncentivoRepository;

    public List<ProductoIncentivoEntity> list() {
        return productoIncentivoRepository.findAll();
    }

    public Optional<ProductoIncentivoEntity> getById(int id) {
        return productoIncentivoRepository.findById(id);
    }

    public ProductoIncentivoEntity save(ProductoIncentivoEntity ProductoIncentivo) {
        return productoIncentivoRepository.save(ProductoIncentivo);
    }

    public void update(ProductoIncentivoEntity ProductoIncentivo) {
        productoIncentivoRepository.save(ProductoIncentivo);
    }

    public void delete(int id) {
        productoIncentivoRepository.deleteById(id);
    }

}
