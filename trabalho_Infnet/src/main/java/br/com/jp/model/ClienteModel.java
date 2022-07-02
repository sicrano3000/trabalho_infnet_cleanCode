package br.com.jp.model;

import java.util.ArrayList;

import br.com.jp.model.builder.ClienteBuilder;
import br.com.jp.model.enumerate.TipoPessoaEnum;
import br.com.jp.observer.Observador;

public class ClienteModel {
	private Long id;
	private String nome;
	private String cpf;
	private Integer idade;
	private TipoPessoaEnum tipoPessoa;
	private ProfissaoModel profissao;
	private EmprestimoModel emprestimo;
	private ArrayList<Observador> observadores = new ArrayList<>();
	
	public void adicionarObservador(Observador observador) {
		if (!observadores.contains(observador)) {
			observadores.add(observador);
		}
	}
	
	public void removerObservador(Observador observador) {
		observadores.remove(observador);
	}
	
	public void notificarObservadores() {
		observadores.forEach(observador -> observador.atualizar(this));
	}
	
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}
	
	public ClienteModel() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public ProfissaoModel getProfissao() {
		return profissao;
	}
	public void setProfissao(ProfissaoModel profissao) {
		this.profissao = profissao;
	}
	
	public void ativarEmprestimo(EmprestimoModel emprestimo) {
		this.emprestimo = emprestimo;		
	}
	public EmprestimoModel getEmprestimo() {
		return emprestimo;
	}
}