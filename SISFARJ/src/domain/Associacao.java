package domain;

import java.sql.SQLException;
import java.util.Date;

import gateway.AssociacaoGateway;

public class Associacao {
	
	private AssociacaoGateway dados;
	
	
	public Associacao(AssociacaoGateway data) {
		this.dados = data;
	}
	
	public Associacao(Integer numeroOficio, Date data, String nome, String endereco, String telefone,
			Integer numComprovante) {
		this.setNumeroOficio(numeroOficio);
		this.setData(data);
		this.setEndereco(endereco);
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setNumComprocante(numComprovante);;
	}

	public Associacao() {
		this.dados = new AssociacaoGateway();
	}

	public Integer getNumeroOficio() {
		return dados.getNumeroOficio();
	}

	public void setNumeroOficio(Integer numeroOficio) {
		this.dados.setNumeroOficio(numeroOficio);
	}

	public Date getData() {
		return dados.getData();
	}

	public void setData(Date data) {
		this.dados.setData(data);
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

	public String getTelefone() {
		return dados.getTelefone();
	}

	public void setTelefone(String telefone) {
		this.dados.setTelefone(telefone);
	}

	public Integer getNumComprocante() {
		return dados.getNumComprovante();
	}

	public void setNumComprocante(Integer numComprocante) {
		this.dados.setNumComprovante(numComprocante);
	}
	
	public String getSigla() {
		return dados.getSigla();
	}


	public void setSigla(String sigla) {
		this.dados.setSigla(sigla);
	}


	public Boolean inserir() {
		Long id = null;
		try {
			id = this.dados.insert();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(id == null) {
			return false;
		}else {
			return true;
		}
	}
	public Boolean update() {
		try {
			return this.dados.update();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}
