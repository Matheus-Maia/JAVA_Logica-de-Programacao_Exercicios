package br.ucsal;

import java.util.Scanner;

public class Laborat�rio15 {

	/*PROBLEMA: a partir de um valor informado em uma determinada moeda pelo usu�rio, elabore uma solu��o para que seja 
	 * apresentado esse valor convertido para a outra moeda definida pelo usu�rio. As seis (06) convers�es poss�veis devem 
	 * envolver d�lar, real, euro. Exemplo: d�lar para real, real para euro ...

	Considere o valor do euro como R$ 5,50 e do d�lar como R$ 5,10
	OBS: voc� deve utilizar o switch / case em algum momento da solu��o.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double real;
		double dolar;
		double euro;

		System.out.println("Digite um valor em qualquer moeda: ");
		double valor = sc.nextDouble();
		System.out.println("O valor digitado foi em: (1) para d�lar (2) para real ou (3) para euro? ");
		int moeda = sc.nextInt();

		switch (moeda) {
		case 1:
			real = valor * 5.10;
			euro = real / 5.50;
			System.out.println("O valor digitado, convertido de D�LAR para REAL � = " + real + " REAIS" + "\nO valor digitado, convertido de D�LAR para EURO � = " + euro + " EUROS");

			break;
		case 2:
			dolar = valor / 5.10;
			euro = valor / 5.50;
			System.out.println("O valor digitado, convertido de REAL para D�LAR � = " + dolar + " D�LARES" + "\nO valor digitado, convertido de REAL para EURO � = " + euro + " EUROS");

			break;
		case 3:
			real = valor * 5.50;
			dolar = real / 5.10;
			System.out.println("O valor digitado, convertido de EURO para REAL � = " + real + " REAIS" + "\nO valor digitado, convertido de EURO para D�LAR � = " + dolar + " D�LARES");

			break;



		default:
			System.out.println("ERRO! Digite apenas um valor emtre 1 e 3 para determinar o tipo de moeda que voc� digitou o valor. Sendo (1) para d�lar (2) para real ou (3) para euro");
			break;
		}



		sc.close();

	}

}
