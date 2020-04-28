package br.ucsal;

import java.util.Scanner;

public class Laboratório06 {

	/* Problema: elabore uma solucao para construir uma calculadora de temperatura onde o usuário informe qual o valor da temperatura 
	 * inicial, escolha qual a conversão deseja e obtenha a temperatura convertida.
	   As opções de conversão são: Celsius, Kelvin e Fahreinheit.*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double celsius;
		double kelvin;
		double farenheit;

		System.out.println("Digite o valor da temperatura: ");
		double valortemp = ent.nextDouble();

		System.out.println("O valor digitado foi em qual unidade de medida? Digite (1) para Celsius, (2) para Kelvin e (3) para Farenheit");
		int unid = ent.nextInt();

		if (unid == 1) {
			kelvin = valortemp + 273;
			farenheit = valortemp * 1.8 + 32;
			System.out.println("Kelvin = " + kelvin + "\nFarenheit = " + farenheit);

		}else if (unid == 2) {
			celsius = valortemp - 273;
			farenheit = (celsius*9/5) + 32;
			System.out.println("Celsius = " + celsius + "\nFarenheit = " + farenheit);

		}else if (unid == 3) {
			celsius = (valortemp - 32)/1.8;
			kelvin = ((valortemp - 32)/ 9)* 5 + 273;
			System.out.println("Celsius = " + celsius + "\nKelvin = " + kelvin);
		}else {
			System.out.println("ERRO! Informe um valor de 1 a 3, sendo (1) para Celsius, (2) para Kelvin e (3) para Farenheit ");
		}


		ent.close();
	}

}
