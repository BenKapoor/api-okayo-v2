package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author benja
 * Classe {@link Prestation}
 */
@Entity
public class Prestation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPrestation;
	private String Labelle;
	
	/**
	 * Constructeur par défaut 
	 */
	public Prestation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prestation(String labelle) {
		super();
		Labelle = labelle;
	}
	
	public int getIdPrestation() {
		return idPrestation;
	}
	
	public void setIdPrestation(int idPrestation) {
		this.idPrestation = idPrestation;
	}
	
	public String getLabelle() {
		return Labelle;
	}
	
	public void setLabelle(String labelle) {
		Labelle = labelle;
	}
}
