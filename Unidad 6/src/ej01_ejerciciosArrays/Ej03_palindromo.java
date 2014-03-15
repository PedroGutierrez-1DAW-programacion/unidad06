package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej03_palindromo {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3 Mediante el uso de arrays pide al usuario un n�mero y
		 * muestra por pantalla si este es pal�ndromo o no.
		 * Debes pedir el n�mero completo, no digito a digito.
		 */
		
		boolean isNaN;
		String cadenaNumero;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("N�mero: ");
			cadenaNumero = teclado.nextLine();
			isNaN = !cadenaNumero.matches("[0-9]+");
			if(isNaN){
				System.err.println("No es un n�mero\n");
				continue;
			}
			System.out.println(
				comprobarPalindromo(stringToArray(cadenaNumero)) ?
					"Es pal�ndromo\n":
					"No es pal�ndromo\n");
		}while(!isNaN);
		
		teclado.close();
	}

	private static boolean comprobarPalindromo(String[] array) {
		boolean palindromo = true;
		for(int i=1; i<(array.length / 2); i++)
			if(!array[i].equals(array[array.length - i]))
				palindromo = false;
		return palindromo;
	}

	private static String[] stringToArray(String string) {
		// Devuelve la primera casilla en blanco,
		// "comprobarPalindromo" est� preparado para ello
		return string.split("");
	}

}
