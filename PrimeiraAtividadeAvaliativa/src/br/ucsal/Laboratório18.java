package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: formular um problema qualquer que ainda n�o tenha sido apresentado em nenhum dos laborat�rios disponibilizados 
 * no Grupo 2 (n�o pode repetir o problema) e que seja solucionado utilizando apenas a estrutura switch / case (n�o pode 
 * utilizar nenhuma outra estrutura).
 * 
Apresente o problema em coment�rio de m�ltiplas linhas e a respectiva solu��o na classe Java correspondente.*/

public class Laborat�rio18 {

	/*  Voc� foi contratado para criar um sistema para uma loja de roupa que calcule o desconto somente para a primeira compra.
	 *  Pois a loja est� com queima de estoque para roupas com apenas uma cor na primeira compra. Todas as pe�as amarelas est�o
	 *  com 25% de desconto, as vermelhas 20% de desconto e 15% nas verdes. Caso o cliente deseje comprar pe�as de outras cores, 
	 *  as mesmas ter�o 10% de  desconto.

	 * Imprima na tela o valor total da compra com desconto. */ 

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Qual a cor da roupa que o cliente deseja comprar? Digite (1) para pe�as amarelas (2) para pe�as vermelhas, "
				+ "(3) para pe�as verdes e (4) para demais cores.");
		int cor = ent.nextInt();

		System.out.println("Qual o valor da pe�a? ");
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