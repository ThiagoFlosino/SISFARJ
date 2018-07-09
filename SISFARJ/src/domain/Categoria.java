package domain;

import gateway.CategoriaGateway;

public class Categoria {
	
	private CategoriaGateway dados;

	public Categoria(CategoriaGateway dados) {
		this.dados = dados;
	}
	
	public String getNome() {
		return dados.getNome();
	}
	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	public String getSigla() {
		return dados.getSigla();
	}
	public void setSigla(String sigla) {
		this.dados.setSigla(sigla);
	}
	public Integer getDistancia() {
		return dados.getDistancia();
	}
	public void setDistancia(Integer distancia) {
		this.dados.setDistancia(distancia);
	}

	public CategoriaGateway getDados() {
		return dados;
	}

	public void setDados(CategoriaGateway dados) {
		this.dados = dados;
	}
	

}
