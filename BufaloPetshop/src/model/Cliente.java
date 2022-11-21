package model;

public class Cliente extends Pessoa {
	private int idCliente;
	private Pet pet;

	// Construtor de Cliente
	public Cliente(int idCliente, Pet pet, String nome, long cpf, String sexo, long telefone,
			String email, String endereco) {
		super(nome, cpf, sexo, telefone, email, endereco);
		this.idCliente = idCliente;
		this.pet = pet;
	}

	public Cliente() {

	}

	// Getters and Setters de Cliente
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	// toString para a Cliente
	@Override
	public String toString() {
		return "Cliente [Id Cliente: " + idCliente + "Pet: " + pet + "]";
	}

}
