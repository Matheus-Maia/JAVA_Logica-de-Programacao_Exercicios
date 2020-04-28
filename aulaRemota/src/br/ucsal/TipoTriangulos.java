package br.ucsal;

import java.util.Scanner;

public class TipoTriangulos {
	/* Problema: elabore uma solução para que após o usuário informar 03 valores representando os
	   três lados de um triângulo seja apresentado o tipo de triângulo quanto aos lados: triângulo
	   equilátero, escaleno ou isósceles.
	   OBS: considere que os valores representam um triângulo. */
	 
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		// escreva a seguinte frase: "Informe os 3 lados do triângulo: "
		System.out.println("Informe os 3 lados do triângulo: ");
		
		// Guarde os 3 valores digitados pelo usuario em 3 variaveis	
		double lado1 = ent.nextDouble();
		double lado2 = ent.nextDouble();
		double lado3 = ent.nextDouble();
		
		// Se todos os lados forem iguais entao escreva "triangulo equilatero"
		if (lado1 == lado2 && lado2 == lado3) {
			
			System.out.println("Triângulo Equilátero");
			
		} else {
			//Senao se apenas 2 lados forem iguais escreva "Triangulo isosceles" (o simbolo "||" significa "OU")
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			} else {
				/*Se nao for nenhuma das 2 alternativas acima significa que todos lados vao ser diferentes entao
				  nao precisa nem escrever uma logica. Apenas escreva: "Triângulo escaleno"*/
				System.out.println("Triângulo escaleno");
			}
			
		}
		
		ent.close();

	}

}
