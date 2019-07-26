import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
  
@WebServlet("/InsertData") 
public class InsertData extends HttpServlet { 
    private static final long serialVersionUID = 1L; 
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        
  System.out.println("hi");
        Class.forName("com.mysql.jdbc.Driver");  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2","root",""); 
        return con; 
    } 
    protected void doPost(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
        try { 
  
                        Connection con =initializeDatabase(); 
  
                       PreparedStatement st = con 
                   .prepareStatement("insert into java2(name,address,phone,email,experience) values(?, ?,?,?,?)");    
                     int q=0;       
                      q= Integer.parseInt(request.getParameter("text3"));
                       st.setString(1, request.getParameter("text1")); 
                        st.setString(2, request.getParameter("text2")); 
                        st.setInt(3, q); 
  
                        st.setString(4, request.getParameter("text4"));
                        st.setString(5, request.getParameter("text5"));
                       int z=st.executeUpdate();
                       System.out.println(z+" row inserted");
                      // ResultSet rs= st.executeQuery("select * from java2"); 
                        // while(rs.next()) {
                        	 response.sendRedirect("hello.jsp");
                       //  }
                         
                        st.close(); 
            con.close(); 
  
                       
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 