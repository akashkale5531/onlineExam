<html>
<head>
<script>
function changeColor()
{
	alert("function called");
	document.login.pass.value="I am changed";
}
</script>
<style>
input
{
	margin:auto;
	padding:auto;
	
}
#success
{
	color:red;
}
</style>
</head>


<body  bgcolor="lightBlue">

<span id="success">${success}</span>

<form name="login"  action="login">

<input type="text" name="name" placeholder="Enter Name"> <br>

<input type="password" name="pass" placeholder="Enter Password"> <br> ${error}

<input type="submit" value="Login"><br><br><br>

<a href="registration"> New Register/Sign Up </a>


</form>
</body>
</html>