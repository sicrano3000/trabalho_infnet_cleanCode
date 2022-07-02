package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{
    private Long matricula;
    private Long quantidadeDeVendas;

    //Armazena um curso e sua nota;
    private List<Map<String, Integer>>cursos;

    public Vendedor(int grupoSanguineo) {
        super(grupoSanguineo);
    }

    @Override
    public Double calculaBonusEngenheiro() {
        return 0.0;
    }

    @Override
    public String getNumeroConselho() {
        return null;
    }

    public List<Map<String, Integer>> getCursos() {
        return cursos;
    }
    public void setCursos(List<Map<String, Integer>> cursos) {
        this.cursos = cursos;
    }
    
    public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Long getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}
	public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }
	
	public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
		this.quantidadeDeVendas = quantidadeDeVendas;
	}

	public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        int quantidadeDeCursos = cursos.size();
        
        if(quantidadeDeVendas > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        
        return isPlatinum;
    }

}
