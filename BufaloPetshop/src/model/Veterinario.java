package model;

public class Veterinario extends Pessoa {
	private int crmv;

	// Construtor de Veterinario
	public Veterinario(int crmv, int idPessoa, String nome, long cpf, char sexo, long telefone, String email,
			String endereco) {
		super(idPessoa, nome, cpf, sexo, telefone, email, endereco);
		this.crmv = crmv;
	}

	// Getters and Setters de Veterinario
	public int getCrmv() {
		return crmv;
	}

	public void setCrmv(int crmv) {
		this.crmv = crmv;
	}

}
