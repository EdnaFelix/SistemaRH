package SistemaRH.model;

import java.sql.Date;

public abstract class Pessoa {
	private String nome;
	private Date data_nascimento;
	private String CPF;
	private String etnia;
	private boolean PCD;
	private String cod_concurso;
	protected String status;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public boolean isPCD() {
		return PCD;
	}

	public void setPCD(boolean pCD) {
		PCD = pCD;
	}

	public String getCod_concurso() {
		return cod_concurso;
	}

	public void setCod_concurso(String cod_concurso) {
		this.cod_concurso = cod_concurso;
	}

	public String getStatus() {
		return status;
	}
	public abstract String MudarStatus(String status);
}
