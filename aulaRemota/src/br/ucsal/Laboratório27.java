package br.ucsal;

import java.util.Scanner;

public class Laborat�rio27 {
	
	/* PROBLEMA: elabore uma solu��o para imprimir uma seq��ncia de nove (09) valores inteiros positivos, iniciada pelos
	 *  n�meros 1 e 2, onde os valores seguintes (posteriores) dever�o ser obtidos pela multiplica��o dos dois n�meros 
	 *  imediatamente anteriores.
	 *  
	Ao final apresente as seguintes informa��es:
	
a) A seq��ncia impressa
b) A m�dia aritm�tica obtida com o 7� e o �ltimo n�mero da seq��ncia
c) A soma de todos os n�meros da seq��ncia
d) A soma de todos os n�meros divis�veis por 4 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1 = 1; int v2 = 2; int seq; int cont = 1; int soma = 0; int media = 0; int somadiv = 0;
		
		System.out.print("A sequ�ncia impressa -> ");
		
		while (cont <= 9) {
			System.out.print(v1 + " ");
			
			if (cont == 7 || cont == 9) {
				media += v1;		
			}
			
			if (v1 % 4 == 0) {
				somadiv += v1;
			}
			
			seq = v1 * v2;
			soma = soma + v1;
			v1 = v2;
			v2 = seq;
			
			cont++ ;
		
		}
		System.out.println("\n A soma de todos os n�meros da sequ�ncia -> " + soma);
		System.out.println("A soma de todos os n�meros da sequ�ncia divis�veis por 4 -> " + somadiv);
		System.out.println("A m�dia aritm�tica dos n�meros 7 e 9 da sequ�ncia -> " + (media/2));
		
		
		
		
sc.close();

	}

}
