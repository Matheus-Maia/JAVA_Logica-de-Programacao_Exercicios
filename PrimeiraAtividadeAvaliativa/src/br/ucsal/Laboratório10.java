package br.ucsal;

import java.util.Scanner;

public class Laboratório10 {

	/*PROBLEMA: elabore uma solução utilizando estrutura de decisão (if) e seleção (switch) para simular o calculo 
	 * do Índice de Massa Corporal (IMC) da pessoa. Para isso é necessário dividir o peso (em quilogramas) pela altura
	 *  (em metros) ao quadrado e aplicar a seguinte tabela:

1. Para adultos (Homem e Mulher a partir dos 18 anos) o resultado deve ser aplicado na tabela abaixo:
Cod ..... Faixa ............................ Situação
1 .......... Abaixo de 17 ............... Muito abaixo do peso
2 .......... Entre 17 e 18,49 .......... Abaixo do peso
3 .......... Entre 18,5 e 24,99 ....... Peso normal
4 .......... Entre 25 e 29,99 .......... Acima do peso
5 .......... Entre 30 e 34,99 .......... Obesidade I
6 .......... Entre 35 e 39,99 .......... Obesidade II (severa)
7 .......... Acima de 40 ................ Obesidade III (mórbida)

2. Para menores (abaixo dos 18 anos) o resultado deve ser aplicado na tabela abaixo:
Idade ..... normal .......... Sobrepeso ............. Obesidade
1 ............ até 6,3 ........... mais de 6,3 ............ mais de 7,2
2 ............ até 8,6 ........... mais de 8,6 ............ mais de 9,8
3 ............ até 10,6 ......... mais de 10,6 .......... mais de 11,6
4 ............ até 12,6 ......... mais de 12,6 .......... mais de 15,0
5 ............ até 15,6 ......... mais de 15,6 .......... mais de 16,3
6 ............ até 16,6 ......... mais de 16,6 .......... mais de 18,0
7 ............ até 17,3 ......... mais de 17,3 .......... mais de 19,1
8 ............ até 18,7 ......... mais de 18,7 .......... mais de 20,3
9 ............ até 18,8 ......... mais de 18,8 .......... mais de 21,4
10 .......... até 19,6 ......... mais de 19,6 .......... mais de 22,5
11 .......... até 20,3 ......... mais de 20,3 .......... mais de 23,7
12 .......... até 21,1 ......... mais de 21,1 .......... mais de 24,8
13 .......... até 21,9 ......... mais de 21,9 .......... mais de 25,9
14 .......... até 22,7 ......... mais de 22,7 .......... mais de 26,9
> 14 ....... até 23,6 ......... mais de 23,6 .......... mais de 27,7 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double peso, altura;
		int idade;
		int chave;

		System.out.println("Informe aqui os seus dados: ");

		System.out.println("Peso = ");
		peso = ent.nextDouble();

		System.out.println("Altura = ");
		altura = ent.nextDouble();

		System.out.println("Idade = ");
		idade = ent.nextInt();

		double imc = peso / (Math.pow(altura, 2));

		if(idade >= 18) {
			if(imc < 17) {
				chave = 1;
			}else if(imc >= 17 && imc <= 18.49) {
				chave = 2;
			}else if (imc >= 18.5 && imc <= 24.99) {
				chave = 3;
			}else if (imc >= 25 && imc <= 29.99) {
				chave = 4;
			}else if(imc >= 30 && imc <= 34.99) {
				chave = 5;
			}else if (imc >= 35 && imc <= 39.99) {
				chave = 6;
			}else{
				chave = 7;
			}

			switch (chave) {
			case 1:
				System.out.println("IMC = " + imc + " IMC Abaixo de 17 ............... Muito abaixo do peso");

				break;
			case 2:
				System.out.println("IMC = " + imc + " IMC Entre 17 e 18,49 .......... Abaixo do peso");

				break;
			case 3:
				System.out.println("IMC = " + imc + " IMC Entre 18,5 e 24,99 ....... Peso normal");

				break;
			case 4:
				System.out.println("IMC = " + imc + " IMC Entre 25 e 29,99 .......... Acima do peso");

				break;
			case 5:
				System.out.println("IMC = " + imc + " IMC Entre 30 e 34,99 .......... Obesidade I");

				break;
			case 6:
				System.out.println("IMC = " + imc + " IMC Entre 35 e 39,99 .......... Obesidade II (severa)");

				break;
			case 7:
				System.out.println("IMC = " + imc + " IMC Acima de 40 ................ Obesidade III (mórbida)");

				break;				

			}
		}else {
			switch (idade) {
			case 1:
				if (imc <= 6.3) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 6.3 && imc <= 7.2) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 2:
				if (imc <= 8.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 8.6 && imc <= 9.8) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 3:
				if (imc <= 10.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 10.6 && imc <= 11.6) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 4:
				if (imc <= 12.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 12.6 && imc <= 15) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 5:
				if (imc <= 15.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 15.6 && imc <= 16.3) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 6:
				if (imc <= 16.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 16.6 && imc <= 18) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 7:
				if (imc <= 17.3) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 17.3 && imc <= 19.1) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 8:
				if (imc <= 18.7) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 18.7 && imc <= 20.3) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 9:
				if (imc <= 18.8) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 18.8 && imc <= 21.4) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 10:
				if (imc <= 19.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 19.6 && imc <= 22.5) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 11:
				if (imc <= 20.3) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 20.3 && imc <= 23.7) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 12:
				if (imc <= 21.1) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 21.1 && imc <= 24.8) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 13:
				if (imc <= 21.9) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 21.9 && imc <= 25.9) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			case 14:
				if (imc <= 22.7) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 22.7 && imc <= 26.9) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;


			default:
				if (imc <= 23.6) {
					System.out.println("IMC = " + imc + ": NORMAL");

				}else if(imc > 23.6 && imc <= 27.7) {
					System.out.println("IMC = " + imc + ": Sobrepeso");
				}else {
					System.out.println("IMC = " + imc + ": Obesidade");
				}

				break;
			}
		}

		ent.close();


	}
}	






