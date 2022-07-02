package br.com.infnet.projetofinal.empresaAcme.service;

public class EngenheiroService {

	public Integer verificaQualificacoesParaTrabalhoFora(Boolean temMestrado, Integer notaMestrado,
			boolean temDoutorado, Integer notaDoutorado, boolean ehMenorDe50Anos, boolean fluenteEmIngles) {
		Integer aprovado = -1;

		if (fluenteEmIngles) {
			if (temMestrado) {
				if (notaMestrado > 7) {
					aprovado = 1;
				}
			} else if (temDoutorado) {
				if (notaDoutorado > 5) {
					aprovado = 1;
				}
			}
		}

		return aprovado;
	}

}
