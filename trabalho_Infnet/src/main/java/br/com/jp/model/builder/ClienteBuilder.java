package br.com.jp.model.builder;

import java.util.Random;

import br.com.jp.model.ClienteModel;
import br.com.jp.model.ProfissaoModel;
import br.com.jp.model.enumerate.TipoPessoaEnum;
import br.com.jp.observer.EmprestimoObervador;

public class ClienteBuilder {
	
	private ClienteModel cliente;
	private ProfissaoModel profissao;
	private EmprestimoObervador emprestimoOberver = new EmprestimoObervador();
	
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}
	
	public ClienteBuilder() {
		this.cliente = new ClienteModel();
		this.profissao = new ProfissaoModel();
		this.cliente.setProfissao(profissao);
		
		cliente.adicionarObservador(emprestimoOberver);
    }

	public ClienteBuilder id() {
		Random random = new Random();
		this.cliente.setId(random.nextLong(1000));		
		this.profissao.setId(random.nextLong(1000));
		return this;
	}
	
	public ClienteBuilder clienteNome(String nome) {
		this.cliente.setNome(nome);
		return this;
	}
	public ClienteBuilder cpf(String cpf) {
		this.cliente.setCpf(cpf);
		return this;
	}
	public ClienteBuilder idade(Integer idade) {
		this.cliente.setIdade(idade);
		return this;
	}
	public ClienteBuilder tipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.cliente.setTipoPessoa(tipoPessoa);
		return this;
	}

	public ClienteBuilder profissaoNome(String nome) {
		this.profissao.setNome(nome);
		return this;
	}
	public ClienteBuilder salario(Double salario) {
		this.profissao.setSalario(salario);
		return this;
	}

	public ClienteModel build() {
		this.cliente.notificarObservadores();
        return this.cliente;
    }
}
