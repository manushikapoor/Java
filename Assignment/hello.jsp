<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
SUCCESSFUL ! <br><br>
Employee successfully registered. The ID number is :
<%
 try
                           {
                                         Class.forName("com.mysql.jdbc.Driver");  
                                         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2","root","");   
            Statement stm=conn.createStatement(); 
	int id=0;
            ResultSet rset=stm.executeQuery("select * from java2 ");  
            if(rset.last())  {
              id=rset.getInt("id");
} 
	out.println(id);
            conn.close();  
                           }
                           catch(Exception e)
                           {
                                         System.out.println(e);
                           }%>
<br>
<p>
<a href="index.html>Click here </a> to go back to home page.
</p>
</body>
</html>