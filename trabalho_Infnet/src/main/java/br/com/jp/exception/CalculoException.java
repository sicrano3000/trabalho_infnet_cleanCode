package br.com.jp.exception;

public class CalculoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CalculoException(String mensagem) {
		super(mensagem);
	}
}
