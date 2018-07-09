package domain;

import gateway.CompeticaoGateway;
import gateway.PessoaGateway;
import gateway.ResultadoGateway;

public class Resultado {
	
	private ResultadoGateway dados;

	public Resultado(ResultadoGateway dados) {
		this.dados = dados;
	}
	
	
	public PessoaGateway getAtleta() {
		return dados.getAtleta();
	}
	public void setAtleta(Pessoa atleta) {
		this.dados.setAtleta(atleta.getDados());
	}
	public CompeticaoGateway getCompeticao() {
		return dados.getCompeticao();
	}
	public void setCompeticao(Competicao competicao) {
		this.dados.setCompeticao(competicao.getDados());
	}
	public Double getPontuacao() {
		return dados.getPontuacao();
	}
	public void setPontuacao(Double pontuacao) {
		this.dados.setPontuacao(pontuacao);
	}
	public String getTempo() {
		return dados.getTempo();
	}
	public void setTempo(String tempo) {
		this.dados.setTempo(tempo);
	}	
}
