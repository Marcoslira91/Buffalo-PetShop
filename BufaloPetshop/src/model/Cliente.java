package model;

public class Cliente extends Pessoa {
	private Pet pet;

	// Construtor de Cliente
	public Cliente(int id_Pessoa, String nome, long cpf, char sexo, long telefone, String endereco, Pet pet) {
		super(id_Pessoa, nome, cpf, sexo, telefone, endereco);
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
