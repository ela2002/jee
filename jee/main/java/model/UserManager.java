package model;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Utilisateur;

/**
 * Session Bean implementation class UserManager
 */

@Stateless
@LocalBean
public class UserManager {
	@PersistenceContext(unitName="Pathfinder")
	private EntityManager em;
    
    public UserManager() {
        // TODO Auto-generated constructor stub
    }
    public Utilisateur createUser(String firstname,String lastname, String email, String password) {
    	Utilisateur user = new Utilisateur(firstname,lastname, email, password);
        em.persist(user);
        return user;
    }

    public Utilisateur updateUser(Utilisateur user) {
        em.merge(user);
        return user;
    }

    public void deleteUser(int id) {
    	Utilisateur user=em.find(Utilisateur.class, id);
        em.remove(em.merge(user));
    }
    

        
}
