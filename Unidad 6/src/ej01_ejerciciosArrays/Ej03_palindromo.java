package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej03_palindromo {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3 Mediante el uso de arrays pide al usuario un número y
		 * muestra por pantalla si este es palíndromo o no.
		 * Debes pedir el número completo, no digito a digito.
		 */
		
		boolean isNaN;
		String cadenaNumero;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Número: ");
			cadenaNumero = teclado.nextLine();
			isNaN = !cadenaNumero.matches("[0-9]+");
			if(isNaN){
				System.err.println("No es un número\n");
				continue;
			}
			System.out.println(
				comprobarPalindromo(stringToArray(cadenaNumero)) ?
					"Es palíndromo\n":
					"No es palíndromo\n");
		}while(!isNaN);
		
		teclado.close();
	}

	private static boolean comprobarPalindromo(String[] array) {
		for(int i=0; i<(array.length / 2); i++)
			if(!array[i].equals(array[array.length - i - 1]))
				return false;
		return true;
	}

	private static String[] stringToArray(String string) {
		return arrayEliminarPrimero(string.split(""));
	}

	private static String[] arrayEliminarPrimero(String[] array) {
		String[] nuevoArray = new String[array.length - 1];
		for(int i=1; i<array.length; i++)
			nuevoArray[i-1] = array[i];
		return nuevoArray;
	}

}
