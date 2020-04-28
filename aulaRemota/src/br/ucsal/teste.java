package br.ucsal;

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {

		int		numSeq = 10, limSeq,
				contagem = 0,
				primNum = 0, ultNum = 0,
				numPar = 0, numImp = 0, numImp3 = 0,
				somaElem = 0,
				num13 = 0, num21 = 0 ;
		final int razao = 6;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Informe o valor limite da sequencia: ");
			limSeq = entrada.nextInt();	
		} while (limSeq < 50 || limSeq > 100);

		System.out.println("\nSequência: ");

		do {
			System.out.print(numSeq + " ");
			ultNum = numSeq;
			contagem ++;

			if (contagem == 1) {
				primNum = numSeq;
			} else if (contagem == 13) {
				num13 = numSeq;
			} else if (contagem == 21) {
				num21 = numSeq;
			}

			if (numSeq % 2 == 0) {
				numPar ++;
			} else {
				numImp ++;
				if (numSeq % 3 == 0) {
					numImp3 ++;
				}
			}

			somaElem = somaElem + numSeq;
			numSeq = numSeq + razao;

		} while (numSeq <= limSeq);

		System.out.println("\n\nNº elementos: " + contagem);
		System.out.println("Média aritmética do primeiro (" + primNum + ") e último (" + ultNum + ") é: " + (primNum + ultNum)/2);
		System.out.println("Qtd. números pares: " + numPar);
		System.out.println("Qtd. números ímpares: " + numImp);
		System.out.println("Qtd. números ímpares div. por 3: " + numImp3);
		System.out.println("Soma dos elementos: " + somaElem);
		System.out.println("Média ponderada do 13º (" + num13 + ") e 21º (" + num21 + ") para pesos 4 e 6 é: " + (((num13 * 4) + (num21 * 6))/(4+6)));

		entrada.close();

	}

}



