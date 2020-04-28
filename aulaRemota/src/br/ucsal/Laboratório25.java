package br.ucsal;

import java.util.Scanner;

public class Laboratório25 {
	
	/* PROBLEMA: elabore uma solução para construir uma sequencia fibonacci (inicia com 0 e 1), na qual o último valor não pode ser
	 *  maior que 1000. (valores inteiros e positivos, utilize While) */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vAux = 1; int v1 = 0; int v2 = 1;
		
		while(v1 <= 1000) {
			System.out.print(v1 + " ");
			
			vAux = v1 + v2;
			v1 = v2;
			v2 = vAux; 
			
		}
		
sc.close();
	}

}
