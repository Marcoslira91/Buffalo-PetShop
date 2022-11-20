package dao;

	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import model.Servicos;

	public void criarServicosDAO(Servicos servicos) {
		String sql = "INSERT INTO cliente(iDpessoa, banho, tosa, AtendimentoMedico, obs " + "VALUES (?, ?, ?, ?, ?,";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			// Cria uma conexão com o banco de dados
						conn = ConnectionFactory.createConnectionToMySQL();
						// Criamos uma PrepareStatement para executar as funcoes de conexao
						pstm = (PreparedStatement) conn.prepareStatement(sql);
						// Adicionar os valores que são esperados pela query
						pstm.setInt(1, servicosDAO.getiDpessoa());
						pstm.setString(2, servicosDAO.getBanho());
						pstm.setString(3, servicosDAO.getTosa());
						pstm.setString(4, servicosDAO.getAtendimentoMedico());
						pstm.setString(5, servicosDAO.getObs());
						
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
	    public List<ServicosDAO> listarTodosServicosDAO() {
		String sql = "SELECT * FROM servicosDAO";

		List<ServicosDAO> ServicosDAO = new ArrayList<ServicosDAO>();
		Connection conn = null;
		PreparedStatement pstm = null;
		// Classe que vai recuperar(receber) os dados do banco
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Pet cliente = new ServicosDAO();
				// Receber o id
				contato.setiDpessoa(rset.getInt("iDpessoa"));
				// Receber o banho
				contato.setBanho(rset.getString("banho"));
				// Receber a tosa
				contato.setTosa(rset.getString("tosa"));
				// Receber o AtendimentoMedico
				contato.setAtendimentoMedico(rset.getString("atendimentomedico"));
				// Receber a obs
				contato.setObs(rset.getString("obs"));
				
				// Salvar dentro do nosso array de servicosDAO
				petDAO.add(servicosDAO);
				
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
		return ServicosDAO;
	 }
	    public void atualizaServicosDAO(servicosDAO servicosDAO) {

			String sql = "UPDATE servicosDAO SET iDpessoa = ?,banho = ?,tosa = ?,obs = ?"
					+ " atendimentomedico = ?" + " WHERE id = ?";

			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				// Criar conexão com o banco
				conn = ConnectionFactory.createConnectionToMySQL();
				// Criar a classe para executar a query
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				// Adicionar os valores para atualizar
				pstm.setInt(1, servicosDAO.getiDpessoa());
				pstm.setString(2, servicosDAO.getBanho());
				pstm.setString(3, servicosDAO.getTosa());
				pstm.setString(4, servicosDAO.getObs());
				pstm.setString(5, new String(servicosDAO.getAyendimentoMedico().getTime()));

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
	    
	    public void removerServicosDAO(int id) {
			String sql = "DELETE FROM servicosDAO WHERE id = ?";
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
}

