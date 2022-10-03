package br.com.boxco.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("name");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		
		//IMPLEMENTAR CONDICIONAIS DE PREENCHER TODOS OS CAMPOS E PADRÃO DE EMAIL AQUI
		
		UserCredentials conta = new UserCredentials();
		
		
		conta.setName(nome);
		conta.setUseremail(mail);
		conta.setPassword(password);
		
		System.out.println(conta.getName() +" "+ conta.getUseremail() +" "+ conta.getPassword());
		
		
		try{
			ConnectionFactory CF = new ConnectionFactory();
			UserDAO userDAO = new UserDAO( CF.retriveConnection());
			userDAO.salvaConta(conta);
			PrintWriter outs = response.getWriter();
			outs.println("<html><body>cadastro feito com sucesso, logue na sua conta <a href=\"login.html\">Clicando aqui.</a> </body></html>");
			}catch (Exception e2) {
				System.out.println("Whoops, something went wrong at: " + e2.getStackTrace());
			
			}  
			          
			out.close();  
			}	
	}

