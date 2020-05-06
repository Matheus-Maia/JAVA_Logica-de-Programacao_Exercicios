package br.ucsal;

/* PROBLEMA: a partir de no nome completo qualquer, atribuído a uma variável com tipo String, construa os 
 * métodos específicos para solucionar cada questão abaixo:
 * 
a) Nome do Método: obterDados. Contém a variável nome com o nome completo qualquer
b) Nome do Método: imprimir. Recebe o nome como parâmetro e imprime o nome
c) Nome do Método: palavraPorLinha. Recebe o nome e executa o método de impressão com uma palavra em cada linha
d) Nome do Método: vertical. Recebe o nome e executa o método de impressão com o nome na vertical
e) Nome do Método: diagonal. Recebe o nome e executa o método de impressão com o nome na diagonal decrescente
f) Nome do Método: inverso. Recebe o nome e executa o método de impressão com o nome de trás para frente

OBS: O método main vai apenas executar o método obterDados. */

public class Laboratorio33 {
	

	public static void main(String[] args) {
		obterDados();
	}

	public static void obterDados () {
		String nome = "Matheus Maia Carvalho";
		imprimir(nome);
		imprimir("\n\n");
		
		palavraPorLinha(nome);
		vertical(nome);
		diagonal(nome);
		inverso(nome);
	}
	
	public static void palavraPorLinha (String palavra) {
		imprimir (" ");
		
		for (int var = 0; var < palavra.length(); var++) {
			if(palavra.substring(var, var + 1).equals(" ")) {
				imprimir ("\n");
			}
			
			imprimir(palavra.substring(var, var + 1) + "");			
		}
	}
	
	public static void vertical (String nomeVertical) {
		imprimir("\n\n");
		
		for (int var = 0; var < nomeVertical.length(); var++) {
			imprimir(nomeVertical.substring(var, var + 1) + "\n");			
		}
		
		
	}
	
	public static void diagonal (String nomeDiagonal) {
		imprimir ("\n\n");
		String espaco = "";
		for (int var = 0; var < nomeDiagonal.length(); var++) {
			imprimir(espaco + nomeDiagonal.substring(var, var + 1) + "\n");
			espaco += "  ";
		}
	}
	
	public static void inverso (String nomeInvertido) {
		imprimir ("\n\n");
		
		for (int var = nomeInvertido.length(); var > 0; var--) {
			imprimir (nomeInvertido.substring(var - 1, var));
		}
		 	
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);
	}
}
