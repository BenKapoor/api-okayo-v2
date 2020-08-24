package com.okayo.domaine;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author benja
 * Classe {@link Facture}
 *
 */
@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFacture;
	private Date dateFacturation;
	private Date dateEcheance;
	private String statutFacture;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Emetteur emetteur;
	@OneToOne(cascade = CascadeType.ALL)
	private Commentaire commentaire;
	
	/**
	 * Constructeur par défaut 
	 */
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param dateFacturation
	 * @param dateEcheance
	 * @param statutFacture
	 * @param client
	 * @param emetteur
	 * @param commentaire
	 */
	public Facture(Date dateFacturation, Date dateEcheance, String statutFacture, Client client, Emetteur emetteur,
			Commentaire commentaire) {
		super();
		this.dateFacturation = dateFacturation;
		this.dateEcheance = dateEcheance;
		this.statutFacture = statutFacture;
		this.client = client;
		this.emetteur = emetteur;
		this.commentaire = commentaire;
	}

	public int getIdFacture() {
		return idFacture;
	}
	
	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}
	
	public Date getDateFacturation() {
		return dateFacturation;
	}
	
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	
	public Date getDateEcheance() {
		return dateEcheance;
	}
	
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	public String getStatutFacture() {
		return statutFacture;
	}
	
	public void setStatutFacture(String statutFacture) {
		this.statutFacture = statutFacture;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	public Emetteur getEmetteur() {
		return emetteur;
	}
	
	public void setEmetteur(Emetteur emetteur) {
		this.emetteur = emetteur;
	}

	public Commentaire getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
}
