/**
 * 
 */
package com.okayo.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author benja
 *	Classe {@link Client} héritant de {@link Tiers}
 */
@Entity
public class Client extends Tiers {

	/**
	 * Constructeur par défaut 
	 */
	public Client() {
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
	public Client(String typeTiers, String libelle, String rue, String codePostal, String pays, int numeroTelephone) {
		super(typeTiers, libelle, rue, codePostal, pays, numeroTelephone);
		// TODO Auto-generated constructor stub
	}

}
