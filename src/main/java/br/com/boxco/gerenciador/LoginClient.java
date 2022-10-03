package br.com.boxco.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginClient
 */
@WebServlet("/Login")
public class LoginClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String mail = request.getParameter("username");
		String password = request.getParameter("password");
		
		try{
			ConnectionFactory CF = new ConnectionFactory();
			UserDAO userDAO = new UserDAO( CF.retriveConnection());
			userDAO.logaConta(mail,password);
			PrintWriter outs = response.getWriter();
			outs.println("<html><body>Log-in feito com sucesso, bem vindo!</body></html>");
			}
		catch (Exception e2) {
				System.out.println("Whoops, something went wrong at: " + e2.getStackTrace());
			}  
			   
		out.close(); 
	}
		
}
		


