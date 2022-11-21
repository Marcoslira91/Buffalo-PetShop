package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Cliente;
import model.Pet;

public class ClienteDao {
	// CRUD
	public void createCliente(Cliente clientes) {
		String sql = "INSERT INTO Cliente(pet, idPessoa, nome, cpf, sexo, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, clientes.getPet());
			pstm.setInt(2, clientes.getIdPessoa());
			pstm.setString(3, clientes.getNome());
			pstm.setLong(4, clientes.getCpf());
			pstm.setString(5, clientes.getSexo());
			pstm.setLong(6, clientes.getTelefone());
			pstm.setString(7, clientes.getEmail());
			pstm.setString(8, clientes.getEndereco());

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

	public List<Cliente> listaTodosClientes(Cliente clientes) {
		String sql = "SELECT * FROM Clientes";

		List<Cliente> clientes = new ArrayList<Cliente>();
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
				Cliente clientes = new Cliente(null, 0, sql, 0, sql, 0, sql, sql);

				// Receber o pet

				// Receber o idPessoa
				clientes.setIdPessoa(rset.getInt("idPessoa"));
				// Receber o nome
				clientes.setNome(rset.getString("nome"));
				// Receber o CPF
				clientes.setCpf(rset.getLong("cpf"));
				// Receber o sexo
				clientes.setSexo(rset.getString("sexo"));
				// Receber o telefone
				clientes.setTelefone(rset.getLong("telefone"));
				// Receber o email
				clientes.setEmail(rset.getString("email"));
				// Receber o endereco
				clientes.setEndereco(rset.getString("endereco"));

				// Salvar dentro do nosso Array de Clientes
				clientes.add(Cliente);
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
		return clientes;
	}

	public void atualizaCliente(Cliente clientes) {
		String sql = "UPDATE Cliente SET nome = ?, nome = ?, cpf = ?, sexo = ?, telefone = ?, email = ?, endereco = ?"
				+ " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, clientes.getNome());
			pstm.setLong(2, clientes.getCpf());
			pstm.setString(3, clientes.getSexo());
			pstm.setLong(4, clientes.getTelefone());
			pstm.setString(5, clientes.getEmail());
			pstm.setString(6, clientes.getEndereco());

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
	private void pesquisaCliente(int id) {
		String sql = "SELECT id FROM Cliente WHERE time id = ?";
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
	
	private void removerCliente(int id) {

		String sql = "DELETE FROM Cliente WHERE id = ?";
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
