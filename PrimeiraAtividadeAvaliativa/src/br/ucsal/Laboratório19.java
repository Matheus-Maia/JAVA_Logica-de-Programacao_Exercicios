package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: formular um problema qualquer que ainda não tenha sido apresentado em nenhum dos laboratórios disponibilizados 
 * no Grupo 2 (não pode repetir o problema) e que seja solucionado utilizando obrigatoriamente as estruturas
 *  if / (else if ) / else (não pode utilizar nenhuma outra estrutura).
 * 
Apresente o problema em comentário de múltiplas linhas e a respectiva solução na classe Java correspondente. */

public class Laboratório19 {

	/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é
	sempre pelo mais barato */
 public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double preco1, preco2, preco3;
		
		System.out.println("Digite o valor do produto 1: ");
		preco1 = ent.nextDouble();
		System.out.println("Digite o valor do produto 2: ");
		preco2 = ent.nextDouble();
		System.out.println("Digite o valor do produto 3: ");
		preco3 = ent.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {;
		System.out.println("Compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {;
		System.out.println("Compre o produto 2");
		}else if (preco3 <= preco1 && preco3 <= preco2) {;
		System.out.println("Compre o produto 3");
		}
		ent.close();
 }
}
			
