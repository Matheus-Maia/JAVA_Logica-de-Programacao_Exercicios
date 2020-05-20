package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: Construa as solu��es dos itens abaixo em m�todos espec�ficos e execute todas as solu��es com as respectivas impress�es:
a) criar e devolver um vetor pela atribui��o direta, com as idades de 07 alunos e retornar o resultado final para quem executa.
b) criar e devolver um vetor contendo 03 nomes informados pelo usu�rio (apenas o primeiro nome).
c) criar e devolver um vetor com 03 idades informadas pelo usu�rio em um intervalo fechado de 20 a 30.
d) criar m�todos para impress�o dos itens anteriores
 */

public class Laboratorio35 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		imprimir(idadeAlunos());
		imprimir(obterNomes());
		imprimir(obterIdades());
	}
	
	public static int[] idadeAlunos () {
		int[] idade = {16, 18, 20, 22, 24, 26, 28};
		return idade;
	}
	
	public static String[] obterNomes () {
		String[] nomes = new String[3];
		imprimir("\nInforme 03 nomes: ");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.nextLine();
		}
		return nomes;
	}
	
	public static int[] obterIdades () {
		int[] idades = new int[3];
		imprimir ("\nInforme 03 idades: ");
		for (int i = 0; i < idades.length; i++) {
			idades[i] = sc.nextInt();
		}
		return idades;
	}
	
	public static void imprimir (String txt) {
		System.out.println(txt);
	}
	
	public static void imprimir (String[] txt) {
		for (int i = 0; i < txt.length; i++) {
			System.out.print(txt[i] + " ");
		}
		
	}
	
	public static void imprimir (int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
}
