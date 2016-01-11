<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Java Tutorial</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
    
    
    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans'>

        <link rel="stylesheet" href="css/style.css">
		<script src='js/jquery-1.10.2.min.js'></script>
		<script src="js/index.js"></script>
 
  </head>

  <body>

    <div class="cont">
  <div class="demo">
    <div class="login">
     
          <form action="/storeRegisterDetail" method="post">
            <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_name" name="name" placeholder="Name"/>
        </div>
          <div class="login__row">
          
          <input type="text" class="login__input name" id="registered_email" name="email"placeholder="Email Address"/>
        </div>
          <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_uname"  name="username" placeholder="Username"/>
        </div>
        <div class="login__row">
          
         
          <input type="password" class="login__input name"  id="registered_pwd" name="password"placeholder="Password"/>
        </div>
       
        <div class="login__row">
          
       
          <input type="password" class="login__input pass" id="registered_cpwd" name="con_password" placeholder="Confirm Password"/>
       
        </div>
         <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_mobile" name="mobile"placeholder="Mobile Number"/>
        </div>
         <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_city" name="city"placeholder="City"/>
        </div>
         <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_state" name ="state"placeholder="State"/>
          </div>
           <div class="login__row">
          
         
          <input type="text" class="login__input name" id="registered_country" name = "country"placeholder="Country"/>
              </div>
            <button type="submit" class="login__submit" onclick="storeData()" style="margin-top:10%">Sign Up</button>

      </form>
      </div>
    </div>
  
  </div>
    
    
    
  </body>
</html>
