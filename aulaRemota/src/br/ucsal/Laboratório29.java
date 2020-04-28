package br.ucsal;

import java.util.Scanner;

public class Laborat�rio29 {
	
	/* PROBLEMA: elabore uma solu��o no qual o usuario informe um valor inteiro, positivo dentro de um intervalo fechado de 500 a 1000. 
	 * Caso o valor informado n�o esteja dentro do intervalo definido, deve-se solicitar que ele informe o valor novamente. Caso contr�rio, 
	 * o valor informado ser� impresso e a execu��o finalizada.
	 * 
     Utilize a estrutura de repeti��o (do / while). */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.println("Informe um valor entre 500 e 1000: ");
			valor = sc.nextInt();
			
			
		} while (valor <= 500 || valor >= 1000); 
			
		System.out.println("Valor informado pelo usu�rio: " + valor);
		
		
		
		sc.close();
		

	}

}
