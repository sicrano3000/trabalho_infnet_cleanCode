package br.com.jp.services;

import java.math.BigDecimal;

import br.com.jp.exception.CalculoException;
import br.com.jp.model.ClienteModel;
import br.com.jp.services.calculo.Aposentado;
import br.com.jp.services.calculo.CalculoEmprestimo;
import br.com.jp.services.calculo.Pensionista;
import br.com.jp.services.calculo.PessoaFisica;
import br.com.jp.services.calculo.PessoaJuridica;

public class EmprestimoService {
	
	public void calcularEmprestimoDoCliente(ClienteModel cliente, BigDecimal valorEmprestimo, Integer numeroParcela, CalculoEmprestimo calculo) {
		calculo.calcularEmprestimo(cliente, valorEmprestimo, numeroParcela);
		
		String ofertaEmprestimo = "Olá "
				.concat(cliente.getNome())
				.concat(" Você tem um valor de emprestimo disponível de: ")
				.concat(cliente.getEmprestimo().getValor().toString())
				.concat(" com ")
				.concat(cliente.getEmprestimo().getParcela().toString())
				.concat(" parcelas de ")
				.concat(cliente.getEmprestimo().getValorParcela().toString());
		
		System.out.println(ofertaEmprestimo);
	}
	
	public void calcularEmprestimoDoCliente(ClienteModel cliente, BigDecimal valorEmprestimo, Integer numeroParcela) {
		switch (cliente.getTipoPessoa()) {
		case APOSENTADO:
			calcularEmprestimoDoCliente(cliente, valorEmprestimo, numeroParcela, new Aposentado());
			break;
		case PENSIONISTA:
			calcularEmprestimoDoCliente(cliente, valorEmprestimo, numeroParcela, new Pensionista());
			break;
		case PESSOA_JURIDICA:
			calcularEmprestimoDoCliente(cliente, valorEmprestimo, numeroParcela, new PessoaJuridica());
			break;
		case PESSOA_FISICA:
			calcularEmprestimoDoCliente(cliente, valorEmprestimo, numeroParcela, new PessoaFisica());
			break;
		default: 
			throw new CalculoException("Não podemos ofertar um emprestimo no momento!");
		}
	}
	
}
