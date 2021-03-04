package gerenciador.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Esta anotacao diz pro compilador que a classe PrimeiroServlet se trata de um servlet
@WebServlet(urlPatterns = "/meuServlet") // Define a url que ira disparar o servlet
public class PrimeiroServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// Pega os parametros recebidos na requisicao HTTP. O metodo getParameter recebe como argumento o nome do parametro recebido pela requisicao.
		// http://localhost:8080/gerenciador/meuServlet?nome=Sergio
		// o link acima tem a requisicao "nome"
		String parametro = req.getParameter("nome");
		
		// Resposta devolvida a requisicao
		PrintWriter out = resp.getWriter(); // Usamos o getWriter para devolver uma resposta em forma de texto plano
		out.println("Testando meu primeiro parametro");
		out.println("parametro passado = " + parametro);
		out.println("Encerrando...");
		System.out.println("Servlet foi chamado");
	}
}
