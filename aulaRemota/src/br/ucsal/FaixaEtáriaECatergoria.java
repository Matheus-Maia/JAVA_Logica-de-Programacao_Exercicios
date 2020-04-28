package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: desenvolva uma solução para a partir da idade informada, o algoritmo utilize uma estrutura de decisão
 * (if) e uma de seleção (switch) para definir qual a categoria correspondente, com base na tabela abaixo:

-------------------------------------------------------------
Faixa Etária ................... Categoria
-------------------------------------------------------------
5 a 7 anos ................... Infantil A
8 a 10 anos ................... Infantil B
11 a 13 anos ................... Juvenil A
14 a 17 anos ................... Juvenil B
Maiores de 17 anos ........ Adulto
-------------------------------------------------------------*/

public class FaixaEtáriaECatergoria {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = ent.nextInt();
		
		if(idade < 5) {
			System.out.println("Idade nao classificada pela tabela.");
		}else if(idade > 17) {
			System.out.println("Adulto");
		}else {
			
		switch (idade) {
		case 5: case 6: case 7:
			System.out.println("Infantil A");
			
			break;
			
		case 8: case 9: case 10:
			System.out.println("Infantil B");
			
			break;
			
		case 11: case 12: case 13:
			System.out.println("Juvenil A");
			
			break;
			
		case 14: case 15: case 16: case 17:
			System.out.println("Juvenil B");
			
			break;

		default:
			break;
		}
		}
		
		ent.close();
		
	}

}
