package br.ucsal;

import java.util.Scanner;

public class Questao01 {
	/* PROBLEMA: elabore uma sequência de Fibonacci contendo 30 elementos e obtenha a soma de todos os elementos da sequência */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vPri = 0, vSeg = 1, vAux, soma = 0;
		
		System.out.println("Sequencia de Fibonacci contendo 30 elementos: ");
		
		int cont = 0;
		
		
		
		while (cont < 30) {
			System.out.print(vPri + " "); 
			soma += vPri;
			vAux = vPri + vSeg;           
			vPri = vSeg;                  
			vSeg = vAux; 
			cont++;
			
		}
		System.out.println("\nA soma de todos elementos é: " + soma);
		
		sc.close();

	

}
}
