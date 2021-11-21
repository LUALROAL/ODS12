package com.BioCamelusApi.BioCamelusApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioIncentivoEntity;

@Repository
public interface UsuarioIncentivoRepository extends JpaRepository<UsuarioIncentivoEntity, Integer> {

}
