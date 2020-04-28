package br.ucsal;

import java.util.Scanner;

public class Laboratório26 {
	
	/* PROBLEMA: elabore uma sequencia de anos bissextos a partir de 1950 até o ano atual. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seq = 1950;
		
		while(seq <= 2020) {
			if(seq % 4 == 0 && seq != 100 || seq % 400 == 0) {
				System.out.print(seq + " ");
				
			}
			seq++;
		}
		
		

		
	sc.close();	
	}
}
