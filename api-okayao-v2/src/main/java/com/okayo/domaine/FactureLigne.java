package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author benja
 *	Classe {@link FactureLigne}
 */
@Entity
public class FactureLigne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFactureLigne;
	
	private String designationPrestation;
	private int tva;
	private int prixUnitaireHT;
	private int quantite;
	private int reduction;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // permet d'éviter de faire une boucle infinie
	@ManyToOne
	private Facture facture;

	/**
	 * Constructeur par défaut 
	 */
	public FactureLigne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param designationPrestation
	 * @param tva
	 * @param prixUnitaireHT
	 * @param quantite
	 * @param reduction
	 * @param facture
	 */
	public FactureLigne(String designationPrestation, int tva, int prixUnitaireHT, int quantite, int reduction,
			Facture facture) {
		super();
		this.designationPrestation = designationPrestation;
		this.tva = tva;
		this.prixUnitaireHT = prixUnitaireHT;
		this.quantite = quantite;
		this.reduction = reduction;
		this.facture = facture;
	}

	public int getIdFactureLigne() {
		return idFactureLigne;
	}

	public void setIdFactureLigne(int idFactureLigne) {
		this.idFactureLigne = idFactureLigne;
	}

	public String getDesignationPrestation() {
		return designationPrestation;
	}

	public void setDesignationPrestation(String designationPrestation) {
		this.designationPrestation = designationPrestation;
	}

	public int getTva() {
		return tva;
	}

	public void setTva(int tva) {
		this.tva = tva;
	}

	public int getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(int prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getReduction() {
		return reduction;
	}

	public void setReduction(int reduction) {
		this.reduction = reduction;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}
}
