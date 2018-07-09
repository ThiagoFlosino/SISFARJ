package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.jdbcx.JdbcConnectionPool;

public class Banco {
	
	private static JdbcConnectionPool conexao = null;
	
	public static Connection getConnection() throws SQLException {
		if(conexao == null) {
			try {
				Class.forName("org.h2.Driver");
				conexao = JdbcConnectionPool.create("jdbc:h2:~/db/SISFARJ;MVCC=true","teste","teste");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conexao.getConnection();
	}
	
	

	public static void iniciaBanco() {
		try {
			Connection conn = getConnection();
			Statement st = conn.createStatement();
			/*LIMPA O BANCO */
/*			st.execute("DROP TABLE IF EXISTS aluno;");
			st.execute("DROP TABLE IF EXISTS disciplina;");
			st.execute("DROP TABLE IF EXISTS notas;");*/
			/* CRIA TABELAS */
			st.execute("CREATE TABLE IF NOT EXISTS aluno (nome varchar(255),matricula integer PRIMARY KEY);");
			st.execute("CREATE TABLE IF NOT EXISTS disciplina (codigo integer PRIMARY KEY,nome varchar(255));");
			st.execute("CREATE TABLE IF NOT EXISTS notas (cod_disciplina number  ,mat_aluno number , nota float);");
			/* INSERI DISCIPLINAS */
/*			st.execute("INSERT INTO DISCIPLINA (CODIGO, NOME) VALUES(001, 'Sistemas Distribuidos');");
			st.execute("INSERT INTO DISCIPLINA (CODIGO, NOME) VALUES(002, 'Redes');");
			st.execute("INSERT INTO DISCIPLINA (CODIGO, NOME) VALUES(003, 'Computação 1');");
			
			 INSERI Alunos 
			st.execute("INSERT INTO ALUNO VALUES('João', 123);");
			st.execute("INSERT INTO ALUNO VALUES('Maria', 321);");
			st.execute("MERGE INTO NOTAS KEY(COD_DISCIPLINA, MAT_ALUNO) VALUES(001,123,5.7)");
*/
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		try {
//			Class.forName("org.h2.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
}
