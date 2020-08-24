package com.okayo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okayo.dao.FactureRepository;
import com.okayo.domaine.Facture;

/**
 * @author benja
 *	Service de Facture
 */
@Service
public class FactureService implements IFactureService{

	@Autowired
	private FactureRepository factureRepositoy;
	
	/**
	 * Méthode permettant de sauvegarder une {@link Facture}
	 * @param Facture
	 */
	@Override
	public Facture saveFacture(Facture facture) {
		// TODO Auto-generated method stub
		return factureRepositoy.save(facture);
	}

	/**
	 * Méthode permettant de lister toutes les factures
	 */
	@Override
	public List<Facture> getAllFacture() {
		// TODO Auto-generated method stub
		return factureRepositoy.findAll();
	}

	/**
	 *	Méthdode permettant de rechercher une facture par son id
	 *	@param int id
	 */
	@Override
	public Facture getByIdFacture(int id) {
		// TODO Auto-generated method stub
		return factureRepositoy.getOne(id);
	}

}
