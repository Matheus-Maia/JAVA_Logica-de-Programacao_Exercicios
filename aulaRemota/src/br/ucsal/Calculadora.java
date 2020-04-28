package br.ucsal;

import java.util.Scanner;

public class Calculadora {
	
	/* Problema: elabore uma solução para criar uma calculadora que execute as quatro operações básicas 
	 * (somar, subtrair, dividir e multiplicar) a partir de dois valores inteiros, positivos informados 
	 * pelo usuário. */

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Informe dois (02) valores: ");
		int valor1 = ent.nextInt(), valor2 = ent.nextInt();
		
		System.out.println("Os valores informados foram: 1º -> " + valor1 + " e o 2º ->" + valor2);
		System.out.println("Informe a operação que deseja realizar: "
				+ "\n(1) Somar"
				+ "\n(2) Subtrair"
				+ "\n(3) Multiplicar"
				+ "\n(4) Dividir");
		int operacao = ent.nextInt();
		
		System.out.println("A operacao escolhida foi: " + operacao);
		
		if (operacao >= 1 && operacao <= 4) {
			System.out.println("Vamos trabalhar a calculadora aqui.");
			
			if (operacao == 1) {
				System.out.println("Somar: " + (valor1 + valor2));
			}
		} else {
			System.out.println("Voce informou um valor errado !!!");
		}
		
		int contamassa = 10 + 16 + 22 + 28 + 34 + 40 + 46 + 52 + 58 + 64 + 70 + 76 + 82 + 88;
		
		System.out.println("contamassa = " + contamassa);
		
		ent.close();
		
	}

}
