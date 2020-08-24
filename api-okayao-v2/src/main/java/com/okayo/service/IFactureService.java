package com.okayo.service;

import java.util.List;

import com.okayo.domaine.Facture;

/**
 * @author benja
 *	Interface du service lié à la Facture listant les méthodes disponibles
 */
public interface IFactureService {
	public Facture saveFacture(Facture facture);
	
	public List<Facture> getAllFacture();
	
	public Facture getByIdFacture(int id);
}
