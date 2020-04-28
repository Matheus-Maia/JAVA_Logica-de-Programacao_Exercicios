package br.ucsal;

import java.util.Scanner;

public class Laboratório15 {

	/*PROBLEMA: a partir de um valor informado em uma determinada moeda pelo usuário, elabore uma solução para que seja 
	 * apresentado esse valor convertido para a outra moeda definida pelo usuário. As seis (06) conversões possíveis devem 
	 * envolver dólar, real, euro. Exemplo: dólar para real, real para euro ...

	Considere o valor do euro como R$ 5,50 e do dólar como R$ 5,10
	OBS: você deve utilizar o switch / case em algum momento da solução.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double real;
		double dolar;
		double euro;

		System.out.println("Digite um valor em qualquer moeda: ");
		double valor = sc.nextDouble();
		System.out.println("O valor digitado foi em: (1) para dólar (2) para real ou (3) para euro? ");
		int moeda = sc.nextInt();

		switch (moeda) {
		case 1:
			real = valor * 5.10;
			euro = real / 5.50;
			System.out.println("O valor digitado, convertido de DÓLAR para REAL é = " + real + " REAIS" + "\nO valor digitado, convertido de DÓLAR para EURO é = " + euro + " EUROS");

			break;
		case 2:
			dolar = valor / 5.10;
			euro = valor / 5.50;
			System.out.println("O valor digitado, convertido de REAL para DÓLAR é = " + dolar + " DÓLARES" + "\nO valor digitado, convertido de REAL para EURO é = " + euro + " EUROS");

			break;
		case 3:
			real = valor * 5.50;
			dolar = real / 5.10;
			System.out.println("O valor digitado, convertido de EURO para REAL é = " + real + " REAIS" + "\nO valor digitado, convertido de EURO para DÓLAR é = " + dolar + " DÓLARES");

			break;



		default:
			System.out.println("ERRO! Digite apenas um valor emtre 1 e 3 para determinar o tipo de moeda que você digitou o valor. Sendo (1) para dólar (2) para real ou (3) para euro");
			break;
		}



		sc.close();

	}

}
