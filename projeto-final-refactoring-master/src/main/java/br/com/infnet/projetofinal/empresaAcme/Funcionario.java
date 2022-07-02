package br.com.infnet.projetofinal.empresaAcme;

abstract class Funcionario {
    public static final int O = 1;
    public static final int A = 2;
    public static final int B = 3;
    public static final int AB = 4;

    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEmAnos;
    public int grupoSanguineo;
    public String logradouro;
    public String cidade;
    public String numero;
    public String cep;
    public String bairro;
    public String numeroConselho;
    
    public Funcionario(int grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Long getTempoDeServicoEmAnos() {
        return tempoDeServicoEmAnos;
    }
    public void setTempoDeServicoEmAnos(Long tempoDeServicoEmAnos) {
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public abstract Double calculaBonusEngenheiro();

    public abstract String getNumeroConselho();
}
