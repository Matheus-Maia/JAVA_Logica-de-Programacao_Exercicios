package br.ucsal;

/* PROBLEMA: a partir de no nome completo qualquer, atribu�do a uma vari�vel com tipo String, construa os 
 * m�todos espec�ficos para solucionar cada quest�o abaixo:
 * 
a) Nome do M�todo: obterDados. Cont�m a vari�vel nome com o nome completo qualquer
b) Nome do M�todo: imprimir. Recebe o nome como par�metro e imprime o nome
c) Nome do M�todo: palavraPorLinha. Recebe o nome e executa o m�todo de impress�o com uma palavra em cada linha
d) Nome do M�todo: vertical. Recebe o nome e executa o m�todo de impress�o com o nome na vertical
e) Nome do M�todo: diagonal. Recebe o nome e executa o m�todo de impress�o com o nome na diagonal decrescente
f) Nome do M�todo: inverso. Recebe o nome e executa o m�todo de impress�o com o nome de tr�s para frente

OBS: O m�todo main vai apenas executar o m�todo obterDados. */

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
