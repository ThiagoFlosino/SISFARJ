package domain;

import java.util.Date;
import java.util.List;

import gateway.CategoriaGateway;
import gateway.ClasseGateway;
import gateway.CompeticaoGateway;

public class Competicao {
	
	private CompeticaoGateway dados;
	
	public Competicao(CompeticaoGateway dados) {
		this.dados = dados;
	}
	
	
	public CompeticaoGateway getDados() {
		return dados;
	}


	public void setDados(CompeticaoGateway dados) {
		this.dados = dados;
	}


	public LocalCompeticao getLocalCompeticao() {
		return dados.getLocalCompeticao();
	}
	public void setLocalCompeticao(LocalCompeticao localCompeticao) {
		this.dados.setLocalCompeticao(localCompeticao);
	}
	public List<CategoriaGateway> getCategorias() {
		return dados.getCategorias();
	}
	public void setCategorias(Categoria categorias) {
		this.dados.getCategorias().add(categorias.getDados());
	}
	public List<ClasseGateway> getClasses() {
		return dados.getClasses();
	}
	public void setClasses(Classe classes) {
		this.dados.getClasses().add(classes.getDados());
	}
	public String getNome() {
		return dados.getNome();
	}
	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	public Date getData() {
		return dados.getData();
	}
	public void setData(Date data) {
		this.dados.setData(data);
	}
	
	
	
}
