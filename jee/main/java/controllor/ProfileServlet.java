package controllor;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Utilisateur;
import model.UserManager;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @EJB
	 private UserManager userManager;
	 
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();
	        Utilisateur user = (Utilisateur) session.getAttribute("Utilisateur");	
	request.setAttribute("user", user);
    request.getRequestDispatcher("userprofile.jsp").forward(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer l'utilisateur actuel depuis la session
        HttpSession session = request.getSession();
        Utilisateur user = (Utilisateur) session.getAttribute("user");

        // Vérifier le bouton cliqué
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "update":
                    // Mettre à jour les informations de l'utilisateur
                    user.setNom_Utilisateur(request.getParameter("nom_Utilisateur"));
                    user.setPrenom_Utilisateur(request.getParameter("prenom_Utilisateur"));
                    user.setEmail_Utilisateur(request.getParameter("email_Utilisateur"));
                    user.setMpdUtilisateur(request.getParameter("mpdUtilisateur"));
                    userManager.updateUser(user);
                    break;
                case "delete":
                    // Supprimer le compte de l'utilisateur
                    userManager.deleteUser(user);
                    session.invalidate();
                    response.sendRedirect("index.jsp");
                    return;
            }
        }

        // Rediriger vers la page de profil mise à jour
        session.setAttribute("user", user);
        response.sendRedirect("profile");
	}

}
