package model;

public class Servicos {
	private int idServico;
	private Boolean banho;
	private Boolean tosa;
	private Boolean atendimentoMedico;
	private String observacao;

	// Construtor de Serviços
	public Servicos(int idServico, Boolean banho, Boolean tosa, Boolean atendimentoMedico, String observacao) {
		this.idServico = idServico;
		this.banho = banho;
		this.tosa = tosa;
		this.atendimentoMedico = atendimentoMedico;
		this.observacao = observacao;
	}

	// Getters and Setters de Serviços
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public Boolean getBanho() {
		return banho;
	}

	public void setBanho(Boolean banho) {
		this.banho = banho;
	}

	public Boolean getTosa() {
		return tosa;
	}

	public void setTosa(Boolean tosa) {
		this.tosa = tosa;
	}

	public Boolean getAtendimentoMedico() {
		return atendimentoMedico;
	}

	public void setAtendimentoMedico(Boolean atendimentoMedico) {
		this.atendimentoMedico = atendimentoMedico;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	// toString para o Serviços
	@Override
	public String toString() {
		return "Servicos [idServico=" + idServico + ", banho=" + banho + ", tosa=" + tosa + ", atendimentoMedico="
				+ atendimentoMedico + ", observacao=" + observacao + "]";
	}

}
