package com.collection.toy.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collection.toy.dtos.ToyCollectionDTO;
import com.collection.toy.entities.ToyEntity;
import com.collection.toy.services.ToyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("toy")
public class ToyController {
	
	@Autowired
	private ToyService toyService;
	
	
	@Operation(summary = "Cria um novo usuário", description = "Adiciona um usuário com nome e idade")
    @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso",
                 content = @Content(schema = @Schema(implementation = ToyEntity.class)))
    @ApiResponse(responseCode = "400", description = "Dados inválidos")
	@PostMapping("/create")
	public ToyCollectionDTO createNewToy(@ModelAttribute ToyCollectionDTO toyDTO) throws IOException {
		return toyService.createToy(toyDTO);
	} 
	
}
