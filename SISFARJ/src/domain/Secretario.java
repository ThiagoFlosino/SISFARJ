package domain;

import java.util.Date;

import finders.AssociacaoFinder;
import gateway.AssociacaoGateway;
import gateway.PessoaGateway;

public class Secretario extends Pessoa {
	
	public Secretario(PessoaGateway dados) {
		super(dados);
	}

	public String filiarAssociacao(Integer numeroOficio, Date data, String nome,
			String endereco, String telefone, Integer numComprovante, String sigla) {
		
		String error = "Ńão foi possível filiar a Associação. ";
		
		if(numeroOficio == null) {
			return  error + "Informe o Número do Ofício.";
		}
		if(data == null) {
			return  error + "Informe a Data do Ofício.";
		}
		if(nome == null) {
			return  error + "Informe o nome da Associação.";
		}
		if(endereco == null) {
			return  error + "Informe o endereço da Associação.";
		}
		if(telefone == null) {
			return  error + "Informe o telefone da Associação.";
		}
		if(numComprovante == null) {
			return  error + "Informe o Número do Comprovante.";
		}
		if(sigla == null) {
			return  error + "Informe a sigla da Associação.";
		}
		Associacao nova = new Associacao(numeroOficio, data, nome, endereco, telefone, numComprovante);

		try {
			if(nova.inserir()) {
				return "Associação realizada com Sucesso";
			}else {
				return "Erro ao tentar realizar a Associação";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "Erro ao tentar realizar a Associação";
	}
	
	public String AtualizarFiliacao(Long id, Integer numeroOficio, Date data, String nome,
			String sigla) {
		
		String error = "Ńão foi possível filiar a Associação. ";
		
		if(numeroOficio == null) {
			return  error + "Informe o Número do Ofício.";
		}
		if(data == null) {
			return  error + "Informe a Data do Ofício.";
		}
		if(nome == null) {
			return  error + "Informe o nome da Associação.";
		}
		if(sigla == null) {
			return  error + "Informe a sigla da Associação.";
		}
		AssociacaoFinder finder = new AssociacaoFinder();
		AssociacaoGateway ag= finder.find(id);
		
		ag.setNumeroOficio(numeroOficio);
		ag.setData(data);
		ag.setNome(nome);
		ag.setSigla(sigla);
		
		if(ag.update()) {
			return "Atualizado com sucesso";
		}
		return "Erro ao Atualizar";
	}
	
}
