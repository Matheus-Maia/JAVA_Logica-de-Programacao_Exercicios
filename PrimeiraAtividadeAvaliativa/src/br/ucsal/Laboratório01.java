package br.ucsal;

import java.util.Scanner;

public class Laboratório01 {

	/*elabore uma solução para a partir de três notas informadas pelo usuário, seja apresentada a média aritmética e o resultado se
	está aprovado ou reprovado. Considere que a aprovação deverá ocorrer se a média final estiver igual ou acima de 6.*/

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
			System.out.println("O aluno foi aprovado, sua nota é " +media);
		}else {
			System.out.println("O aluno foi reprovado, sua nota é " +media);
		}

		ent.close();
	}

}





