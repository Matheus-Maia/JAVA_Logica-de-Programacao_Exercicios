package br.ucsal;

import java.util.Scanner;

public class Laborat�rio11 {

	/* PROBLEMA: a partir de tr�s valores decimais quaisquer informados pelo 
	 * usu�rio, elabore uma solu��o para identificar qual � o maior e qual � o menor 
	 * dos tr�s n�meros.
	 * Obs: utilizar a estrutura que achar mais adequada para a solu��o. */


	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);

		System.out.println("Informe os 3 valores: ");
		double a = ent.nextDouble();
		double b = ent.nextDouble();
		double c = ent.nextDouble();
		double maior, menor;

		if (a >= b && a >= c && c >= b) {
			maior = a;
			menor = b;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);

		}else if (a >= b && a >= c && c <= b) {
			maior = a;
			menor = c;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);

		}else if (b >= a && b >= c && c >= a) {
			maior = b;
			menor = a;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);

		}else if (b >= a && b >= c && c <= a) {
			maior = b;
			menor = c;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);

		}else if(c >= a && c >= b && a >= b) {
			maior = c;
			menor = b;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);

		}else if (c >= a && c >= b && a <= b) {
			maior = c;
			menor = a;
			System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor);
		}

		ent.close();

	}


}
