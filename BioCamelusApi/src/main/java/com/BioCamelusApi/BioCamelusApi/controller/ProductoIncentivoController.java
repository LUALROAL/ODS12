package com.BioCamelusApi.BioCamelusApi.controller;

import com.BioCamelusApi.BioCamelusApi.entity.ProductoIncentivoEntity;
import com.BioCamelusApi.BioCamelusApi.service.ProductoIncentivoService;


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
public class ProductoIncentivoController {

    @Autowired
    ProductoIncentivoService productoIncentivoService;

    
    @GetMapping("/ProductoIncentivo")
	public List<ProductoIncentivoEntity> retrieveAllProductoIncentivo() {
		return productoIncentivoService.list();
	}

	@GetMapping("/ProductoIncentivo/{id}")
	public ProductoIncentivoEntity retrieveProductoIncentivoEntity(@PathVariable int id) throws Exception {
		Optional<ProductoIncentivoEntity> ProductoIncentivoEntity = productoIncentivoService.getById(id);

		if (!ProductoIncentivoEntity.isPresent())
			throw new Exception("id-" + id);

		return ProductoIncentivoEntity.get();
	}

	@DeleteMapping("/ProductoIncentivo/{id}")
	public void deleteProductoIncentivoEntity(@PathVariable int id) {
		productoIncentivoService.delete(id);
	}

	@PostMapping("/ProductoIncentivo")
	public ResponseEntity<Object> createProductoIncentivoEntity(@RequestBody ProductoIncentivoEntity ProductoIncentivoEntity) {
		ProductoIncentivoEntity savedProductoIncentivoEntity = productoIncentivoService.save(ProductoIncentivoEntity);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedProductoIncentivoEntity.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/ProductoIncentivo/{id}")
	public ResponseEntity<Object> updateProductoIncentivoEntity(@RequestBody ProductoIncentivoEntity ProductoIncentivoEntity, @PathVariable int id) {

		Optional<ProductoIncentivoEntity> ProductoIncentivoEntityOptional = productoIncentivoService.getById(id);

		if (!ProductoIncentivoEntityOptional.isPresent())
			return ResponseEntity.notFound().build();

		ProductoIncentivoEntity.setId(id);
		
		productoIncentivoService.save(ProductoIncentivoEntity);

		return ResponseEntity.noContent().build();
	}

}
