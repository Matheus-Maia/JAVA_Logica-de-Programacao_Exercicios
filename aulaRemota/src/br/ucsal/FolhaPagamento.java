package br.ucsal;

import java.util.Scanner;

/* Problema: crie um algoritmo para calcular o desconto previdenci�rio do funcion�rio, considerando o sal�rio inicial 
 * (sem o desconto), o sal�rio liquido (ap�s o desconto), o valor do desconto e o percentual que ser� aplicado ao sal�rio.
 *  Utilize a seguinte regra: o desconto deve ser de 11% sobre o valor do sal�rio, entretanto, o valor m�ximo de desconto 
 *  � 318,20. Ou seja: se o desconto de 11% for maior que 318,20 o valor que deve ser retornado � 318,20 caso contr�rio deve
 *  ser o valor correspondente a 11% sobre o sal�rio.

Exemplo:
1) um sal�rio de R$ 1.000,00 -> desconto (11%) -> R$ 110,00 -> valor final: R$ 890,00
2) um sal�rio de R$ 5.000,00 -> desconto (11%) -> R$ 550,00 -> valor final: R$ 4.681,80 (utiliza-se o limite 318,20) */

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Informe seu sal�rio bruto: R$ ");
		double salario = ent.nextDouble();
		
		double desconto = salario * 0.11;
		double salarioLiquido = salario - desconto;
		
		System.out.println("Sal�rio informado: R$ " + salario);
		System.out.println("O desconto � de: R$ " + desconto);
		
		if (desconto < 318.20){
			
			System.out.println("O sal�rio liquido �: R$ " + salarioLiquido);
			
		} else {
			 salarioLiquido = (salario - 318.20);
			System.out.println("O desconto foi maior que 318.20. Portanto ser� dado um desconto de 318.20 reais. O sal�rio liquido �: R$ " + salarioLiquido);
		} 
		ent.close();
		
		
		
		

	}

}
