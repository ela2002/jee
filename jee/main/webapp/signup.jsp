<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./signin.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Sign Up</title>
</head>
<body>
  <div class="container-fluid">
      <div class="row">
        <!-- chtar lewel-->
        <div class="col-5" id="col1">
          <a>
            <img
              class="mt-2"
              src="white logo.png"
              alt="logo"
              width="140px"
              height="40px"
            />
          </a>
          <h1 id="title1" ><b> Welcome !</b></h1>
          <h5>Sign up and start exploring new opportunities</h5>
          <button
            class="btn offset-5 mt-3"
            id="btn_sign_in"
            type="button"
            (click)="redirectToPage()"
          >
            Sign In
          </button>
          <img
            id="img_signup"
            src="signup.png"
            alt="sign_up_img"
            width="240px"
            height="250px"
          />
        </div>

        <!-- chtar theni-->
        <div id="col2" class="col">
          <h2 id="title2" class="mt-5"><b>Create Account</b></h2>

          <div class="text-center">
            <p id="p" class="text-muted mt-4">
              Use your social media account for registration
            </p>
            <a href=""
              ><img
                id="img1"
                src="google.png"
                alt="gmail"
                class="img"
            /></a>
            <a href=""
              ><img
                id="img2"
                src="./fb.png"
                alt="facebook"
                class="img"
            /></a>
            <a href=""
              ><img
                id="img3"
                src="./insta.png"
                alt="instagram"
                class="img"
            /></a>
          </div>
          <form action="#" method="post">
            <div class="col-6 offset-3 mt-5">
              <div class="form-floating mb-3">
                <i class="fas fa-user fa-lg"></i>
                <input
                  type="text"
                  class="form-control"
                  id="firstname"
                  placeholder="Enter username"
                  required
                />
                <label for="firstname">First Name</label>
              </div>

              <div class="form-floating mb-3">
                <i class="fas fa-user fa-lg"></i>
                <input
                  type="text"
                  class="form-control"
                  id="lastname"
                  placeholder="Enter username"
                  required
                />
                <label for="lastname">Last Name</label>
              </div>

              <div class="form-floating mb-3">
                <i class="fas fa-envelope fa-lg"></i>
                <input
                  type="email"
                  class="form-control"
                  id="email"
                  placeholder="Enter email"
                  required
                />
                <label for="email">Email</label>
              </div>

              <div class="form-floating mb-3">
                <i class="fas fa-lock fa-lg"></i>
                <input
                  type="password"
                  class="form-control"
                  id="password"
                  placeholder="Enter password"
                  required
                />
                <label for="password">Password</label>
              </div>

              <div class="text-center ">
                <button type="submit" class="btn mt-3" id="btn_sign_up">
                  Sign Up
                </button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div> -->
 <!--    <div align="center">
  <h1>Register Form</h1>
  <form action="register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
   </table>
   <input type="submit" value="Sign Up" />
  </form>
 </div> -->
    </body>
</html>