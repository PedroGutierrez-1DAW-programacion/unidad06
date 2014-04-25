package ej05_strings;

import java.util.StringTokenizer;

public class Ej03_contarPalabras {

	public static void main(String[] args) {
		
		String frase = "El perro de San Roque, ese fué.";
		
		StringTokenizer contar = new StringTokenizer(frase);
		
		System.out.println(contar.countTokens());

	}

}
