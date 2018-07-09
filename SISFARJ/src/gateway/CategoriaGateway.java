package gateway;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Banco;

public class CategoriaGateway {
	
	private String nome;
	private String sigla;
	private Integer distancia;
	
	private static final String INSERT_SQL = "INSERT INTO CATEGORIA"
			+ " (NOME, SIGLA, DISTANCIA) "
			+ "VALUES(?,?,?)";

	
	public Long insert() {
		PreparedStatement insertStatement = null;
		ResultSet rs = null;
		try {
			insertStatement  = Banco.getConnection().prepareStatement(INSERT_SQL);
			insertStatement.setString(1, this.getNome());
			insertStatement.setString(2, this.getSigla());
			insertStatement.setInt(3, this.getDistancia());
			rs = insertStatement.executeQuery();
			rs.next();
			return rs.getLong("ID");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Integer getDistancia() {
		return distancia;
	}
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
}
