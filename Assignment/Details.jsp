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
<title>details</title>
</head>
<body>
<%
 try
                           {
                                         Class.forName("com.mysql.jdbc.Driver");  
                                         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2","root","");   
            Statement stm=conn.createStatement();
	 
	
          int a=Integer.parseInt(request.getParameter("id"));
	if(a!=0){
            ResultSet rset=stm.executeQuery("select * from java2 where id = "+ a);  
            while(rset.next())  {
            %>
	<table border=0px>
	<tr><td>
	Name -<%=rset.getString(1)%></td></tr><br>
	<tr><td>address-<%=rset.getString(2)%></td></tr><br>
	<tr><td>phone-<%=rset.getInt(3)%></td></tr><br>
	<tr><td>email-<%=rset.getString(4)%></td></tr><br></table>
<%
	}
 }
 else{
	ResultSet rset=stm.executeQuery("select * from java2 ");  
            while(rset.next())  {
            %>
	<table border=0px>
	<tr><td>
	Name -<%=rset.getString(1)%></td></tr><br>
	<tr><td>address-<%=rset.getString(2)%></td></tr><br>
	<tr><td>phone-<%=rset.getInt(3)%></td></tr><br>
	<tr><td>email-<%=rset.getString(4)%></td></tr><br></table>
<%
	}  
 }
            conn.close();  
                           }
                           catch(Exception e)
                           {
                                         System.out.println(e);
                           }%>
</body>
</html>