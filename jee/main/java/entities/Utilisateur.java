package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Utilisateur;

	private String email_Utilisateur;

	@Column(name="mpd_utilisateur")
	private String mpdUtilisateur;

	private String nom_Utilisateur;

	private String prenom_Utilisateur;

	//bi-directional many-to-one association to CentreDeFormation
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	private List<CentreDeFormation> centreDeFormations;

	//bi-directional many-to-one association to Reclamation
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	private List<Reclamation> reclamations;

	public Utilisateur() {
	}
	public Utilisateur(String firstname,String lastname, String email, String password) {
		this.nom_Utilisateur=firstname;
		this.prenom_Utilisateur=lastname;
		this.email_Utilisateur=email;
		this.mpdUtilisateur=password;
	}
	public int getId_Utilisateur() {
		return this.id_Utilisateur;
	}

	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}

	public String getEmail_Utilisateur() {
		return this.email_Utilisateur;
	}

	public void setEmail_Utilisateur(String email_Utilisateur) {
		this.email_Utilisateur = email_Utilisateur;
	}

	public String getMpdUtilisateur() {
		return this.mpdUtilisateur;
	}

	public void setMpdUtilisateur(String mpdUtilisateur) {
		this.mpdUtilisateur = mpdUtilisateur;
	}

	public String getNom_Utilisateur() {
		return this.nom_Utilisateur;
	}

	public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}

	public String getPrenom_Utilisateur() {
		return this.prenom_Utilisateur;
	}

	public void setPrenom_Utilisateur(String prenom_Utilisateur) {
		this.prenom_Utilisateur = prenom_Utilisateur;
	}

	public List<CentreDeFormation> getCentreDeFormations() {
		return this.centreDeFormations;
	}

	public void setCentreDeFormations(List<CentreDeFormation> centreDeFormations) {
		this.centreDeFormations = centreDeFormations;
	}

	public CentreDeFormation addCentreDeFormation(CentreDeFormation centreDeFormation) {
		getCentreDeFormations().add(centreDeFormation);
		centreDeFormation.setUtilisateur(this);

		return centreDeFormation;
	}

	public CentreDeFormation removeCentreDeFormation(CentreDeFormation centreDeFormation) {
		getCentreDeFormations().remove(centreDeFormation);
		centreDeFormation.setUtilisateur(null);

		return centreDeFormation;
	}

	public List<Reclamation> getReclamations() {
		return this.reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public Reclamation addReclamation(Reclamation reclamation) {
		getReclamations().add(reclamation);
		reclamation.setUtilisateur(this);

		return reclamation;
	}

	public Reclamation removeReclamation(Reclamation reclamation) {
		getReclamations().remove(reclamation);
		reclamation.setUtilisateur(null);

		return reclamation;
	}


}