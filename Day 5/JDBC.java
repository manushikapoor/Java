package jdbc; 
import java.sql.*;  
public class JDBC
{
              public static void main(String args[])
              {
                           try
                           {
                                         Class.forName("com.mysql.jdbc.Driver");  
                                         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/manushi","root","");   
            Statement stm=conn.createStatement(); 
            int i=stm.executeUpdate("insert into java values('manushi',500062100)"); 
            int j=stm.executeUpdate("insert into java values('xyz',123456)");
            int h=stm.executeUpdate("update java set sapid=456789 where name='xyz'");
            ResultSet rset=stm.executeQuery("select * from java");  
            while(rset.next())  
            System.out.println("name-"+rset.getString(1)+"  "+"sapid-"+rset.getInt(2));  
            conn.close();  
                           }
                           catch(Exception e)
                           {
                                         System.out.println(e);
                           }
              }
}  


