package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej04_numeroCaracteres {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida al usuario la introducción de un
		 * carácter hasta que este pulse el carácter @.
		 * El programa debe mostrar las veces que se ha escrito cada carácter.
		 * Recordad que los caracteres tienen asociado un número (código) que comienza por cero.
		 */
		
		Scanner teclado = new Scanner(System.in);
		String texto = "";
		int charAlto = 0;
		int posicionAt = 0;
		int[] chars;
		
		while((posicionAt = texto.indexOf("@")) == -1){
			texto += teclado.nextLine();
		}

		for(int i=0; i<texto.length(); i++)
			if(charAlto<texto.charAt(i))
				charAlto=texto.charAt(i);
		
		chars = new int[charAlto + 1];
		for(int i=0; i<posicionAt; i++)
			chars[texto.charAt(i)]++;
		
		System.out.println("Número de caracteres:");
		for(int i=0; i<chars.length; i++)
			if(chars[i] > 0)
				System.out.printf(" %s [%3d]  =>  %4d\n", (char) i, i, chars[i]);
		
		teclado.close();

	}

}
