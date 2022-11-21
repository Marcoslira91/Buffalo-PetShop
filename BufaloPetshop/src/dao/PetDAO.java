package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Pet;

public class PetDAO {

	// CRUD
	public void createPet(Pet pet) {
		String sql = "INSERT INTO Pet(idPet, nome, tipo, raca, sexo, cor, dataNascimento, pedigree) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionando os valores que são esperados pela query
			pstm.setInt(1, pet.getIdPet());
			pstm.setString(2, pet.getNome());
			pstm.setString(3, pet.getTipo());
			pstm.setString(4, pet.getRaca());
			pstm.setString(5, pet.getSexo());
			pstm.setString(6, pet.getCor());
			pstm.setDate(7, new Date(pet.getDataNascimento().getTime()));
			pstm.setString(8, pet.getPedigree());

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

	public List<Pet> listarTodosPets() {
		String sql = "SELECT * FROM Pet";

		List<Pet> pets = new ArrayList<Pet>();
		Connection conn = null;
		PreparedStatement pstm = null;
		// Classe que vai recuperar(receber) os dados do banco
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Pet pet = new Pet();
				// Receber o id
				pet.setIdPet(rset.getInt("idPet"));
				// Receber o nome
				pet.setNome(rset.getString("nome"));
				// Receber o tipo
				pet.setTipo(rset.getString("tipo"));
				// Receber a raça
				pet.setRaca(rset.getString("raca"));
				// Receber o sexo
				pet.setSexo(rset.getString("sexo"));
				// Receber a cor
				pet.setCor(rset.getString("cor"));
				// Recebe a data de Nascimento
				pet.setDataNascimento(rset.getDate("dataNascimento"));
				// Recebe o pedigree
				pet.setPedigree(rset.getString("pedigree"));

				// Salvar dentro do nosso Array de Pets
				pets.add(pet);

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
		return pets;
	}

	public void atualizaPet(Pet pet) {

		String sql = "UPDATE Pet SET nome = ?, tipo = ?, raca = ?, sexo = ?, cor = ?, dataNascimento = ?, pedigree = ?"
				+ " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, pet.getNome());
			pstm.setString(2, pet.getTipo());
			pstm.setString(3, pet.getRaca());
			pstm.setString(4, pet.getSexo());
			pstm.setString(5, pet.getCor());
			pstm.setDate(6, new Date(pet.getDataNascimento().getTime()));
			pstm.setString(7, pet.getPedigree());

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

	private void removerPet(int id) {

		String sql = "DELETE FROM Pet WHERE id = ?";
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
