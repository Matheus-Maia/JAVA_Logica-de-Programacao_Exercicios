package br.ucsal;

import java.util.Scanner;

public class Laboratório29 {
	
	/* PROBLEMA: elabore uma solução no qual o usuario informe um valor inteiro, positivo dentro de um intervalo fechado de 500 a 1000. 
	 * Caso o valor informado não esteja dentro do intervalo definido, deve-se solicitar que ele informe o valor novamente. Caso contrário, 
	 * o valor informado será impresso e a execução finalizada.
	 * 
     Utilize a estrutura de repetição (do / while). */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.println("Informe um valor entre 500 e 1000: ");
			valor = sc.nextInt();
			
			
		} while (valor <= 500 || valor >= 1000); 
			
		System.out.println("Valor informado pelo usuário: " + valor);
		
		
		
		sc.close();
		

	}

}
