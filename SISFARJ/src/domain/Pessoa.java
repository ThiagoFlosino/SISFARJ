package domain;

import java.util.Date;

import gateway.PessoaGateway;

public class Pessoa {
	
	private PessoaGateway dados;

	public Pessoa(PessoaGateway dados) {
		this.dados = dados;
	}
	
	public String getNome() {
		return dados.getNome();
	}
	
	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	
	public Date getDataNascimento() {
		return dados.getDataNascimento();
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dados.setDataNascimento(dataNascimento);
	}
	
	public String getMatricula() {
		return dados.getMatricula();
	}
	
	public void setMatricula(String matricula) {
		this.dados.setMatricula(matricula);
	}
	
	public String getSenha() {
		return dados.getSenha();
	}
	
	public void setSenha(String senha) {
		this.dados.setSenha(senha);
	}

	public PessoaGateway getDados() {
		return dados;
	}

	public void setDados(PessoaGateway dados) {
		this.dados = dados;
	}
	
}
