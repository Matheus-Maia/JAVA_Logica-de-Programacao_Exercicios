package br.ucsal;

import java.util.Scanner;

public class Laborat�rio04 {

	/*crie uma solu��o para a partir de 03 valores inteiros, positivos informados 
	 * pelo usu�rio seja identificado se corresponde a um tri�ngulo is�sceles, equil�tero ou escaleno.*/

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
			System.out.println("ERRO! Digite apenas n�meros inteiros e positivos!");
		}else if (A == B && A == C) {
			System.out.println("O triangulo � Equil�tero");
		}else if (A != B && A != C && B != C)  {
			System.out.println(" O triangulo � Escaleno");
		}else {
			System.out.println(" O triangulo � Is�sceles");
		}




		ent.close();


	}

}
