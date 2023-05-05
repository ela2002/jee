package controllor;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Utilisateur;
import model.LoginManager;


@WebServlet("/login")

public class singinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private LoginManager loginManager;
	
    public singinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        request.getRequestDispatcher("login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        

	        // Vérifier les informations d'identification de l'utilisateur
	        Utilisateur user = loginManager.login(username, password);
	        if (user != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("Utilisateur", user);
	            response.sendRedirect("profile");
	        } else {
	            request.setAttribute("error", "Invalid username or password.");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
