package br.com.jp.observer;

import java.math.BigDecimal;

import br.com.jp.model.ClienteModel;
import br.com.jp.services.EmprestimoService;

public class EmprestimoObervador implements Observador {

	@Override
	public void atualizar(ClienteModel cliente) {
		EmprestimoService emprestimoService = new EmprestimoService();
		emprestimoService.calcularEmprestimoDoCliente(cliente, new BigDecimal(10000), 24);
	}
	
}
