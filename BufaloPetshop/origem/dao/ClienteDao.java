package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public void criarClienteDao(Cliente cliente) {
	String sql = "INSERT INTO cliente(iDpessoa, nome, cpf, sexo, telefone, email, endereco, AnoNascimento " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	try {
		// Cria uma conexão com o banco de dados
					conn = ConnectionFactory.createConnectionToMySQL();
					// Criamos uma PrepareStatement para executar as funcoes de conexao
					pstm = (PreparedStatement) conn.prepareStatement(sql);
					// Adicionar os valores que são esperados pela query
					pstm.setString(1, clienteDAO.getiDpessoa());
					pstm.setString(2, clienteDAO.getNome());
					pstm.setInt(3, clienteDAO.getCpf());
					pstm.setChar(4, clienteDAO.getSexo());
					pstm.setInt(5, clienteDAO.getTelefone());
					pstm.setString(6, clienteDAO.getEmail());
					pstm.setString(7, clienteDAO.getEndereco());
					pstm.setDate(8, new Date(clienteDAO.getAnoNascimento().getTime()));
					
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
    public List<ClienteDAO> listarTodosCinteDAO() {
	String sql = "SELECT * FROM clienteDAO";

	List<ClienteDAO> ClienteDAO = new ArrayList<ClienteDAO>();
	Connection conn = null;
	PreparedStatement pstm = null;
	// Classe que vai recuperar(receber) os dados do banco
	ResultSet rset = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySQL();
		pstm = (PreparedStatement) conn.prepareStatement(sql);
		rset = pstm.executeQuery();

		while (rset.next()) {
			Cliente cliente = new ClienteDAO();
			// Receber o id
			contato.setiDpessoa(rset.getInt("iDpessoa"));
			// Receber o nome
			contato.setNome(rset.getString("nome"));
			// Receber a cpf
			contato.setIdade(rset.getInt("cpf"));
			// Receber o sexo
			contato.setSexo(rset.getChar("sexo"));
			// Receber o telefone
			contato.setTelefone(rset.getInt("telefone"));
			// Receber o email
			contato.setEmail(rset.getString("email"));
			// Receber o endereco
			contato.setEndereco(rset.getString("endereco"));
			// Receber o AnoNascimento
			contato.setAnoNascimento(rset.getDate("anonascimento"));
			
			// Salvar dentro do nosso array de clienteDAO
			clienteDAO.add(clienteDAO);
			
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
	return clienteDAO;
 }
    public void atualizaClienteDAO(clienteDAO clienteDAO) {

		String sql = "UPDATE clienteDAO SET iDpessoa = ?,nome = ?,cpf = ?,sexo = ?,telefone = ?,email = ?,endereco = ?"
				+ " anonascimento = ?" + " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, clienteDAO.getiDpessoa());
			pstm.setString(2, clienteDAO.getNome());
			pstm.setInt(3, clienteDAO.getCpf());
			pstm.setChar(4, clienteDAO.getSexo());
			pstm.setInt(5, clienteDAO.getTelefone());
			pstm.setString(6, clienteDAO.getEmail());
			pstm.setString(7, clienteDAO.getEndereco());
			pstm.setDate(8, new Date(clienteDAO.getAnoNascimento().getTime()));

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
    
    public void removerClienteDAO(int id) {
		String sql = "DELETE FROM clienteDAO WHERE id = ?";
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



