package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("text1");
		String userPass=request.getParameter("text2");
		if(userPass.equals("1234")){
			
			Cookie ck=new Cookie("text",userName);
			response.addCookie(ck);
			response.sendRedirect("welcome");
			
			/*RequestDispatcher rd=request.getRequestDispatcher("/welcome");
			rd.forward(request, response);	*/	
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("Username and Password Error");
		}
		
		doGet(request, response);
	}

}
