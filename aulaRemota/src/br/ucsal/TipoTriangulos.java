package br.ucsal;

import java.util.Scanner;

public class TipoTriangulos {
	/* Problema: elabore uma solu��o para que ap�s o usu�rio informar 03 valores representando os
	   tr�s lados de um tri�ngulo seja apresentado o tipo de tri�ngulo quanto aos lados: tri�ngulo
	   equil�tero, escaleno ou is�sceles.
	   OBS: considere que os valores representam um tri�ngulo. */
	 
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		// escreva a seguinte frase: "Informe os 3 lados do tri�ngulo: "
		System.out.println("Informe os 3 lados do tri�ngulo: ");
		
		// Guarde os 3 valores digitados pelo usuario em 3 variaveis	
		double lado1 = ent.nextDouble();
		double lado2 = ent.nextDouble();
		double lado3 = ent.nextDouble();
		
		// Se todos os lados forem iguais entao escreva "triangulo equilatero"
		if (lado1 == lado2 && lado2 == lado3) {
			
			System.out.println("Tri�ngulo Equil�tero");
			
		} else {
			//Senao se apenas 2 lados forem iguais escreva "Triangulo isosceles" (o simbolo "||" significa "OU")
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {
				/*Se nao for nenhuma das 2 alternativas acima significa que todos lados vao ser diferentes entao
				  nao precisa nem escrever uma logica. Apenas escreva: "Tri�ngulo escaleno"*/
				System.out.println("Tri�ngulo escaleno");
			}
			
		}
		
		ent.close();

	}

}
