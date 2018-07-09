package gateway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import banco.Banco;

public class AssociacaoGateway{
	
	private Long id;
	private Integer numeroOficio;
	private Date data;
	private String nome;
	private String sigla;
	private String endereco;
	private String telefone;
	private Integer numComprovante;
	
	private static final String INSERT_SQL = "INSERT INTO associacao"
			+ " (NUMERO_OFICIO, DATA, NOME, ENDERECO, TELEFONE, NUMERO_COMPROVANTE, SIGLA) "
			+ "VALUES(?,?,?,?,?,?,?)";
	private static final String UPDATE_SQL = "UPDATE associacao SET NUMERO_OFICIO= ?, NOME= ?, SIGLA= ? , DATA=? "
			+ "where id = ?";
	

	public Long insert() throws SQLException {
		PreparedStatement insertStatement = null;
		ResultSet rs = null;
		Connection conn = Banco.getConnection();
		
		insertStatement  = conn.prepareStatement(INSERT_SQL);
		insertStatement.setInt(1, this.getNumeroOficio());
		insertStatement.setDate(2, new java.sql.Date(this.getData().getTime()));
		insertStatement.setString(3, this.getNome());
		insertStatement.setString(4, this.getEndereco());
		insertStatement.setString(5,this.getTelefone());
		insertStatement.setInt(6, this.getNumComprovante());
		insertStatement.setString(7, this.getSigla());
		rs = insertStatement.executeQuery();
		rs.next();
		Long id = rs.getLong("ID");
		conn.close();
		return id;
	}
	
	public Boolean update() throws SQLException {
		PreparedStatement insertStatement = null;
		Connection conn = Banco.getConnection();
		
		insertStatement  = Banco.getConnection().prepareStatement(UPDATE_SQL);
		insertStatement.setInt(0, this.getNumeroOficio());
		insertStatement.setString(1, this.getNome());
		insertStatement.setString(2, this.getSigla());
		insertStatement.setDate(3, (java.sql.Date) this.getData());
		insertStatement.setLong(4, this.getId());
		Boolean retorno = insertStatement.execute();
		conn.close();
		return retorno;
		
	}
	
	public static AssociacaoGateway load(ResultSet rs) throws SQLException {
		AssociacaoGateway retorno = new AssociacaoGateway();
		
		retorno.setId(rs.getLong("ID"));
		retorno.setNumeroOficio(rs.getInt("NUMERO_OFICIO"));
		retorno.setData(rs.getDate("DATA"));
		retorno.setNome(rs.getString("NOME"));
		retorno.setEndereco(rs.getString("ENDERECO"));
		retorno.setNumComprovante(rs.getInt("NUMERO_COMPROVANTE"));
		retorno.setSigla(rs.getString("SIGLA"));
		retorno.setTelefone(rs.getString("TELEFONE"));
		
		return retorno;
	}


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


	public Integer getNumComprovante() {
		return numComprovante;
	}


	public void setNumComprovante(Integer numCoprovante) {
		this.numComprovante = numCoprovante;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
}
