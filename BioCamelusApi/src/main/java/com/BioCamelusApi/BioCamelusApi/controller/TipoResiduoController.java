package com.BioCamelusApi.BioCamelusApi.controller;

import com.BioCamelusApi.BioCamelusApi.entity.TipoResiduoEntity;
import com.BioCamelusApi.BioCamelusApi.service.TipoResiduoService;



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
public class TipoResiduoController {

    @Autowired
    TipoResiduoService tipoResiduoService;

    
    @GetMapping("/tipoResiduo")
	public List<TipoResiduoEntity> retrieveAlltipoResiduo() {
		return tipoResiduoService.list();
	}

	@GetMapping("/tipoResiduo/{id}")
	public TipoResiduoEntity retrieveTipoResiduoEntity(@PathVariable int id) throws Exception {
		Optional<TipoResiduoEntity> TipoResiduoEntity = tipoResiduoService.getById(id);

		if (!TipoResiduoEntity.isPresent())
			throw new Exception("id-" + id);

		return TipoResiduoEntity.get();
	}

	@DeleteMapping("/tipoResiduo/{id}")
	public void deleteTipoResiduoEntity(@PathVariable int id) {
		tipoResiduoService.delete(id);
	}

	@PostMapping("/tipoResiduo")
	public ResponseEntity<Object> createTipoResiduoEntity(@RequestBody TipoResiduoEntity TipoResiduoEntity) {
		TipoResiduoEntity savedTipoResiduoEntity = tipoResiduoService.save(TipoResiduoEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedTipoResiduoEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/tipoResiduo/{id}")
	public ResponseEntity<Object> updateTipoResiduoEntity(@RequestBody TipoResiduoEntity TipoResiduoEntity, @PathVariable int id) {

		Optional<TipoResiduoEntity> TipoResiduoEntityOptional = tipoResiduoService.getById(id);

		if (!TipoResiduoEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		TipoResiduoEntity.setId(id);
		
		tipoResiduoService.save(TipoResiduoEntity);

		return ResponseEntity.noContent().build();
	}

}
