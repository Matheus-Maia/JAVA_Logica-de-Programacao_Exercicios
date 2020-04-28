package br.ucsal;

import java.util.Scanner;

public class Laboratório21 {
	
	/* PROBLEMA: Elabore uma solução para construir uma sequencia de valores inteiros positivos, na qual o primeiro valor é 0 e o último 50. */

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
