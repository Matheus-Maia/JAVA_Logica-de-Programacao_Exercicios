package br.ucsal;

import java.util.Scanner;

public class SituacaoIndiceDeMassaCorporal {

	/* PROBLEMA: elabore uma solu��o utilizando estrutura de decis�o (if) e sele��o (switch) para simular o calculo 
	 *do �ndice de Massa Corporal (IMC) da pessoa. Para isso � necess�rio dividir o peso (em quilogramas) pela altura 
	 *(em metros) ao quadrado e aplicar a seguinte tabela:

	1. Para adultos (Homem e Mulher a partir dos 18 anos) o resultado deve ser aplicado na tabela abaixo:
Cod ..... Faixa ............................ Situa��o
1 .......... Abaixo de 17 ............... Muito abaixo do peso
2 .......... Entre 17 e 18,49 .......... Abaixo do peso
3 .......... Entre 18,5 e 24,99 ....... Peso normal
4 .......... Entre 25 e 29,99 .......... Acima do peso
5 .......... Entre 30 e 34,99 .......... Obesidade I
6 .......... Entre 35 e 39,99 .......... Obesidade II (severa)
7 .......... Acima de 40 ................ Obesidade III (m�rbida)

2. Para menores (abaixo dos 18 anos) o resultado deve ser aplicado na tabela abaixo:
Idade ..... normal .......... Sobrepeso ............. Obesidade
1 ............ at� 6,3 ........... mais de 6,3 ............ mais de 7,2
2 ............ at� 8,6 ........... mais de 8,6 ............ mais de 9,8
3 ............ at� 10,6 ......... mais de 10,6 .......... mais de 11,6
4 ............ at� 12,6 ......... mais de 12,6 .......... mais de 15,0
5 ............ at� 15,6 ......... mais de 15,6 .......... mais de 16,3
6 ............ at� 16,6 ......... mais de 16,6 .......... mais de 18,0
7 ............ at� 17,3 ......... mais de 17,3 .......... mais de 19,1
8 ............ at� 18,7 ......... mais de 18,7 .......... mais de 20,3
9 ............ at� 18,8 ......... mais de 18,8 .......... mais de 21,4
10 .......... at� 19,6 ......... mais de 19,6 .......... mais de 22,5
11 .......... at� 20,3 ......... mais de 20,3 .......... mais de 23,7
12 .......... at� 21,1 ......... mais de 21,1 .......... mais de 24,8
13 .......... at� 21,9 ......... mais de 21,9 .......... mais de 25,9
14 .......... at� 22,7 ......... mais de 22,7 .......... mais de 26,9
> 14 ....... at� 23,6 ......... mais de 23,6 .......... mais de 27,7*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double peso, altura;
		int idade;
		
		System.out.println("Informe aqui os seus dados: ");
		
		System.out.println("Peso = ");
		peso = ent.nextDouble();
		
		System.out.println("Altura = ");
		altura = ent.nextDouble();
		
		System.out.println("Idade = ");
		idade = ent.nextInt();
		
		double imc = peso / (Math.pow(altura, 2));
		
		if(idade >= 18 && imc < 17 ) {

	}
		ent.close();
		

}
}	
