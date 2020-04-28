package br.ucsal;

import java.util.Scanner;

public class Laboratório22 {
	
	/* PROBLEMA: elabore uma solução para construir uma sequencia de valores inteiros positivos, pares na qual o último valor 
	 * não pode ser maior que 50. (Não entra o zero, Utilize While) */

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
