package br.ucsal;

import java.util.Scanner;

public class Laborat�rio21 {
	
	/* PROBLEMA: Elabore uma solu��o para construir uma sequencia de valores inteiros positivos, na qual o primeiro valor � 0 e o �ltimo 50. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seq = 0;
		
		while(seq <=50) {
			System.out.print(seq + " ");
			seq++;
		}
		
		sc.close();

	}

}
