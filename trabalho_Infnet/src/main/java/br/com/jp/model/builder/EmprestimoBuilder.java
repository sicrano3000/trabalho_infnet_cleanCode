package br.com.jp.model.builder;

import java.math.BigDecimal;
import java.util.Random;

import br.com.jp.model.EmprestimoModel;
import br.com.jp.model.enumerate.TipoPessoaEnum;

public class EmprestimoBuilder {
	
	private EmprestimoModel emprestimo;
	
	public static EmprestimoBuilder builder(TipoPessoaEnum tipo) {
		return new EmprestimoBuilder(tipo);
	}
	
	public EmprestimoBuilder(TipoPessoaEnum tipo) {
		this.emprestimo = new EmprestimoModel();
		this.emprestimo.setTipo(tipo);
    }

	public EmprestimoBuilder id() {
		Random random = new Random();
		this.emprestimo.setId(random.nextLong(1000));
		return this;
	}	
	public EmprestimoBuilder valor(BigDecimal valor) {
		this.emprestimo.setValor(valor);
		return this;
	}
	public EmprestimoBuilder parcela(Integer parcela) {
		this.emprestimo.setParcela(parcela);
		return this;
	}
	public EmprestimoBuilder valorParcela(BigDecimal valorParcela) {
		this.emprestimo.setValorParcela(valorParcela);
		return this;
	}

	public EmprestimoModel build() {
        return this.emprestimo;
    }

}
