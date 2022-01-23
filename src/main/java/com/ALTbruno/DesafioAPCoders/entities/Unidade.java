package com.ALTbruno.DesafioAPCoders.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_UNIDADES")
public class Unidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@NotBlank
	private String identificacao;

	@NotBlank
	@Size(max = 100)
	private String proprietario;

	@NotBlank
	@Size(max = 75)
	private String logradouro;

	@NotBlank
	@Size(max = 7)
	private String numero;

	@NotBlank
	@Size(max = 40)
	private String bairro;

	@NotBlank
	@Size(max = 40)
	private String cidade;

	@NotBlank
	@Size(min = 2, max = 2)
	private String uf;

	@NotBlank
	@Size(min = 5, max = 9)
	private String cep;

	@ManyToOne
	@JoinColumn(name = "condominio_id")
	private Condominio condominio;

	public Unidade() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}
}
