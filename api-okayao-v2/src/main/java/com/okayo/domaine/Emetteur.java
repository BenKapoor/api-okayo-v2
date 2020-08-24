package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author benja
 *	Classe {@link Emetteur} héritant de {@link Tiers}
 */
@Entity
@PrimaryKeyJoinColumn(name = "codeEmetteur")
public class Emetteur extends Tiers{

	private String siteInternet;
	private String logo;
	
	/**
	 * Constructeur par défaut 
	 */
	public Emetteur() {
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
	 * @param codeClient
	 * @param codeEmetteur
	 */
	public Emetteur(String typeTiers, String libelle, String rue, String codePostal, String pays, int numeroTelephone) {
		super(typeTiers, libelle, rue, codePostal, pays, numeroTelephone);
		// TODO Auto-generated constructor stub
	}

	public Emetteur(String siteInternet, String logo) {
		super();
		this.siteInternet = siteInternet;
		this.logo = logo;
	}
	
	public String getSiteInternet() {
		return siteInternet;
	}
	
	public void setSiteInternet(String siteInternet) {
		this.siteInternet = siteInternet;
	}
	
	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
}
