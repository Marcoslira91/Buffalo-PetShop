package model;

import java.util.Date;

import javax.xml.crypto.Data;

public class Pet {
	private int idPet;
	private String nome;
	private String tipo;
	private String raca;
	private String sexo;
	private String cor;
	private Date dataNascimento;
	private String pedigree;

	// Construtor de Pet
	public Pet(int idPet, String nome, String tipo, String raca, String sexo, String cor, Date dataNascimento,
			String pedigree) {
		this.idPet = idPet;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.sexo = sexo;
		this.cor = cor;
		this.dataNascimento = dataNascimento;
		this.pedigree = pedigree;
	}

	// Getters and Setters de Pet
	public int getIdPet() {
		return idPet;
	}

	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}

	// toString para o Pet
	@Override
	public String toString() {
		return "Pet [Id Pet: " + idPet + ", Nome: " + nome + ", Tipo: " + tipo + ", Raca: " + raca + ", Sexo: " + sexo
				+ ", Cor: " + cor + ", Data de Nascimento=" + dataNascimento + ", Pedigree=" + pedigree + "]";
	}

}
