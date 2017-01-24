<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#menu_bar").hide();
$("#login_button").click(function(){
	
	var name = $("#name").val();
	var password = $("#password").val();
	
	$.post("LoginServlet",
	        {
		userName: name,
		passWord: password
	        },
	        function(data,status){
	        	console.log(data);
	            if(data=="success"){
	            	$("#menu_bar").show("slow");
	            }
	        });
		
});
});

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div id="menu_bar">This is a menu bar </div>
<form method="post" >
<label>Login</label>
<input type="text"  id="name">
<input type="text"  id="password">
<button type="button" id="login_button"> Login</button>
</form>

<form method="post" >
<label>Register</label>
<input type="text"  id="name1">
<input type="text" id="password1">
<button type="button" id="register_button"> Register</button>
</form>
</body>
</html>