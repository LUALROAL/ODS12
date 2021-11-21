package com.BioCamelusApi.BioCamelusApi.controller;



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

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioIncentivoEntity;
import com.BioCamelusApi.BioCamelusApi.service.UsuarioIncentivoService;

@RestController
public class UsuarioIncentivoController {

    @Autowired
    UsuarioIncentivoService usuarioIncentivoService;

    
    @GetMapping("/usuarioIncentivo")
	public List<UsuarioIncentivoEntity> retrieveAllusuarioIncentivo() {
		return usuarioIncentivoService.list();
	}

	@GetMapping("/usuarioIncentivo/{id}")
	public UsuarioIncentivoEntity retrieveUsuarioIncentivoEntity(@PathVariable int id) throws Exception {
		Optional<UsuarioIncentivoEntity> UsuarioIncentivoEntity = usuarioIncentivoService.getById(id);

		if (!UsuarioIncentivoEntity.isPresent())
			throw new Exception("id-" + id);

		return UsuarioIncentivoEntity.get();
	}

	@DeleteMapping("/usuarioIncentivo/{id}")
	public void deleteUsuarioIncentivoEntity(@PathVariable int id) {
		usuarioIncentivoService.delete(id);
	}

	@PostMapping("/usuarioIncentivo")
	public ResponseEntity<Object> createUsuarioIncentivoEntity(@RequestBody UsuarioIncentivoEntity UsuarioIncentivoEntity) {
		UsuarioIncentivoEntity savedUsuarioIncentivoEntity = usuarioIncentivoService.save(UsuarioIncentivoEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUsuarioIncentivoEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/usuarioIncentivo/{id}")
	public ResponseEntity<Object> updateUsuarioIncentivoEntity(@RequestBody UsuarioIncentivoEntity UsuarioIncentivoEntity, @PathVariable int id) {

		Optional<UsuarioIncentivoEntity> UsuarioIncentivoEntityOptional = usuarioIncentivoService.getById(id);

		if (!UsuarioIncentivoEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		UsuarioIncentivoEntity.setId(id);
		
		usuarioIncentivoService.save(UsuarioIncentivoEntity);

		return ResponseEntity.noContent().build();
	}

}
