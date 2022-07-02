package br.com.infnet.projetofinal.empresaAcme;

import java.util.Date;

public class Engenheiro extends Funcionario{
    private Long matricula;

    public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Engenheiro(int grupoSanguineo) {
        super(grupoSanguineo);
    }

    @Override
    public Double calculaBonusEngenheiro() {
        return getTempoDeServicoEmAnos() * 3.7;
    }

    @Override
    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

}
