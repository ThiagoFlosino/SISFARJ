package domain;

import gateway.ClasseGateway;

public class Classe {
	
	private ClasseGateway dados;
	
	public Classe(ClasseGateway dados) {
		this.dados = dados;
	}
	
	public String getNome() {
		return dados.getNome();
	}
	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	public Integer getIdadeInicio() {
		return dados.getIdadeInicio();
	}
	public void setIdadeInicio(Integer idadeInicio) {
		this.dados.setIdadeInicio(idadeInicio);
	}
	public Integer getIdadeFim() {
		return dados.getIdadeFim();
	}
	public void setIdadeFim(Integer idadeFim) {
		this.dados.setIdadeFim(idadeFim);
	}

	public ClasseGateway getDados() {
		return dados;
	}

	public void setDados(ClasseGateway dados) {
		this.dados = dados;
	}
	

	
}
