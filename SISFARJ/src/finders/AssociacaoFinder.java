package finders;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Banco;
import gateway.AssociacaoGateway;

public class AssociacaoFinder {
	
	private static final String SELECT_SQL = "SELECT ID ,NUMERO_OFICIO, DATA, NOME,"
			+ " ENDERECO, TELEFONE, NUMERO_COMPROVANTE, SIGLA"
			+ "FROM ASSOCIACAO WHERE ID = ?";
	
	public AssociacaoGateway find(Long id) {
		AssociacaoGateway resultado = null;
		ResultSet rs = null;
		PreparedStatement select = null;
		
		try {
			select = Banco.getConnection().prepareStatement(SELECT_SQL);
			select.setLong(0, id);
			rs = select.executeQuery();
			rs.next();
			resultado = AssociacaoGateway.load(rs);
			return resultado;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

}
