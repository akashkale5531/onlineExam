
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" import="java.util.*,com.example.dao.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">


<center>
<image src="images/sydney-fireworks.jpg"  height="400" width="800"></br></br>
</center>


<form name="form2">
<center>
${userscore}

<table border="2">
			<tr>
					<th>Q No</th>
					<th>Question</th>
					<th>Your Answer</th>
					<th>Correct Answer</th>
			</tr>

<%--
// Key     value
// qno    Answer
// 1      (qno=1,questionText="mmm",submittedAnswer="d",originalAnswer="d"")
// 2      (qno=2,questionText="jjj",submittedAnswer="t",originalAnswer="e"")
// HashMap Object

--%>


<c:forEach var="answer" items="${submittedDetails.values()}">
			
			<tr>
				<td>${answer.qno}</td>
				<td>${answer.questionText}</td>
				<td>${answer.submittedAnswer}</td>
				<td>${answer.originalAnswer}</td>
			</tr>

</c:forEach>

</table> 
</center>
</form>


</body>
</html>