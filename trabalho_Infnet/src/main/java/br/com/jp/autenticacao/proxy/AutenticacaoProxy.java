package br.com.jp.autenticacao.proxy;

import br.com.jp.exception.CalculoException;
import br.com.jp.model.ClienteModel;
import br.com.jp.model.mock.ClienteMock;

public class AutenticacaoProxy extends ClienteMock {
	protected String usuario, senha;

	public AutenticacaoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public ClienteModel getClienteMock() {
		if (temPermissaoDeAcesso()) {
			return super.getClienteMock();
		}
		throw new CalculoException("Usuário e senha inválidos!");
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
