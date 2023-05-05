<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./signin.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Sign In</title>
</head>
<body>
<!-- <div class="container-fluid">
      <div class="row">
        <div class="col" id="col1">
          <a routerLink="/accueil"
            ><img class="mt-2"
              id="orange_logo"
              src="../../assets/orange logo.png"
              alt="logo"
              width="140px"
              height="50px"
          /></a>
          <div id="rowinp" class="row">
            <div class="col-7 mt-4 ">
              
              <img
                class="offset-8 mt-3 mb-3"
                id="user_img"
                src="../../assets/user2.png"
                alt="user_account"
                width="80px"
                height="100px"
              />
              <form action="#" method="post">
                <div class="col-10 offset-5">
                <div class="form-floating mb-3">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" style="height: 20px; width:20px;"><path d="M48 64C21.5 64 0 85.5 0 112c0 15.1 7.1 29.3 19.2 38.4L236.8 313.6c11.4 8.5 27 8.5 38.4 0L492.8 150.4c12.1-9.1 19.2-23.3 19.2-38.4c0-26.5-21.5-48-48-48H48zM0 176V384c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V176L294.4 339.2c-22.8 17.1-54 17.1-76.8 0L0 176z"/></svg>
                  <input
                    type="email"
                    class="form-control"
                    id="email"
                    placeholder="Enter email"
                    required
                    pattern="[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{2,4}*"
                  />
                  <label for="email">Email</label>
                </div>
                <div class="form-floating mb-4">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" style="height: 20px; width:20px;"><path d="M144 144v48H304V144c0-44.2-35.8-80-80-80s-80 35.8-80 80zM80 192V144C80 64.5 144.5 0 224 0s144 64.5 144 144v48h16c35.3 0 64 28.7 64 64V448c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V256c0-35.3 28.7-64 64-64H80z"/></svg>
                  <input
                    type="password"
                    class="form-control"
                    id="password"
                    placeholder="Enter password"
                    required
                    
                  />
                  <label for="password">Password</label>
                </div>
              

                <div class="text-center">
                  <button type="submit" class="btn">Sign In</button>
                </div>
                <img id="img_signin" src="../../assets/signin.png" alt="sing_in" />
              </div>
              </form>
            </div>
          </div>
        </div>

        <div class="col-5" id="col2">
          <h2><b> Glad to see you again !</b></h2>
          <h5>Access your account now and start exploring</h5>
          
        </div>
      </div>
    </div>
     -->
     <div align="center">
		<h1>Login Form</h1>
		<form action="login" method="post">
			<table style="with: 100%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Sign In" />
		</form>
	</div>
</body>
</html>