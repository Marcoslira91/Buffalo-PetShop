package model;

public class Pessoa {
	private int id_Pessoa;
	private String nome;
	private long cpf;
	private char sexo;
	private long telefone;
	private String endereco;

	// Construtor de Pessoa

	public Pessoa(int id_Pessoa, String nome, long cpf, char sexo, long telefone, String endereco) {
		super();
		this.id_Pessoa = id_Pessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	// Getters and Setters de Pessoa

	public int getId_Pessoa() {
		return id_Pessoa;
	}

	public void setId_Pessoa(int id_Pessoa) {
		this.id_Pessoa = id_Pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// toString para a Pessoa
	@Override
	public String toString() {
		return "Pessoa [\nId Pessoa: " + id_Pessoa + "\nNome: " + nome + "\nCPF: " + cpf + "\nSexo: " + sexo
				+ "\nTelefone=" + telefone + "\nEndereco: " + endereco + "]";
	}

}
