package br.ucsal;


/* PROBLEMA: Crie um método de nome valoresSeq2 para ser preenchido dinamicamente com um vetor de 15 números inteiros positivos 
 * formado pela sequencia lógica dos números que seguem da seguinte forma: {3, 8, 18, 38, 78, ... } - O ultimo número deverá ser: 81918
 */

public class Laboratorio37 {

	public static void main(String[] args) {
		imprimir (valoresSeq2());

	}

	public static int[] valoresSeq2 () {
		int[] vetorSequencia = new int [15];
		int logica = 3, razao = 5;

		for (int i = 0; i < vetorSequencia.length; i++) {
			vetorSequencia[i] = logica;
			logica += razao;
			razao *= 2;
		}
		
		return vetorSequencia;
	}
	
	public static void imprimir (int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
