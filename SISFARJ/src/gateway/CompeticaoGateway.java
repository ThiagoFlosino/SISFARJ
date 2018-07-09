package gateway;

import java.util.Date;
import java.util.List;

import domain.Categoria;
import domain.Classe;
import domain.LocalCompeticao;

public class CompeticaoGateway {
	
	private LocalCompeticao localCompeticao;
	private List<CategoriaGateway> categorias;
	private List<ClasseGateway> classes;
	private String nome;
	private Date data;
	
	
	public LocalCompeticao getLocalCompeticao() {
		return localCompeticao;
	}
	
	public void setLocalCompeticao(LocalCompeticao localCompeticao) {
		this.localCompeticao = localCompeticao;
	}
	
	public List<CategoriaGateway> getCategorias() {
		return categorias;
	}
	
	public void setCategorias(CategoriaGateway categorias) {
		this.categorias.add(categorias);
	}
	
	public List<ClasseGateway> getClasses() {
		return classes;
	}
	
	public void setClasses(ClasseGateway classes) {
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
