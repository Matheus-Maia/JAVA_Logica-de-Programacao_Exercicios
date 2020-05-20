package br.ucsal;

import java.util.Scanner;

/* OBJETIVO: criar e retornar um array unidimensional com 03 
 * logins definidos diretamente no vetor. */


/* OBJETIVO: criar e retorna um array unidimensional com 03 
 * senhas (inteiros - positivos) definidas diretamente no 
 * vetor */


/* OBJETIVO: o usuario informa um login e uma senha e o m�todo 
 * verifica se essas informa��es existem e se est�o correlacionadas
 *  a partir dos �ndices dos vetores. Se sim retorna que o login � v�lido,
 *   se n�o retorna que o login � inv�lido. */


/* OBJETIVO: criar os metodos de impress�o correspondentes */


public class Atividade04 {
	private static  Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		solucao();

	}

	public static String[] loginsValidos () {
		String[] loginCorreto = {"Matheus", "Alberto", "Amanda"};
		return loginCorreto;
	}

	public static int[] senhasValidas () {
		int[] senhaCorreta = {140, 492, 124};
		return senhaCorreta;
	}

	public static void solucao () {
		String loginDigitado;
		int senhaDigitada;

		imprimir("Informe seu login e senha: ");
		imprimir("\nLogin: ");
		loginDigitado = sc.next();
		imprimir("Senha: ");
		senhaDigitada = sc.nextInt();

		loginsValidos();
		senhasValidas();

		String[] login = loginsValidos();
		int[] senha = senhasValidas();

		for (int i = 0; i < login.length; i++) {
			if (senhaDigitada == senha[i] && loginDigitado.equals(login[i])) {
				i = login.length;
				imprimir("Login V�lido");
				
			} else if (i == login.length - 1) {
				imprimir ("Login Inv�lido");
			}
		}

	}


	public static void imprimir (String txt) {
		System.out.print(txt);
	}

	public static void imprimir (int num) {
		System.out.print(num);
	}

	public static void imprimir (String[] txt) {
		for (int i = 0; i < txt.length; i++) {
			System.out.println(txt[i]);
		}
	}

	public static void imprimir (int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
