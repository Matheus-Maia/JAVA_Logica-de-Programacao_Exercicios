package br.ucsal;

import java.util.Scanner;

public class Laboratório11 {

	/* PROBLEMA: a partir de três valores decimais quaisquer informados pelo 
	 * usuário, elabore uma solução para identificar qual é o maior e qual é o menor 
	 * dos três números.
	 * Obs: utilizar a estrutura que achar mais adequada para a solução. */


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
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);

		}else if (a >= b && a >= c && c <= b) {
			maior = a;
			menor = c;
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);

		}else if (b >= a && b >= c && c >= a) {
			maior = b;
			menor = a;
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);

		}else if (b >= a && b >= c && c <= a) {
			maior = b;
			menor = c;
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);

		}else if(c >= a && c >= b && a >= b) {
			maior = c;
			menor = b;
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);

		}else if (c >= a && c >= b && a <= b) {
			maior = c;
			menor = a;
			System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor);
		}

		ent.close();

	}


}
