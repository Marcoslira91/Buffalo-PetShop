package model;

public class Atendente extends Pessoa {

	private int idAtendente;
	private Pet pet;
	private Cliente cliente;
	private Veterinario veterinario;

	// Construtor de Atendente
	public Atendente(int idAtendente, Pet pet, Cliente cliente, Veterinario veterinario, String nome,
			long cpf, String sexo, long telefone, String email, String endereco) {
		super(nome, cpf, sexo, telefone, email, endereco);
		this.idAtendente = idAtendente;
		this.pet = pet;
		this.cliente = cliente;
		this.veterinario = veterinario;
	}

	// Getters and Setters de Atendente
	public int getIdAtendente() {
		return idAtendente;
	}

	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	// toString para a Atendente
	@Override
	public String toString() {
		return "Atendente [Id Atendente: " + idAtendente + ", Pet: " + pet + ", Cliente: " + cliente + ", Veterinario: "
				+ veterinario + "]";
	}

}
