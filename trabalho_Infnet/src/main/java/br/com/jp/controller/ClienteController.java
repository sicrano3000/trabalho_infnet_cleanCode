package br.com.jp.controller;

import br.com.jp.autenticacao.proxy.AutenticacaoProxy;
import br.com.jp.model.mock.ClienteMock;

public class ClienteController {
	
	public static void main(String[] args) throws InterruptedException {
		ClienteMock login = new AutenticacaoProxy("admin", "admin");
		login.getClienteMock();
	}
	
}
