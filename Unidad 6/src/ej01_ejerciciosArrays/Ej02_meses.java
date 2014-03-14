package ej01_ejerciciosArrays;

import java.util.Scanner;

public class Ej02_meses {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2 Crea un programa que almacene los meses del año (los nombres de cada mes).
		 * Se pedirá al usuario el número de mes y se visualizará su nombre.
		 */
		
		String[] meses = new String[]{
			"Enero", "Febrero", "Marzo",
			"Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"};
		Scanner teclado = new Scanner(System.in);
		int n;
		
		while((n = teclado.nextInt()) <= meses.length && n>0)
			System.out.println(meses[n-1]);
		
		teclado.close();
	}

}
