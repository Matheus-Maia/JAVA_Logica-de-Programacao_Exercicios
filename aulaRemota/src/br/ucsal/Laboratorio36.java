package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: elaborar a solução para os itens:
a) criar e retornar um array unidimensional com 03 logins definidos pela atribuição direta

b) criar e retornar um array unidimensional com 03 senhas formadas por valores inteiros, positivos definidos pela atribuição direta.

c)  em um método específico, o usuário deverá informar um login e senha e esses devem ser identificados se existem correlacionados pelos 
	índices dos arrays unidimensionais recebidos como parâmetro (0 -> 0, 1 -> 1, 2 -> 2). Se o login informado existir no vetor recebido e a 
	senha informada também existir no vetor recebido com os mesmos índices, então o retorno do método será "login válido", caso contrário será 
	"login inválido".

d) elaborar todos os métodos de impressão necessários */

public class Laboratorio36 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		imprimir(solucao(vetorSenha(), vetorLogin()));

	}
	
	public static String[] vetorLogin () {
		String[] login = {"Matheus", "Alberto", "Amanda"};
		
		return login;
	}
	
	public static int[] vetorSenha () {
		int[] senha = {140, 492, 520};
		
		return senha;
	}
	
	public static String solucao (int[] senhas, String[] nomes) {
		imprimir ("Informe o login: ");
		String loginDigitado = sc.nextLine();
		
		imprimir ("\nInforme a senha: ");
		int senhaDigitada = sc.nextInt();
		
		String resultado = "Login Inválido";
		
		for (int i = 0; i < nomes.length; i++) {
			
			if (senhaDigitada == senhas[i] && loginDigitado.equals(nomes[i])) {
				resultado = "Login Válido";
			} 
		}
		return "\n" + resultado;
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);
	}
	
	
	


}
