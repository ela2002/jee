<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
 <style>
      /* Styles pour le contenu de la page */
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
      }

      /* Styles pour l'en-tête */
      header {
        background-color: #333;
        color: white;
        padding: 20px;
        text-align: center;
      }

      /* Styles pour l'image de profil */
      .profile-img {
        display: block;
        margin: 20px auto;
        width: 150px;
        height: 150px;
        border-radius: 50%;
        object-fit: cover;
      }

      /* Styles pour les informations de l'utilisateur */
      .user-info {
        background-color: white;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        max-width: 800px;
        margin: 20px auto;
      }

      /* Styles pour les titres des informations de l'utilisateur */
      .user-info h2 {
        font-size: 24px;
        margin-bottom: 10px;
      }

      /* Styles pour les détails des informations de l'utilisateur */
      .user-info p {
        font-size: 16px;
        margin-bottom: 20px;
      }

      /* Styles pour les boutons */
      .button {
        display: inline-block;
        background-color: #333;
        color: white;
        padding: 10px 20px;
        border-radius: 5px;
        text-decoration: none;
        margin-right: 10px;
      }
           input{
        border-radius: 25px;
      }

      /* Styles pour le bouton de suppression */
      .delete-button {
        background-color: #ff0000;
      }
    </style>
</head>
<body>
	<header>
      <h1>User Profile</h1>
    </header>

    <img class="profile-img" src="~/user2.png" alt="Image de profil">

    <div class="user-info" align="center">
      
<form action="register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" value="${user.firstname}"/></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" value="${user.lastname}"/></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" value="${user.email}" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" value="${user.password}"/></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" value="${user.adress}"/></td>
    </tr>
    <tr>
    
   </table>
  <input class="button" type="submit" value="Modify">
		 <a class="button" href="signup.jsp">Add New Account</a>
		 <input class="button delete-button" type="submit" value="Delete">
		 
  </form>		
    </div>
</body>
</html>