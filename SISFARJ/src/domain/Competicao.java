package domain;

import java.util.Date;
import java.util.List;

public class Competicao {
	private LocalCompeticao localCompeticao;
	private List<Categoria> categorias;
	private List<Classe> classes;
	private String nome;
	private Date data;
	
	
	public LocalCompeticao getLocalCompeticao() {
		return localCompeticao;
	}
	public void setLocalCompeticao(LocalCompeticao localCompeticao) {
		this.localCompeticao = localCompeticao;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(Categoria categorias) {
		this.categorias.add(categorias);
	}
	public List<Classe> getClasses() {
		return classes;
	}
	public void setClasses(Classe classes) {
		this.classes.add(classes);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
