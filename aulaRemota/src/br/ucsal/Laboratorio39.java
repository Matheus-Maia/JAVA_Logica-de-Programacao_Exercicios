package br.ucsal;

/* PROBLEMA: Crie um método de nome valoresSeq1 para ser preenchido dinamicamente com um vetor de 20 números inteiros
 *  positivos formado pela sequencia fibonacci da seguinte forma: {0, 1, 1, ... } - O ultimo número deverá ser: 4181*/

public class Laboratorio39 {

	public static void main(String[] args) {
		imprimir (valoresSeq1());
	}
	
	public static int[] valoresSeq1 () {
		int [] vetorSequencia = new int [20];
		
		int priValor = 0, segValor = 1, aux = 0;
		
		for (int i = 0; i < vetorSequencia.length; i++) {
			vetorSequencia [i] = priValor;
			aux = priValor;
			priValor = segValor;
			segValor += aux;
		}
		return vetorSequencia;
	}
	
	public static void imprimir (int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
