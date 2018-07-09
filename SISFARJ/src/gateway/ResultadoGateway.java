package gateway;

public class ResultadoGateway {

	private PessoaGateway atleta;
	private CompeticaoGateway competicao;
	private Double pontuacao;
	private String tempo;
	
	
	
	public PessoaGateway getAtleta() {
		return atleta;
	}
	public void setAtleta(PessoaGateway atleta) {
		this.atleta = atleta;
	}
	public CompeticaoGateway getCompeticao() {
		return competicao;
	}
	public void setCompeticao(CompeticaoGateway competicao) {
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
