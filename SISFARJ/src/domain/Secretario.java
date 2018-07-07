package domain;

import java.util.Date;

public class Secretario extends Pessoa {
	
	private Object filiarAssociacao(Integer numeroOficio, Date data, String nome,
			String endereco, String telefone, Integer numComprovante) {
		
		
		Associacao retorno = null;
		
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
		Associacao nova = new Associacao(numeroOficio, data, nome, endereco, telefone, numComprovante);

		try {
			retorno = nova.inserir();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return retorno;
		
	}
	
}
