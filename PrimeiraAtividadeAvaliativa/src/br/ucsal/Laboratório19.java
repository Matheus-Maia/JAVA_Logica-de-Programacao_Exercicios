package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: formular um problema qualquer que ainda n�o tenha sido apresentado em nenhum dos laborat�rios disponibilizados 
 * no Grupo 2 (n�o pode repetir o problema) e que seja solucionado utilizando obrigatoriamente as estruturas
 *  if / (else if ) / else (n�o pode utilizar nenhuma outra estrutura).
 * 
Apresente o problema em coment�rio de m�ltiplas linhas e a respectiva solu��o na classe Java correspondente. */

public class Laborat�rio19 {

	/*Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo que a decis�o �
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
			
