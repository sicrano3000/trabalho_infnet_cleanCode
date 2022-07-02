package br.com.infnet.projetofinal.calculadora.service;

import java.util.Scanner;

import br.com.infnet.projetofinal.calculadora.calcular.RealizaCalculo;

public class CalculadoraService {

	public void recuperarDados(){
        Integer x1, x2, y1, y2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite x1");
        x1 = entrada.nextInt();
        System.out.println("Digite x2");
        x2 = entrada.nextInt();
        System.out.println("Digite y1");
        y1 = entrada.nextInt();
        System.out.println("Digite y2");
        y2 = entrada.nextInt();
        
        String resultado = "O resultado do cálculo é "
        		.concat(RealizaCalculo.calcularPlanoCartesiano(x1, x2, y1, y2));
        
        System.out.println(resultado);
    }
	
}
