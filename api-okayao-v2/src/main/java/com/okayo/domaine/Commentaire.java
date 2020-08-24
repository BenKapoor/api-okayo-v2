package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author benja
 *	Classe {@link Commentaire}
 */
@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String contenu;

	/**
	 * Constructeur par défaut 
	 */
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contenu
	 */
	public Commentaire(String contenu) {
		super();
		this.contenu = contenu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
}
