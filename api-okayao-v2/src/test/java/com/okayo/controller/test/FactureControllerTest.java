package com.okayo.controller.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.okayo.controller.FactureController;
import com.okayo.domaine.Client;
import com.okayo.domaine.Commentaire;
import com.okayo.domaine.Emetteur;
import com.okayo.domaine.Facture;
import com.okayo.service.FactureService;

public class FactureControllerTest {
	
	@InjectMocks
	private FactureController factureController;
	
	@Mock
	private FactureService factureService;
	
	Client client = new Client();
	Emetteur emetteur = new Emetteur();
	Commentaire commentaire = new Commentaire();
	
	@Test
	private void findAllFactureTest() {
		// Création de 3 factures
		Facture facture1 = new Facture(new Date(), new Date(), "OUVERT", client, emetteur, commentaire);
		Facture facture2 = new Facture(new Date(), new Date(), "FERME", client, emetteur, commentaire);
		
		List<Facture> list = new ArrayList<Facture>();
		
		list.add(facture1);
		list.add(facture2);
		
		when(factureService.getAllFacture()).thenReturn(list);
		
		// when
		List<Facture> factureResultat = factureController.getAllFacture();
		
		// then
		assertThat(factureResultat.size()).isEqualTo(2);
		
	}
	
}
