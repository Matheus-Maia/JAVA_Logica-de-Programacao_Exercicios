package br.ucsal;

import java.util.Scanner;

public class Laborat�rio24 {
	
	/* PROBLEMA: elabore uma solu��o para construir uma sequencia de valores inteiros positivos que sejam ao mesmo tempo impares e 
	 * divis�veis por 3, na qual o �ltimo valor n�o pode ser maior que 100. (N�o entra o zero, utilize While) */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seq = 1;
		
		while(seq <= 100) {
			if(seq % 2 != 0 && seq % 3 == 0) {
				System.out.print(seq + " ");
			}
			seq++;
		}
		
sc.close();
	}

}
