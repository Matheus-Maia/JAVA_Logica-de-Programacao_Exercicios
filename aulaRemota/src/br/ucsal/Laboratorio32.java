package br.ucsal;

import java.util.Scanner;

public class Laboratorio32 {

	/* PROBLEMA: usando passagem de parâmetro, elabore uma solução para construir uma calculadora que possa executar 
	 * as 04 operações básicas:  somar, subtrair, multiplicar e dividir. As operações devem ser feitas com apenas duas 
	 * parcelas.Cada operação deve ser programada em um método especifico, sendo que deverá ter um método apenas para 
	 * executar a operação selecionada a partir das informações obtidas do usuário. */

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


		imprimir("Qual operação voce deseja efetuar com esses valores? Digite (1) para Somar, (2) para Subtração, (3) para Divisão ou (4) para Multiplicação ");
		int operacao = sc.nextInt();

		operacao(valor1, valor2, operacao);

		sc.close();
	}

	public static void operacao (int pri, int seg, int escolherOperacao) {

		switch (escolherOperacao) {
		case 1:

			imprimir("A operação escolhida foi a soma. " + pri + " + " + seg + " = " + operacaoSoma(pri, seg));

			break;

		case 2:

			imprimir("A operação escolhida foi subtração. " + pri + " - " + seg + " = " + operacaoSubtracao(pri, seg));

			break;

		case 3:

			imprimir("A operação escolhida foi a divisão. " + pri + " / " + seg + " = " + operacaoDivisao(pri, seg));

			break;
			
		case 4:

			imprimir("A operação escolhida foi a multiplicação. " + pri + " * " + seg + " = " + operacaoMultiplicacao(pri, seg));

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
