package br.ucsal;

import java.util.Scanner;

public class Laborat�rio22 {
	
	/* PROBLEMA: elabore uma solu��o para construir uma sequencia de valores inteiros positivos, pares na qual o �ltimo valor 
	 * n�o pode ser maior que 50. (N�o entra o zero, Utilize While) */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seq = 1;
		
		while(seq <= 50) {
			if(seq % 2 == 0) {
				System.out.print(seq + " ");
			}
			seq++;
		}
		
		
sc.close();
	}

}
