package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: formular um problema qualquer que ainda não tenha sido apresentado em nenhum dos laboratórios disponibilizados 
 * no Grupo 2 (não pode repetir o problema) e que seja solucionado utilizando apenas a estrutura switch / case (não pode 
 * utilizar nenhuma outra estrutura).
 * 
Apresente o problema em comentário de múltiplas linhas e a respectiva solução na classe Java correspondente.*/

public class Laboratório18 {

	/*  Você foi contratado para criar um sistema para uma loja de roupa que calcule o desconto somente para a primeira compra.
	 *  Pois a loja está com queima de estoque para roupas com apenas uma cor na primeira compra. Todas as peças amarelas estão
	 *  com 25% de desconto, as vermelhas 20% de desconto e 15% nas verdes. Caso o cliente deseje comprar peças de outras cores, 
	 *  as mesmas terão 10% de  desconto.

	 * Imprima na tela o valor total da compra com desconto. */ 

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Qual a cor da roupa que o cliente deseja comprar? Digite (1) para peças amarelas (2) para peças vermelhas, "
				+ "(3) para peças verdes e (4) para demais cores.");
		int cor = ent.nextInt();

		System.out.println("Qual o valor da peça? ");
		double valor = ent.nextDouble();

		double desconto, precofinal;

		switch (cor) {
		case 1:
			desconto = 0.25 * valor;
			precofinal = valor - desconto;
			System.out.println("Valor total da compra SEM desconto: " + valor + "\nDesconto: " + desconto + "\nValor total da compra COM desconto: " + precofinal);

			break;
		case 2:
			desconto = 0.2 * valor;
			precofinal = valor - desconto;
			System.out.println("Valor total da compra SEM desconto: " + valor + "\nDesconto: " + desconto + "\nValor total da compra COM desconto: " + precofinal);

			break;
		case 3:
			desconto = 0.15 * valor;
			precofinal = valor - desconto;
			System.out.println("Valor total da compra SEM desconto: " + valor + "\nDesconto: " + desconto + "\nValor total da compra COM desconto: " + precofinal);

			break;
		case 4:
			desconto = 0.1 * valor;
			precofinal = valor - desconto;
			System.out.println("Valor total da compra SEM desconto: " + valor + "\nDesconto: " + desconto + "\nValor total da compra COM desconto: " + precofinal);

			break;

		}

		ent.close();
	}
}