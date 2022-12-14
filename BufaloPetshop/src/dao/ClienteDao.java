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
	public void createCliente(Cliente cliente) {
		String sql = "INSERT INTO Cliente(idPet, idCliente, nome, cpf, sexo, telefone, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, cliente.getPet().getIdPet());
			pstm.setInt(2, cliente.getIdCliente());
			pstm.setString(3, cliente.getNome());
			pstm.setLong(4, cliente.getCpf());
			pstm.setString(5, cliente.getSexo());
			pstm.setLong(6, cliente.getTelefone());
			pstm.setString(7, cliente.getEmail());
			pstm.setString(8, cliente.getEndereco());

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

	public List<Cliente> listaTodoscliente() {
		String sql = "SELECT * FROM Cliente";

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
				Cliente cliente = new Cliente();

				// Receber o pet
	
				// Receber o idCliente
				cliente.setIdCliente(rset.getInt("idCliente"));
				// Receber o nome
				cliente.setNome(rset.getString("nome"));
				// Receber o CPF
				cliente.setCpf(rset.getLong("cpf"));
				// Receber o sexo
				cliente.setSexo(rset.getString("sexo"));
				// Receber o telefone
				cliente.setTelefone(rset.getLong("telefone"));
				// Receber o email
				cliente.setEmail(rset.getString("email"));
				// Receber o endereco
				cliente.setEndereco(rset.getString("endereco"));

				// Salvar dentro do nosso Array de cliente
				clientes.add(cliente);
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

	public void atualizaCliente(Cliente cliente) {
		String sql = "UPDATE Cliente SET nome = ?, cpf = ?, sexo = ?, telefone = ?, email = ?, endereco = ?"
				+ " WHERE idCliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, cliente.getNome());
			pstm.setLong(2, cliente.getCpf());
			pstm.setString(3, cliente.getSexo());
			pstm.setLong(4, cliente.getTelefone());
			pstm.setString(5, cliente.getEmail());
			pstm.setString(6, cliente.getEndereco());

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
		String sql = "SELECT * FROM Cliente WHERE idCliente = ? or cpf = ?";
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

		String sql = "DELETE FROM Cliente WHERE idCliente = ?";
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
