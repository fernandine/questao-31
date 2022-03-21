package aplicacao;


import entidade.Inverso;

public class Programa extends Inverso {

	public static void main(String[] args) {

		/*
		 * int[] b = {1, 2, 3, 4, 5 }; for (int i = 0; i < a.length; i++) {
		 * System.out.println(b[i]); } System.out.println("Agora a ordem invertida");
		 * for (int j = a.length - 1; j >= 0; j--) { System.out.println(b[j]); }
		 */

		// RESULTADO: 5 4 3 2 1

		
		Inverso inverso = new Inverso();
	
		Integer[] numeros = {15485448, 195498, 12, 98716549, 1654891 };
		

		int[] resultado = new int[numeros.length];
		resultado = inverso.revCalculator(numeros);

		// Resultado
		System.out.println("Numero invertido: ");
		for (int i = 0; i < resultado.length; i++)
			System.out.println(resultado[i]);
		
	}
}
