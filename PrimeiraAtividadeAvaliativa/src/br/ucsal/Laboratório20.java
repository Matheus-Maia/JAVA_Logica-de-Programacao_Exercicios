package br.ucsal;

import java.util.Scanner;

public class Laborat�rio20 {

	/* PROBLEMA: formular um problema qualquer que ainda n�o tenha sido apresentado em nenhum dos laborat�rios disponibilizados
	 *  no Grupo 2 (n�o pode repetir o problema) e que seja solucionado utilizando obrigatoriamente as estruturas switch / case 
	 *  e if / (else if ) / else (n�o pode utilizar nenhuma outra estrutura).
	 *  
Apresente o problema em coment�rio de m�ltiplas linhas e a respectiva solu��o na classe Java correspondente. */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe dois (02) valores inteiros qualquer: ");
		int valor1 = ent.nextInt(); int valor2 = ent.nextInt();

		int resultado = valor1 + valor2, chave = 0;

		if (resultado % 2 != 0) {
			System.out.println(resultado + " O resultado dessa soma � um n�mero �mpar.");
			chave = 1;
		}else if (resultado % 2 == 0) {
			System.out.println(resultado + " O resultado dessa soma � um n�mero par.");
			chave = 2;

		}else {
			System.out.println("Digite apenas n�meros inteiros.");
		}

		switch (chave) {
		case 1:
			if(resultado % 3 == 0 ) {
				System.out.println("Este n�mero � divis�vel por 3.");
			}else {
				System.out.println("Este n�mero N�O � divis�vel por 3.");
			}

			break;
		case 2:
			if(resultado % 5 == 0 ) {
				System.out.println("Este n�mero � divis�vel por 5.");
			}else {
				System.out.println("Este n�mero N�O � divis�vel por 5.");
			}

			break;

		}


		ent.close();
	}
}

