package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Veterinario;

public class VeterinarioDao {
	// CRUD
	public void criarVeterinario(Veterinario veterinario) {
		String sql = "INSERT INTO Veterinario(idVeterinario, nome, cpf, crmv, sexo, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, veterinario.getIdVeterinario());
			pstm.setString(2, veterinario.getNome());
			pstm.setLong(3, veterinario.getCpf());
			pstm.setInt(4, veterinario.getCrmv());
			pstm.setString(5, veterinario.getSexo());
			pstm.setLong(6, veterinario.getTelefone());
			pstm.setString(7, veterinario.getEmail());
			pstm.setString(8, veterinario.getEndereco());

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

	public void atualizaVeterinario(Veterinario veterinario) {
		String sql = "UPDATE Veterinario SET nome = ?, cpf = ?, crmv = ?, sexo = ?, telefone = ?, email = ?, endereco = ?"
				+ " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// Adicionar os valores para atualizar
			pstm.setString(1, veterinario.getNome());
			pstm.setLong(2, veterinario.getCpf());
			pstm.setInt(3, veterinario.getCrmv());
			pstm.setString(4, veterinario.getSexo());
			pstm.setLong(5, veterinario.getTelefone());
			pstm.setString(6, veterinario.getEmail());
			pstm.setString(7, veterinario.getEndereco());

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
}
