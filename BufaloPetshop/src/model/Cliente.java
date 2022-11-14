package model;

public class Cliente extends Pessoa {
	private Pet pet;

	// Construtor de Cliente
	public Cliente(Pet pet, int idPessoa, String nome, long cpf, char sexo, long telefone, String email, String endereco) {
		super(idPessoa, nome, cpf, sexo, telefone, email, endereco);
		this.pet = pet;
	}

	// Getters and Setters de Pessoa/Pet
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
