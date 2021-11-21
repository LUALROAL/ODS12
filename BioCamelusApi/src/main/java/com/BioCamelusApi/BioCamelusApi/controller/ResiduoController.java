package com.BioCamelusApi.BioCamelusApi.controller;

import com.BioCamelusApi.BioCamelusApi.entity.ResiduoEntity;
import com.BioCamelusApi.BioCamelusApi.service.ResiduoService;


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
public class ResiduoController {

    @Autowired
    ResiduoService residuoService;

    
    @GetMapping("/Residuo")
	public List<ResiduoEntity> retrieveAllResiduo() {
		return residuoService.list();
	}

	@GetMapping("/Residuo/{id}")
	public ResiduoEntity retrieveResiduoEntity(@PathVariable int id) throws Exception {
		Optional<ResiduoEntity> ResiduoEntity = residuoService.getById(id);

		if (!ResiduoEntity.isPresent())
			throw new Exception("id-" + id);

		return ResiduoEntity.get();
	}

	@DeleteMapping("/Residuo/{id}")
	public void deleteResiduoEntity(@PathVariable int id) {
		residuoService.delete(id);
	}

	@PostMapping("/Residuo")
	public ResponseEntity<Object> createResiduoEntity(@RequestBody ResiduoEntity ResiduoEntity) {
		ResiduoEntity savedResiduoEntity = residuoService.save(ResiduoEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedResiduoEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/Residuo/{id}")
	public ResponseEntity<Object> updateResiduoEntity(@RequestBody ResiduoEntity ResiduoEntity, @PathVariable int id) {

		Optional<ResiduoEntity> ResiduoEntityOptional = residuoService.getById(id);

		if (!ResiduoEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		ResiduoEntity.setId(id);
		
		residuoService.save(ResiduoEntity);

		return ResponseEntity.noContent().build();
	}

}
