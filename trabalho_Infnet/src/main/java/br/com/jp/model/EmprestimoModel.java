package br.com.jp.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.jp.model.enumerate.TipoPessoaEnum;

public class EmprestimoModel {
	private Long id;
	private TipoPessoaEnum tipo;
	private BigDecimal valor;
	private Integer parcela;
	private BigDecimal valorParcela;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public TipoPessoaEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoaEnum tipo) {
		this.tipo = tipo;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Integer getParcela() {
		return parcela;
	}
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}
	
	public BigDecimal getValorParcela() {
		return valorParcela.setScale(2, RoundingMode.HALF_UP);
	}
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}
	
}
