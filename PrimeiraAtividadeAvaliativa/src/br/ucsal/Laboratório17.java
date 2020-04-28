package br.ucsal;

import java.util.Scanner;

public class Laborat�rio17 {

	/*PROBLEMA: a partir da senha e do CPF* informado pelo usu�rio apresente uma solu��o para verificar se pertence a um usu�rio v�lido. 
	 * O usu�rio v�lido � aquele que possui um CPF definido na tabela associado a senha definida. Considere a tabela a seguir para solu��o 
	 * da quest�o:

		CPF ............................... SENHA
		88888888888 .................. 98
		44444444444 .................. 97
		22222222222 .................. 96
		77777777777 .................. 95
		55555555555 .................. 94

		OBS: para essa solu��o deve-se utilizar obrigatoriamente uma estrutura switch / case e opcionalmente uma estrutura if / (else if) / else.

	 * O CPF � apenas ilustrativo n�o utilizar CPF real.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o CPF : ");
		long cpf = sc.nextLong();
		System.out.println("Digite a senha apenas com numeros inteiros: ");
		int senha = sc.nextInt();
		int chave = 0;

		if (cpf == 88888888888L && senha == 98) {
			chave = 1;
		}else if (cpf == 44444444444L && senha == 97) {
			chave = 2;
		}else if (cpf == 22222222222L && senha == 96) {
			chave = 3;
		}else if (cpf == 77777777777L && senha == 95) {
			chave = 4;
		}else if (cpf == 55555555555L && senha == 94) {
			chave = 5;
		}else {
			System.out.println("Esse CPF e senha nao correspondem a um usu�rio v�lido!");
		}

		switch (chave) {
		case 1:
			System.out.println("Esse CPF e senha PERTENCEM  a um usu�rio v�lido.");

			break;
		case 2:
			System.out.println("Esse CPF e senha PERTENCEM  a um usu�rio v�lido.");

			break;
		case 3:
			System.out.println("Esse CPF e senha PERTENCEM  a um usu�rio v�lido.");

			break;
		case 4:
			System.out.println("Esse CPF e senha PERTENCEM  a um usu�rio v�lido.");

			break;
		case 5:
			System.out.println("Esse CPF e senha PERTENCEM  a um usu�rio v�lido.");

			break;

		}


		sc.close();
	}

}
