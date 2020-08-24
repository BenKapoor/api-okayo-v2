package com.okayo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.okayo.domaine.Facture;
import com.okayo.service.FactureService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author benja
 * Controller de Facture
 */
@RestController
@RequestMapping(path = "/facture")
public class FactureController {

	@Autowired
	private FactureService factureService;
	
	/**
	 * @param facture
	 * @return
	 * Route du controller permettant l'ajout d'une facure
	 */
	@ApiOperation(value = "Ajouter une facture")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@PostMapping(path= "/", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> addFacture(@RequestBody Facture facture) {
		
		// ajout de la ressource
		factureService.saveFacture(facture);
		
		//Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(facture.getIdFacture())
                                    .toUri();
        
      //Send location in response
        return ResponseEntity.created(location).build();
		
	}
	
	/**
	 * @return
	 * Route du controller permettant d'afficher la liste de toutes les factures
	 */
	@ApiOperation(value = "Lister les factures")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(path="/", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Facture> getAllFacture() {
		
		return factureService.getAllFacture();
	}
	
}
