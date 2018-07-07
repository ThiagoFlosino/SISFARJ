package domain;

public class Resultado {
	
	private Pessoa atleta;
	private Competicao competicao;
	private Double pontuacao;
	private String tempo;
	
	
	
	public Pessoa getAtleta() {
		return atleta;
	}
	public void setAtleta(Pessoa atleta) {
		this.atleta = atleta;
	}
	public Competicao getCompeticao() {
		return competicao;
	}
	public void setCompeticao(Competicao competicao) {
		this.competicao = competicao;
	}
	public Double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	
	

}
