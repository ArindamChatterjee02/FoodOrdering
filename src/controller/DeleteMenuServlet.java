package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Menu;
@WebServlet(urlPatterns = "/deletemenu")
public class DeleteMenuServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int menu_id=Integer.parseInt(req.getParameter("menu_id"));
		try 
		{
			
			
			//out.print(rest_id +" "+menu+" "+email_id);
			
			Menu m=new Menu();
			m.setMenu_id(menu_id);
			
			
		
		  int res = m.deleteMenu();
		  
		  //RequestDispatcher rd = req.getRequestDispatcher("http://localhost:8080/Food_Ordering_System/");
		  
		  if(res == 1) 
		  { 
			  //System.out.println("Success"); 
			  //req.setAttribute("msg","success"); 
	      } 
		  else 
		  { 
			  //req.setAttribute("msg", "Failed"); 
		  }
		  //rd.forward(req,resp);
		  
		  resp.sendRedirect("menu.jsp");
		 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
