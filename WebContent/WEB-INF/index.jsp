<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<style><%@include file="/resources/css/index.css"%></style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	</head>
<body>
	<div class="login-page">
	  <div class="form">
	    <form class="register-form" action="register" method="post">
	      <input type="text" placeholder="username" name="username"/>
	      <input type="password" placeholder="password" name="password"/>
	      <button id="register">create</button>
	      <p class="message">Already registered? <a href="#">Sign In</a></p>
	    </form>
	    <form class="login-form" action="login" method="post">
	      <input type="text" placeholder="username" name="username"/>
	      <input type="password" placeholder="password" name="password"/>
	      <button id="login">login</button>
	      <p class="message">Not registered? <a href="#">Create an account</a></p>
	    </form>
	  </div>
	</div>
	<script type="text/javascript">
		$('.message a').click(function(){
		   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
		});
        $.ajax({
            url:"register",
            dataType: "json",
            success:function(data){
               var obj = jQuery.parseJSON(data);
               if(obj.registered){
            	   		alert("Register successful!");
               }
            }
        });
	</script>
</body>
</html>