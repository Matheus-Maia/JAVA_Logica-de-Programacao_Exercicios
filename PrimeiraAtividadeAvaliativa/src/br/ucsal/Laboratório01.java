package br.ucsal;

import java.util.Scanner;

public class Laborat�rio01 {

	/*elabore uma solu��o para a partir de tr�s notas informadas pelo usu�rio, seja apresentada a m�dia aritm�tica e o resultado se
	est� aprovado ou reprovado. Considere que a aprova��o dever� ocorrer se a m�dia final estiver igual ou acima de 6.*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double nota1, nota2, nota3, media;
		System.out.println("Informe a primeira nota ");
		nota1 = ent.nextDouble();
		System.out.println("Informe a segunda nota ");
		nota2 = ent.nextDouble();
		System.out.println("Informe a terceira nota ");
		nota3 = ent.nextDouble();
		media = (nota1 + nota2 + nota3)/3;

		if(media >= 6) {
			System.out.println("O aluno foi aprovado, sua nota � " +media);
		}else {
			System.out.println("O aluno foi reprovado, sua nota � " +media);
		}

		ent.close();
	}

}





