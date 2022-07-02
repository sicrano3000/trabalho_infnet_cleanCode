package br.com.jp.model.mock;

import br.com.jp.model.ClienteModel;
import br.com.jp.model.builder.ClienteBuilder;
import br.com.jp.model.enumerate.TipoPessoaEnum;

public class ClienteMock {
	
	private ClienteModel mockCliente() {		
		ClienteModel cliente = ClienteBuilder.builder()
				.id()
				.clienteNome("Jonathan")
				.cpf("11111111111")
				.idade(33)
				.tipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA)
				.profissaoNome("Dev")
				.salario(13000.)
				.build();
		
		return cliente;
	}

	public ClienteModel getClienteMock() {
		return mockCliente();
	}
}
