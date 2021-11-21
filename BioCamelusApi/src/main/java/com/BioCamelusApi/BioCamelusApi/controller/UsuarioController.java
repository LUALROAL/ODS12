package com.BioCamelusApi.BioCamelusApi.controller;

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioEntity;
import com.BioCamelusApi.BioCamelusApi.service.UsuarioService;


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
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    
    @GetMapping("/Usuario")
	public List<UsuarioEntity> retrieveAllUsuario() {
		return usuarioService.list();
	}

	@GetMapping("/Usuario/{id}")
	public UsuarioEntity retrieveUsuarioEntity(@PathVariable int id) throws Exception {
		Optional<UsuarioEntity> UsuarioEntity = usuarioService.getById(id);

		if (!UsuarioEntity.isPresent())
			throw new Exception("id-" + id);

		return UsuarioEntity.get();
	}

	@DeleteMapping("/Usuario/{id}")
	public void deleteUsuarioEntity(@PathVariable int id) {
		usuarioService.delete(id);
	}

	@PostMapping("/Usuario")
	public ResponseEntity<Object> createUsuarioEntity(@RequestBody UsuarioEntity UsuarioEntity) {
		UsuarioEntity savedUsuarioEntity = usuarioService.save(UsuarioEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUsuarioEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/Usuario/{id}")
	public ResponseEntity<Object> updateUsuarioEntity(@RequestBody UsuarioEntity UsuarioEntity, @PathVariable int id) {

		Optional<UsuarioEntity> UsuarioEntityOptional = usuarioService.getById(id);

		if (!UsuarioEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		UsuarioEntity.setId(id);
		
		usuarioService.save(UsuarioEntity);

		return ResponseEntity.noContent().build();
	}

}
