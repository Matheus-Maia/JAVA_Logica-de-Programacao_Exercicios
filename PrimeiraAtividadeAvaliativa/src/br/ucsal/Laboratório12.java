package br.ucsal;

import java.util.Scanner;

public class Laboratório12 {

	/* PROBLEMA: a partir da velocidade obtida do veículo (informada pelo usuário) registre 
	 * a multa aplicada considerando a seguinte tabela:
	 * acima de 40Km ................. R$ 160,00
	 * acima de 60Km ................. R$ 200,00
	 * acima de 80Km ................. R$ 300,00 */	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a velocidade: ");
		double ve = sc.nextDouble();
		int chave;

		if(ve <= 40) {
			chave = 1;
		} else if (ve <= 60) {
			chave = 2;
		} else if (ve <= 80) {
			chave = 3;
		} else {
			chave = 0;
		}

		switch (chave) {
		case 1:
			System.out.println("Não tem multa");
			break;
		case 2:
			System.out.println("acima de 40Km ................. R$ 160,00");
			break;
		case 3:
			System.out.println("acima de 60Km ................. R$ 200,00");
			break;
		default:
			System.out.println("acima de 80Km ................. R$ 300,00");
			break;
		}

		sc.close();
	}

}
