package com.BioCamelusApi.BioCamelusApi.controller;

import com.BioCamelusApi.BioCamelusApi.entity.PuntoAcopioEntity;
import com.BioCamelusApi.BioCamelusApi.service.PuntoAcopioService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class PuntoAcopioController {

    @Autowired
    PuntoAcopioService puntoAcopioService;

    
    @GetMapping("/puntoAcopio")
	public List<PuntoAcopioEntity> retrieveAllpuntoAcopio() {
		return puntoAcopioService.list();
	}

	@GetMapping("/puntoAcopio/{id}")
	public PuntoAcopioEntity retrievepuntoAcopioEntity(@PathVariable int id) throws Exception {
		Optional<PuntoAcopioEntity> puntoAcopioEntity = puntoAcopioService.getById(id);

		if (!puntoAcopioEntity.isPresent())
			throw new Exception("id-" + id);

		return puntoAcopioEntity.get();
	}

	@DeleteMapping("/puntoAcopio/{id}")
	public void deletepuntoAcopioEntity(@PathVariable int id) {
		puntoAcopioService.delete(id);
	}

	@PostMapping("/puntoAcopio")
	public ResponseEntity<Object> createpuntoAcopioEntity(@RequestBody PuntoAcopioEntity puntoAcopioEntity) {
		PuntoAcopioEntity savedpuntoAcopioEntity = puntoAcopioService.save(puntoAcopioEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedpuntoAcopioEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/puntoAcopio/{id}")
	public ResponseEntity<Object> updatepuntoAcopioEntity(@RequestBody PuntoAcopioEntity puntoAcopioEntity, @PathVariable int id) {

		Optional<PuntoAcopioEntity> puntoAcopioEntityOptional = puntoAcopioService.getById(id);

		if (!puntoAcopioEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		puntoAcopioEntity.setId(id);
		
		puntoAcopioService.save(puntoAcopioEntity);

		return ResponseEntity.noContent().build();
	}

}
