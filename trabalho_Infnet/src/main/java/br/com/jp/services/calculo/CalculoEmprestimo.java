package br.com.jp.services.calculo;

import java.math.BigDecimal;

import br.com.jp.model.ClienteModel;

public interface CalculoEmprestimo {
	void calcularEmprestimo(ClienteModel cliente, BigDecimal valorEmprestimo, Integer numeroParcela);
}
