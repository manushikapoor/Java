import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement; 
  
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
        
  
        Class.forName("com.mysql.jdbc.Driver");  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manushi","root",""); 
        return con; 
    } 
    protected void doPost(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
        try { 
  
                        Connection con =initializeDatabase(); 
  
                       PreparedStatement st = con 
                   .prepareStatement("insert into java values(?, ?)"); 
  
                        st.setInt(1, Integer.valueOf(request.getParameter("id"))); 
  
                        st.setString(2, request.getParameter("string")); 
  
                        st.executeUpdate(); 
  
                        st.close(); 
            con.close(); 
  
                        PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 