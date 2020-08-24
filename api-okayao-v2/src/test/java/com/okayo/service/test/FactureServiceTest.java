package com.okayo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.okayo.dao.FactureRepository;
import com.okayo.domaine.Client;
import com.okayo.domaine.Commentaire;
import com.okayo.domaine.Emetteur;
import com.okayo.domaine.Facture;
import com.okayo.service.FactureService;

public class FactureServiceTest {

	@Mock
	private FactureRepository factureRepository;
	
	@Autowired
	@InjectMocks
	private FactureService factureService;
	
	@BeforeEach
	public void setupMock() {
		MockitoAnnotations.initMocks(this); // Cette méthode initialise également les objets simulés lors de
											// l'initialisation des tests junit.
	}
	Client client = new Client();
	Emetteur emetteur = new Emetteur();
	Commentaire commentaire = new Commentaire();
	
	@Test
	public void saveFactuteTest() {
		Facture facture = new Facture();
		facture.setClient(client);
		facture.setCommentaire(commentaire);
		facture.setDateEcheance(new Date());
		facture.setDateFacturation(new Date());
		facture.setEmetteur(emetteur);
		facture.setStatutFacture("OUVERT");
		
		factureService.saveFacture(facture);
		
		verify(factureRepository, times(1)).save(facture);
		
	}
	
	@Test
	public void getAllFactureTest() {
		List<Facture>list = new ArrayList<Facture>();
		
		// Création de 3 factures
		Facture facture1 = new Facture(new Date(), new Date(), "OUVERT", client, emetteur, commentaire);
		Facture facture2 = new Facture(new Date(), new Date(), "FERME", client, emetteur, commentaire);
		Facture facture3 = new Facture(new Date(), new Date(), "EN ATTENTE", client, emetteur, commentaire);
		
		// Ajout des factures à la liste
		list.add(facture1);
		list.add(facture2);
		list.add(facture3);
		
		when(factureService.getAllFacture()).thenReturn(list);
		
		// test
		List<Facture> listFacture = factureRepository.findAll();
		
		assertEquals(3, listFacture.size());
		verify(factureRepository, times(1)).findAll();
	}
	
	@Test
	public void getFactureByIdTest() {
		Integer factureId = new Integer(1);
		
		Facture facture = new Facture();
		facture.setClient(client);
		facture.setCommentaire(commentaire);
		facture.setDateEcheance(new Date());
		facture.setDateFacturation(new Date());
		facture.setEmetteur(emetteur);
		facture.setIdFacture(factureId);
		facture.setStatutFacture("OUVERT");
		
		when(factureService.getByIdFacture(factureId)).thenReturn(facture);
		
		//test
		Facture factureTest = factureRepository.getOne(factureId);
		
		verify(factureRepository, times(1)).getOne(factureId);
		assertEquals(facture, factureTest);

		assertEquals("OUVERT", factureTest.getStatutFacture());
	}
}
