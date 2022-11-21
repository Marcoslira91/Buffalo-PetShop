package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Servico;

public class ServicoDao {
	// CRUD
	public void criarServico(Servico servico) {
		String sql = "INSERT INTO Servico(idServico, banho, tosa, atendimentoMedico, observacao) VALUES (?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, servico.getIdServico());
			pstm.setBoolean(2, servico.getBanho());
			pstm.setBoolean(3, servico.getTosa());
			pstm.setBoolean(4, servico.getAtendimentoMedico());
			pstm.setString(5, servico.getObservacao());

			// Executando a query
			pstm.execute();
			System.out.println("Executado com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fechando a conexão
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

	public List<Servico> listarTodosServicos() {
		String sql = "SELECT * FROM Servico";

		List<Servico> Servicos = new ArrayList<Servico>();
		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar(receber) os dados do banco
		ResultSet rset = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Servico servico = new Servico();

				// Receber o idServico
				servico.setIdServico(rset.getInt("idServico"));
				// Receber o banho
				servico.setBanho(rset.getBoolean("banho"));
				// Receber o tosa
				servico.setTosa(rset.getBoolean("tosa"));
				// Receber o atendimentoMedico
				servico.setAtendimentoMedico(rset.getBoolean("atendimentoMedico"));
				// Receber o observacao
				servico.setObservacao(rset.getString("observacao"));

				// Salvar dentro do nosso Array de Serviços
				Servicos.add(servico);

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

		return null;
	}

	public void atualizaServicos(Servico servicos) {
		String sql = "UPDATE Servico SET idServico = ?,banho = ?,tosa = ?, atendimentomedico = ?, observacao = ?"
				+ " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionar os valores para atualizar
			pstm.setInt(1, servicos.getIdServico());
			pstm.setBoolean(2, servicos.getBanho());
			pstm.setBoolean(3, servicos.getTosa());
			pstm.setBoolean(4, servicos.getAtendimentoMedico());
			pstm.setString(5, servicos.getObservacao());

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

	private void deletarServico(int id) {

		String sql = "DELETE FROM Servico WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

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
