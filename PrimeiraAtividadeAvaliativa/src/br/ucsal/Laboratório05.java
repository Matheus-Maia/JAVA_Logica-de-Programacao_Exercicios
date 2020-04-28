package br.ucsal;

import java.util.Scanner;

public class Laborat�rio05 {

	/* Problema: crie um algoritmo para calcular o desconto previdenci�rio do funcion�rio, considerando o sal�rio bruto inicial 
	 * (sem o desconto), o sal�rio liquido (ap�s o desconto), o valor do desconto e o percentual que ser� aplicado ao sal�rio.

Utilize a seguinte regra: o desconto deve ser de 11% sobre o valor do sal�rio, entretanto, o valor m�ximo de desconto � 318,20.
Ou seja: se o desconto de 11% for maior que 318,20 o valor que deve ser utilizado para o desconto ser� � 318,20 caso contr�rio 
deve ser aplicado o valor cheio correspondente a 11% sobre o sal�rio.

Exemplo:
1) um sal�rio de R$ 1.000,00 -> desconto (11%) -> R$ 110,00 -> valor final: R$ 890,00
2) um sal�rio de R$ 5.000,00 -> desconto (11%) -> R$ 550,00 -> valor final: R$ 4.681,80 (utiliza-se o limite 318,20)*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double salarioBruto, salarioLiquido, desconto;
		final double taxa = 0.11, valorBaseDesconto = 318.20;

		System.out.print("Informe seu sal�rio base: ");
		salarioBruto = ent.nextDouble();

		System.out.println("\nFOLHA DE PAGAMENTO");
		System.out.println("\nSalario Bruto: " + salarioBruto);
		desconto = salarioBruto * taxa;
		System.out.print("Desconto aplicado: ");
		if(desconto >= valorBaseDesconto) {
			salarioLiquido = salarioBruto - valorBaseDesconto;
			System.out.println(valorBaseDesconto);
		} else {
			salarioLiquido = salarioBruto - desconto;
			System.out.println(desconto);
		}

		System.out.println("Sal�rio L�quido: " + salarioLiquido);

		ent.close();
	}

}






