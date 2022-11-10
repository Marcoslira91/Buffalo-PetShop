package model;

import java.util.Date;

import javax.xml.crypto.Data;

public class Pet {
	private int id_Pet;
	private String nome;
	private String tipo;
	private String raca;
	private String sexo;
	private Date dataNascimento;

	// Construtor de Pet

	public Pet(int id_Pet, String nome, String tipo, String raca, String sexo, Date dataNascimento) {
		super();
		this.id_Pet = id_Pet;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	// Getters and Setters de Pet
	public int getId_Pet() {
		return id_Pet;
	}

	public void setId_Pet(int id_Pet) {
		this.id_Pet = id_Pet;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// toString para o Pet
	@Override
	public String toString() {
		return "Pet [id_Pet=" + id_Pet + ", nome=" + nome + ", tipo=" + tipo + ", raca=" + raca + ", sexo=" + sexo
				+ ", dataNascimento=" + dataNascimento + "]";
	}

}