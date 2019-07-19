import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class ControllerServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
         String name=request.getParameter("name");  
        String password=request.getParameter("password");    
        String password2=request.getParameter("password2");
        Register r=new Register();
        r.setName(name);  
        r.setPassword(password);  
        r.setPassword2(password2);

        boolean y=r.validate();
        if(y){
        RequestDispatcher rd=request.getRequestDispatcher("register-success.jsp");  
            rd.forward(request, response);
       }
       else
       { RequestDispatcher rd=request.getRequestDispatcher("register-failed.jsp");  
            rd.forward(request, response);
         }
}
}