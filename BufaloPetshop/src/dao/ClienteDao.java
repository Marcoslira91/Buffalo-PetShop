package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public void criarClienteDao(Cliente cliente) {
	String sql = "INSERT INTO cliente(iDpessoa, nome, cpf, sexo, telefone, email, endereco " + "VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	try {
		// Cria uma conexão com o banco de dados
					conn = ConnectionFactory.createConnectionToMySQL();
					// Criamos uma PrepareStatement para executar as funcoes de conexao
					pstm = (PreparedStatement) conn.prepareStatement(sql);
					// Adicionar os valores que são esperados pela query]
					
	}

}

