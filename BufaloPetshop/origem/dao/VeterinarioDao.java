package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public void criarVeterinarioDAO(Veterinario veterinario) {
	String sql = "INSERT INTO cliente(crmv" + "VALUES (? ";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	try {
		// Cria uma conexão com o banco de dados
					conn = ConnectionFactory.createConnectionToMySQL();
					// Criamos uma PrepareStatement para executar as funcoes de conexao
					pstm = (PreparedStatement) conn.prepareStatement(sql);
					// Adicionar os valores que são esperados pela query
					pstm.setInt(1, new Date(veterinarioDAO.getCrmv().getTime()));
					
					// execute a query
					pstm.execute();
					System.out.println("Executado com sucesso");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// Fechar a conexão
					try {
						if (pstm != null) {
							pstm.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
    public List<VeterinarioDAO> listarTodosVeterinarioDAO() {
	String sql = "SELECT * FROM veterinarioDAO";

	List<VeterinarioDAO> VeterinarioDAO = new ArrayList<VeterinarioDAO>();
	Connection conn = null;
	PreparedStatement pstm = null;
	// Classe que vai recuperar(receber) os dados do banco
	ResultSet rset = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySQL();
		pstm = (PreparedStatement) conn.prepareStatement(sql);
		rset = pstm.executeQuery();

		while (rset.next()) {
			Veterinario veterinario = new VeterinarioDAO();
			// Receber o crmv
			contato.setCrmv(rset.getInt("crmv"));
			
			// Salvar dentro do nosso array de veterinarioDAO
			veterinarioDAO.add(veterinarioDAO);
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rset != null) {
				rset.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	return veterinarioDAO;
 }
    public void atualizaVeterinarioDAO(veterinarioDAO veterinarioDAO) {

		String sql = "UPDATE veterinarioDAO SET crmv = ?" + " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setInt(1, new Date(veterinarioDAO.getCrmv().getTime()));

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
    
    public void removerVeterinarioDAO(int id) {
		String sql = "DELETE FROM veterinarioDAO WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
			System.out.println("Deletado com Sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


