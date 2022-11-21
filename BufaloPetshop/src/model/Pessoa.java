package model;

public class Pessoa {

	private String nome;
	private long cpf;
	private String sexo;
	private long telefone;
	private String email;
	private String endereco;

	// Construtor de Pessoa
	public Pessoa(String nome, long cpf, String sexo, long telefone, String email, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Pessoa() {

	}

	// Getters and Setters de Pessoa

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "Pessoa [Nome: " + nome + ", CPF: " + cpf + ", Sexo: " + sexo + ", Telefone: " + telefone + ", E-mail: "
				+ email + ", Endereco: " + endereco + "]";
	}

}
