package com.generate.toy.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generate.toy.dtos.ToyCollectionDTO;
import com.generate.toy.entities.ToyEntity;
import com.generate.toy.services.ToyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("toy")
public class ToyController {
	
	@Autowired
	private ToyService toyService;
	
	
	@Operation(summary = "Cria um novo usuário", description = "Cria um novo usuário com os dados informados")
    @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso",
                 content = @Content(schema = @Schema(implementation = ToyEntity.class)))
    @ApiResponse(responseCode = "400", description = "Dados inválidos")
	@PostMapping("/create")
	public ToyCollectionDTO createNewToy(@ModelAttribute ToyCollectionDTO toyDTO) throws IOException {
		return toyService.createToy(toyDTO);
	} 
	
	@Operation(summary = "Atualiza um brinquedo", description = "Atualiza um brinquedo com id")
	@ApiResponse(responseCode = "200", description = "Brinquedo atualizado com sucesso",
				 content = @Content(schema = @Schema(implementation = ToyEntity.class)))
	@ApiResponse(responseCode = "400", description = "Dados inválidos")
	@PutMapping("/update/{toyId}")
	public ToyCollectionDTO updateToy(@ModelAttribute ToyCollectionDTO toyDTO,@PathVariable Long toyId) throws IOException {
		return toyService.updateOneToy(toyDTO, toyId);
	}
	
	

	@Operation(summary = "Lista Brinquedos", description = "Lista todos os brinquedos cadastrados")
	@ApiResponse(responseCode = "201", description = " Brinquedos listados com sucesso",
				 content = @Content(schema = @Schema(implementation = ToyEntity.class)))
	@ApiResponse(responseCode = "400", description = "Dados inválidos")
	@GetMapping("/list") ResponseEntity<?> getAllToys() {
		List<ToyCollectionDTO> toyList = toyService.getAllToys();
		return ResponseEntity.ok(toyList) ;
	}
	
	@DeleteMapping("/delete/{toyId}") ResponseEntity<Map<String,String>> deleteToy(@PathVariable Long toyId) throws IOException {
		 toyService.deleteToy(toyId);
		 Map<String,String> response = Map.of("message", "Brinquedo deletado com sucesso");
		 return ResponseEntity.ok(response);
	
	}
	
}
