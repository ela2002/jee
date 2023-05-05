package model;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Utilisateur;

/**
 * Session Bean implementation class LoginManager
 */
@Stateless
@LocalBean
public class LoginManager {

	@PersistenceContext(unitName="Pathfinder")
	private EntityManager em;
	
    public LoginManager() {
        // TODO Auto-generated constructor stub
    }
    
    public Utilisateur login(String username, String password) {
        // Chercher un utilisateur par son nom d'utilisateur
        TypedQuery<Utilisateur> query = em.createQuery(
                "SELECT u FROM Utilisateur u WHERE u.username = :username", Utilisateur.class);
        query.setParameter("username", username);
        List<Utilisateur> results = query.getResultList();

        if (results.size() == 1) {
        	Utilisateur user = results.get(0);
            // Vérifier le mot de passe
            if (user.getMpdUtilisateur().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
