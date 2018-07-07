package domain;

import java.util.Date;

import Gateway.AssociacaoGateway;

public class Associacao {
	
	private Integer numeroOficio;
	private Date data;
	private String nome;
	private String endereco;
	private String telefone;
	private Integer numComprocante;
	
	

	public Integer getNumeroOficio() {
		return numeroOficio;
	}

	public void setNumeroOficio(Integer numeroOficio) {
		this.numeroOficio = numeroOficio;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getNumComprocante() {
		return numComprocante;
	}

	public void setNumComprocante(Integer numComprocante) {
		this.numComprocante = numComprocante;
	}
	
	

	public Associacao(Integer numeroOficio, Date data, String nome, String endereco, String telefone,
			Integer numComprovante) {
		// TODO Auto-generated constructor stub
	}

	public Associacao inserir() {
		return AssociacaoGateway.insert(this);
		// TODO Auto-generated method stub
		
	}

}
