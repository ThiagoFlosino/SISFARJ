package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Associacao;


@WebServlet("/Associacao")
public class AssociacaoServlet extends HttpServlet{
	private static final long serialVersionUID = 5616063715362357741L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		   } 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
/*		String funcao = request.getParameter("funcao");
		switch(funcao) {
		case "cadastrar":
		Boolean retorno = cadastrarAssociaca(request);
		if(retorno) {
			out.println("Cadastrado com Sucesso");

		}
		}
*/
		Associacao novo = new Associacao();
		novo.setNome(request.getParameter("nome"));
		novo.setSigla(request.getParameter("sigla"));
		novo.setEndereco(request.getParameter("endereco"));
		novo.setNumComprocante(Integer.parseInt(request.getParameter("numComprovante")));
		novo.setNumeroOficio(Integer.parseInt(request.getParameter("numOficio")));
		novo.setTelefone(request.getParameter("telefone"));		
		Date data = null;

        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data"));
        } catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		novo.setData(data);
		novo.inserir();
	}
	
	private Boolean cadastrarAssociaca(HttpServletRequest request) {
		Associacao novo = new Associacao();
		
		novo.setNome(request.getParameter("nome"));
		novo.setSigla(request.getParameter("sigla"));
		novo.setEndereco(request.getParameter("endereco"));
		novo.setNumComprocante(Integer.parseInt(request.getParameter("numComprovante")));
		novo.setNumeroOficio(Integer.parseInt(request.getParameter("numOficio")));
		novo.setTelefone(request.getParameter("telefone"));		
		Date data = null;

        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data"));
        } catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		novo.setData(data);
		return novo.inserir();
		
	}

}
