import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class First extends HttpServlet 
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String n = request.getParameter("name");
			double salary=Double.parseDouble(request.getParameter("basic"));
			salary += 0.20*salary+0.9*salary;
			out.print("Gross salary \n");
			out.print("SHEET \n");
			out.print("Hello \n" +n);
			out.print(" Your gross salary is "+salary);
			out.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}