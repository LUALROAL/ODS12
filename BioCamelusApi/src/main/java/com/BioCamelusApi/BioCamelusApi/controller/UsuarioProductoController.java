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

import com.BioCamelusApi.BioCamelusApi.entity.UsuarioProductoEntity;
import com.BioCamelusApi.BioCamelusApi.service.UsuarioProductoService;

@RestController
public class UsuarioProductoController {

    @Autowired
    UsuarioProductoService usuarioProductoService;

    
    @GetMapping("/usuarioProducto")
	public List<UsuarioProductoEntity> retrieveAllusuarioProducto() {
		return usuarioProductoService.list();
	}

	@GetMapping("/usuarioProducto/{id}")
	public UsuarioProductoEntity retrieveUsuarioProductoEntity(@PathVariable int id) throws Exception {
		Optional<UsuarioProductoEntity> UsuarioProductoEntity = usuarioProductoService.getById(id);

		if (!UsuarioProductoEntity.isPresent())
			throw new Exception("id-" + id);

		return UsuarioProductoEntity.get();
	}

	@DeleteMapping("/usuarioProducto/{id}")
	public void deleteUsuarioProductoEntity(@PathVariable int id) {
		usuarioProductoService.delete(id);
	}

	@PostMapping("/usuarioProducto")
	public ResponseEntity<Object> createUsuarioProductoEntity(@RequestBody UsuarioProductoEntity UsuarioProductoEntity) {
		UsuarioProductoEntity savedUsuarioProductoEntity = usuarioProductoService.save(UsuarioProductoEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUsuarioProductoEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/usuarioProducto/{id}")
	public ResponseEntity<Object> updateUsuarioProductoEntity(@RequestBody UsuarioProductoEntity UsuarioProductoEntity, @PathVariable int id) {

		Optional<UsuarioProductoEntity> UsuarioProductoEntityOptional = usuarioProductoService.getById(id);

		if (!UsuarioProductoEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		UsuarioProductoEntity.setId(id);
		
		usuarioProductoService.save(UsuarioProductoEntity);

		return ResponseEntity.noContent().build();
	}

}
