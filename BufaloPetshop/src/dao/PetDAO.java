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
		String sql = "INSERT INTO Pet(idPet, Nome, TipoPet, Raca, Sexo, AnoNascimento) VALUES (?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criando uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			//Criando uma PrepareStatement para executar as funções de conexão
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			//Adicionando os valores que são esperados pela query
			pstm.setInt(1, pet.getId_Pet());
			pstm.setString(2, pet.getNome());
			pstm.setString(3, pet.getTipo());
			pstm.setString(4, pet.getRaca());
			pstm.setString(5, pet.getSexo());
			pstm.setDate(6, new Date(pet.getDataNascimento().getTime()));
			
			//Executando a query
			pstm.execute();
			System.out.println("Executado com sucesso");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Fechando a conexão
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
