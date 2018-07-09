package domain;

import gateway.LocalCompeticaoGateway;

public class LocalCompeticao {
	
	private LocalCompeticaoGateway dados;
	
	public LocalCompeticao(LocalCompeticaoGateway dados) {
		this.dados = dados;
	}
	
	public String getNome() {
		return dados.getNome();
	}
	
	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	
	public String getEndereco() {
		return dados.getEndereco();
	}
	
	public void setEndereco(String endereco) {
		this.dados.setEndereco(endereco);
	}
	
	public Integer getTipoPiscina() {
		return dados.getTipoPiscina();
	}
	
	public void setTipoPiscina(Integer tipoPiscina) {
		this.dados.setTipoPiscina(tipoPiscina);
	}
}
