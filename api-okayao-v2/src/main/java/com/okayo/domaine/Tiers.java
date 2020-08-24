package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author benja
 *	Classe {@link Tiers}
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Tiers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String typeTiers;
	private String libelle;
	private String rue;
	private String codePostal;
	private String pays;
	private int numeroTelephone;
	
	/**
	 * Constructeur par défaut 
	 */
	public Tiers() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param typeTiers
	 * @param libelle
	 * @param rue
	 * @param codePostal
	 * @param pays
	 * @param numeroTelephone
	 */
	public Tiers(String typeTiers, String libelle, String rue, String codePostal, String pays, int numeroTelephone) {
		super();
		this.typeTiers = typeTiers;
		this.libelle = libelle;
		this.rue = rue;
		this.codePostal = codePostal;
		this.pays = pays;
		this.numeroTelephone = numeroTelephone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeTiers() {
		return typeTiers;
	}
	public void setTypeTiers(String typeTiers) {
		this.typeTiers = typeTiers;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
}
