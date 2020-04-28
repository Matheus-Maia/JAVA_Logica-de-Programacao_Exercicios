package br.ucsal;

import java.util.Scanner;

/* Problema: crie um algoritmo para calcular o desconto previdenciário do funcionário, considerando o salário inicial 
 * (sem o desconto), o salário liquido (após o desconto), o valor do desconto e o percentual que será aplicado ao salário.
 *  Utilize a seguinte regra: o desconto deve ser de 11% sobre o valor do salário, entretanto, o valor máximo de desconto 
 *  é 318,20. Ou seja: se o desconto de 11% for maior que 318,20 o valor que deve ser retornado é 318,20 caso contrário deve
 *  ser o valor correspondente a 11% sobre o salário.

Exemplo:
1) um salário de R$ 1.000,00 -> desconto (11%) -> R$ 110,00 -> valor final: R$ 890,00
2) um salário de R$ 5.000,00 -> desconto (11%) -> R$ 550,00 -> valor final: R$ 4.681,80 (utiliza-se o limite 318,20) */

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Informe seu salário bruto: R$ ");
		double salario = ent.nextDouble();
		
		double desconto = salario * 0.11;
		double salarioLiquido = salario - desconto;
		
		System.out.println("Salário informado: R$ " + salario);
		System.out.println("O desconto é de: R$ " + desconto);
		
		if (desconto < 318.20){
			
			System.out.println("O salário liquido é: R$ " + salarioLiquido);
			
		} else {
			 salarioLiquido = (salario - 318.20);
			System.out.println("O desconto foi maior que 318.20. Portanto será dado um desconto de 318.20 reais. O salário liquido é: R$ " + salarioLiquido);
		} 
		ent.close();
		
		
		
		

	}

}
