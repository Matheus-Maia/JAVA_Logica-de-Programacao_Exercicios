package br.ucsal;

import java.util.Scanner;

public class Laboratório02 {

	/* Problema: elabore um algoritmo para calcular a média ponderada de duas notas definidas pelo usuário em um
	 * intervalo fechado de 0 a 10, com pesos respectivamente 4.0 e 6.0. O resultado deverá ser apresentado como 
	 * "aprovado", "prova final" ou "reprovado" de acordo com a seguinte regra: se a média final for maior ou igual
	 *  a 6 o aluno está aprovado, se a média final for menor que 6 e maior que 4 o aluno dever fazer a prova final, 
	 *  qualquer outra nota o aluno está reprovado.*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe duas notas de 0 a 10: ");
		double nota1 = ent.nextDouble();
		double nota2 = ent.nextDouble();
		final double peso1 = 4;
		final double peso2 = 6;


		double resultado = (nota1 * peso1 + nota2 * peso2)/(peso1 + peso2);

		if(nota1 > 10 || nota2 > 10) {

			System.out.println("ERRO! Informe notas apenas com valores dentro do intervalo de 0 a 10.");

		}else if(resultado <= 4 ) {
			System.out.println( "NOTA = " + resultado + " ALUNO REPROVADO");

		}else if (resultado > 4 && resultado < 6) {
			System.out.println( "NOTA = " + resultado + " O ALUNO ESTÁ NA PROVA FINAL");

		}else {
			System.out.println( "NOTA = " + resultado + " ALUNO APROVADO");
		}



		ent.close();
	}

}
