package model;

public class Veterinario extends Pessoa {
	private int idVeterinario;
	private int crmv;

	// Construtor de Veterinario
	public Veterinario(int idVeterinario, int crmv, int idPessoa, String nome, long cpf, String sexo, long telefone,
			String email, String endereco) {
		super(nome, cpf, sexo, telefone, email, endereco);
		this.idVeterinario = idVeterinario;
		this.crmv = crmv;
	}

	// Getters and Setters de Veterinario
	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public int getCrmv() {
		return crmv;
	}

	public void setCrmv(int crmv) {
		this.crmv = crmv;
	}

}
