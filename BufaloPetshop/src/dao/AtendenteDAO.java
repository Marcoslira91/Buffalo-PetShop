package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.*;

public class AtendenteDAO {

	// CRUD
	public void criarAtendente(Atendente atendente) {
		String sql = "INSERT INTO Atendente(idCliente, idVeterinario, idAtendente, nome, cpf, sexo, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, atendente.getCliente().getIdCliente());
			pstm.setInt(2, atendente.getVeterinario().getIdVeterinario());
			pstm.setInt(3, atendente.getIdAtendente());
			pstm.setString(4, atendente.getNome());
			pstm.setLong(5, atendente.getCpf());
			pstm.setString(6, atendente.getSexo());
			pstm.setLong(7, atendente.getTelefone());
			pstm.setString(8, atendente.getEmail());
			pstm.setString(9, atendente.getEndereco());

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

	public void atualizaAtendente(Atendente atendente) {
		String sql = "UPDATE Atendente SET nome = ?, cpf = ?, sexo = ?, telefone = ?, email = ?, endereco = ?"
				+ " WHERE idAtendente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, atendente.getNome());
			pstm.setLong(2, atendente.getCpf());
			pstm.setString(3, atendente.getSexo());
			pstm.setLong(4, atendente.getTelefone());
			pstm.setString(5, atendente.getEmail());
			pstm.setString(6, atendente.getEndereco());

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

	private void removerAtendente(int idAtendente) {

		String sql = "DELETE FROM Atendente WHERE idAtendente = ?";
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
