package br.ucsal;

import java.util.Scanner;

public class Questao04 {
	/* PROBLEMA: elabore uma solução para apresentar a quantidade de dias que existe no intervalo fechado de 01/01/1976 a 31/12/2020. 
	 * Para isso considere os anos bissextos do periodo. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano = 1976, soma = 0; 
		
		while(ano <=2020) {
			
			if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
				soma += 366;
				
			}else {
				soma += 365;
			}
			
			ano++;
			
		}
		System.out.println("A quantidade de dias entre 01/01/1976 a 31/12/2020 é: " + soma);
		
		
		
		
	
		
		sc.close();

	}

}

/*  		switch (mes) {
			case "1": case "3": case "5": case "7": case "8": case "10": case "12":;

			soma += 31;
			break;
			
			case "4": case "6": case "9": case "11":;
			
			System.out.println("O mês de " + mes + " no ano de " + ano + " possui 30 dias.");
			
			break;
			
			case "2":;
			
			if (ano % 4 == 0) {
			System.out.println("O mês de " + mes + " no ano de " + ano + " possui 29 dias.");
				
			
			} else {
				System.out.println("O mês de " + mes + " no ano de " + ano + " possui 28 dias.");
			}
			break; */