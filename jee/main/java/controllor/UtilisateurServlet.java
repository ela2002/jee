package controllor;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Utilisateur;
import model.UserManager;

@WebServlet("/register")

public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
    private UserManager userManager;   
   
    public UtilisateurServlet() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/signin.jsp").forward(request, response);

	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom= request.getParameter("lastname");
		String prenom= request.getParameter("firstname");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Utilisateur user = userManager.createUser(nom,prenom,email,password);
		
		HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect("login");
		
	}


	

}
