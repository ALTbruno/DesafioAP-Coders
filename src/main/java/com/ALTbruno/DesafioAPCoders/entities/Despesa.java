package com.ALTbruno.DesafioAPCoders.entities;

import com.ALTbruno.DesafioAPCoders.entities.enums.StatusPagamentoDespesa;
import com.ALTbruno.DesafioAPCoders.entities.enums.TipoDespesa;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "TB_DESPESAS")
public class Despesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String descricao;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoDespesa tipo;

	@NotNull
	@DecimalMin(value = "0", inclusive = false)
	private BigDecimal valor;

	@NotNull
	private LocalDate vencimento;

	@NotNull
	@Enumerated(EnumType.STRING)
	private StatusPagamentoDespesa status;

	@ManyToOne
	@JoinColumn(name = "unidade_id")
	private Unidade unidade;


	public Despesa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoDespesa getTipo() {
		return tipo;
	}

	public void setTipo(TipoDespesa tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public StatusPagamentoDespesa getStatus() {
		return status;
	}

	public void setStatus(StatusPagamentoDespesa status) {
		this.status = status;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
}
