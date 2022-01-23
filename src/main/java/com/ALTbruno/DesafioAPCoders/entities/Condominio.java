package com.ALTbruno.DesafioAPCoders.entities;

import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_CONDOMINIOS")
public class Condominio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
//	@CNPJ
	@Size(min = 14, max = 18)
	private String cnpj;

	@NotBlank
	@Size(max = 100)
	private String nome;

	@NotBlank
	@Size(min = 10, max = 15)
	private String telefone;

	@Email
	private String email;

	@NotBlank
	@Size(max = 100)
	private String sindico;

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

	public Condominio() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSindico() {
		return sindico;
	}

	public void setSindico(String sindico) {
		this.sindico = sindico;
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

}
