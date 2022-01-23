package com.ALTbruno.DesafioAPCoders.entities;

import com.ALTbruno.DesafioAPCoders.entities.enums.Sexo;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_INQUILINOS")
public class Inquilino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@NotBlank
	@Size(max = 100)
	private String nome;

	@NotNull
	@Past
	private LocalDate dataNascimento;

	private Integer idade;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@NotBlank
	@Size(min = 10, max = 15)
	private String telefone;

	@NotBlank
	@Email
	private String email;

	@OneToOne(mappedBy = "inquilino")
	private Unidade unidade;

	public Inquilino() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
}
