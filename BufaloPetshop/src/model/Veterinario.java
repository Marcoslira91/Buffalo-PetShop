package model;

public class Veterinario extends Pessoa {
	private int crmv;
	
	// Construtor de Veterinario
	public Veterinario(int id_Pessoa, String nome, long cpf, char sexo, long telefone, String endereco, int crmv) {
		super(id_Pessoa, nome, cpf, sexo, telefone, endereco);
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
