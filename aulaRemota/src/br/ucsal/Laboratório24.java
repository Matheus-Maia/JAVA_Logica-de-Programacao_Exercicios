package br.ucsal;

import java.util.Scanner;

public class Laboratório24 {
	
	/* PROBLEMA: elabore uma solução para construir uma sequencia de valores inteiros positivos que sejam ao mesmo tempo impares e 
	 * divisíveis por 3, na qual o último valor não pode ser maior que 100. (Não entra o zero, utilize While) */

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
