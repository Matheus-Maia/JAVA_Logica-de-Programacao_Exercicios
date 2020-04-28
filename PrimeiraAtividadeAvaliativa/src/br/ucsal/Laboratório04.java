package br.ucsal;

import java.util.Scanner;

public class Laboratório04 {

	/*crie uma solução para a partir de 03 valores inteiros, positivos informados 
	 * pelo usuário seja identificado se corresponde a um triângulo isósceles, equilátero ou escaleno.*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int A, B, C; 
		System.out.println("Digite o primeiro valor inteiro e positivo  ");
		A = ent.nextInt();
		System.out.println("Digite o segundo valor inteiro e positivo  ");
		B = ent.nextInt();
		System.out.println("Digite o terceiro valor inteiro e positivo ");
		C = ent.nextInt();		

		if (A < 0 || B < 0 || C < 0) {
			System.out.println("ERRO! Digite apenas números inteiros e positivos!");
		}else if (A == B && A == C) {
			System.out.println("O triangulo é Equilátero");
		}else if (A != B && A != C && B != C)  {
			System.out.println(" O triangulo é Escaleno");
		}else {
			System.out.println(" O triangulo é Isósceles");
		}




		ent.close();


	}

}
