package br.ucsal;

import java.util.Scanner;

public class Laborat�rio13 {

	/* PROBLEMA: a partir de tr�s valores inteiros positivos informados pelo usu�rio, 
	 * apresente-os com a sa�da dos valores ordenados de forma crescente e tamb�m em 
	 * ordem decrescente. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe tres valores inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior;
		int menor;
		int medio;


		if (a >= b && a >= c) {
			maior = a;
			menor = (b > c ? c:b);
			medio = (b < c ? c:b);

		}else if (b >= a && b >= c) {
			maior = b;
			menor = (a > c ? c:a);
			medio = (a < c ? c:a);
		}else{
			maior = c;
			menor = (a > b ? b:a);
			medio = (a < b ? b:a);
		}

		System.out.println("Ordem crescente: "  + menor + " " + medio + " " + " " + maior);
		System.out.println("Ordem decrescente: " + maior + " " + medio + " " + " " + menor);

		sc.close();


	}

}
