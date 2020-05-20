package br.ucsal;

/* PROBLEMA: Crie um método de nome valoresSeq3 para ser preenchido dinamicamente com um vetor de 30
 *  números inteiros positivos formado pela sequencia lógica dos números que seguem da seguinte forma: 
 *  {7 3 14 4 21 5 28 6 ... } - os dois últimos números deverão ser: 105 17 */

public class Laboratorio38 {

	public static void main(String[] args) {
		imprimir(valoresSeq3());

	}
	
	public static int[] valoresSeq3 () {
		int [] vetorSequencia = new int[30];
		int seq1 = 0, seq2 = 2;
		
		for (int i = 0; i < vetorSequencia.length; i += 2) {
			seq1 += 7;
			seq2 += 1;
			vetorSequencia[i] = seq1;
			vetorSequencia[i + 1] = seq2;
		}
		return vetorSequencia;
	}
	
	public static void imprimir (int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
