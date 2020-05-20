package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: elaborar a solu��o para os itens:
a) criar e retornar um array unidimensional com 03 logins definidos pela atribui��o direta

b) criar e retornar um array unidimensional com 03 senhas formadas por valores inteiros, positivos definidos pela atribui��o direta.

c)  em um m�todo espec�fico, o usu�rio dever� informar um login e senha e esses devem ser identificados se existem correlacionados pelos 
	�ndices dos arrays unidimensionais recebidos como par�metro (0 -> 0, 1 -> 1, 2 -> 2). Se o login informado existir no vetor recebido e a 
	senha informada tamb�m existir no vetor recebido com os mesmos �ndices, ent�o o retorno do m�todo ser� "login v�lido", caso contr�rio ser� 
	"login inv�lido".

d) elaborar todos os m�todos de impress�o necess�rios */

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
		
		String resultado = "Login Inv�lido";
		
		for (int i = 0; i < nomes.length; i++) {
			
			if (senhaDigitada == senhas[i] && loginDigitado.equals(nomes[i])) {
				resultado = "Login V�lido";
			} 
		}
		return "\n" + resultado;
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);
	}
	
	
	


}
