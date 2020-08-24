package com.okayo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okayo.domaine.Facture;

/**
 * @author benja
 *	Interface
 *	Repository de Facture
 */
public interface FactureRepository extends JpaRepository<Facture, Integer>{

}
