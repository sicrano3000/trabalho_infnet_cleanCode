package br.com.infnet.projetofinal.calculadora.calcular;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RealizaCalculo {
	
	public static String calcularPlanoCartesiano(Integer x1, Integer x2, Integer y1, Integer y2) {
		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2));
        NumberFormat formatter = new DecimalFormat("#0.0000");
        
        return formatter.format(distancia);
	}

}
