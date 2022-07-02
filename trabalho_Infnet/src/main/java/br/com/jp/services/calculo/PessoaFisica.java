package br.com.jp.services.calculo;

import java.math.BigDecimal;
import java.math.MathContext;

import br.com.jp.model.ClienteModel;
import br.com.jp.model.EmprestimoModel;
import br.com.jp.model.builder.EmprestimoBuilder;
import br.com.jp.model.enumerate.TipoPessoaEnum;

public class PessoaFisica implements CalculoEmprestimo {

	@Override
	public void calcularEmprestimo(ClienteModel cliente, BigDecimal valorEmprestimo, Integer numeroParcela) {
		BigDecimal numeroDeParcelas = new BigDecimal(numeroParcela);
		BigDecimal valorDaParcela = valorEmprestimo.divide(numeroDeParcelas, MathContext.DECIMAL128);
		BigDecimal juros = valorDaParcela.multiply(new BigDecimal(0.6)).multiply(new BigDecimal(1));
		
		EmprestimoModel emprestimo = EmprestimoBuilder.builder(TipoPessoaEnum.PESSOA_FISICA)
				.id()
				.valor(valorEmprestimo)
                .parcela(numeroParcela)
                .valorParcela(valorDaParcela.add(juros))
                .build();
		
		cliente.ativarEmprestimo(emprestimo);
	}

}
