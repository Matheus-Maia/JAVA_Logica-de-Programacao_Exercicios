package br.ucsal;

import java.util.Scanner;

public class Laboratorio32 {

	/* PROBLEMA: usando passagem de par�metro, elabore uma solu��o para construir uma calculadora que possa executar 
	 * as 04 opera��es b�sicas:  somar, subtrair, multiplicar e dividir. As opera��es devem ser feitas com apenas duas 
	 * parcelas.Cada opera��o deve ser programada em um m�todo especifico, sendo que dever� ter um m�todo apenas para 
	 * executar a opera��o selecionada a partir das informa��es obtidas do usu�rio. */

	public static void main(String[] args) {

		obterDados();

	}

	public static void imprimir (String txt) {
		System.out.println(txt);

	}

	public static void obterDados () {
		Scanner sc = new Scanner (System.in);
		
		imprimir ("Informe 2 valores: ");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();


		imprimir("Qual opera��o voce deseja efetuar com esses valores? Digite (1) para Somar, (2) para Subtra��o, (3) para Divis�o ou (4) para Multiplica��o ");
		int operacao = sc.nextInt();

		operacao(valor1, valor2, operacao);

		sc.close();
	}

	public static void operacao (int pri, int seg, int escolherOperacao) {

		switch (escolherOperacao) {
		case 1:

			imprimir("A opera��o escolhida foi a soma. " + pri + " + " + seg + " = " + operacaoSoma(pri, seg));

			break;

		case 2:

			imprimir("A opera��o escolhida foi subtra��o. " + pri + " - " + seg + " = " + operacaoSubtracao(pri, seg));

			break;

		case 3:

			imprimir("A opera��o escolhida foi a divis�o. " + pri + " / " + seg + " = " + operacaoDivisao(pri, seg));

			break;
			
		case 4:

			imprimir("A opera��o escolhida foi a multiplica��o. " + pri + " * " + seg + " = " + operacaoMultiplicacao(pri, seg));

			break;

		default:
			imprimir ("Erro! Tente novamente!");
			obterDados();
			break;
		}
	}
	public static int operacaoSoma (int priValor, int segValor ) {
		return priValor + segValor;
	}
	public static int operacaoSubtracao (int priValor, int segValor ) {
		return priValor - segValor;
	}
	public static int operacaoDivisao (int priValor, int segValor ) {
		return priValor / segValor;
	}
	public static int operacaoMultiplicacao (int priValor, int segValor ) {
		return priValor * segValor;
	}



}
