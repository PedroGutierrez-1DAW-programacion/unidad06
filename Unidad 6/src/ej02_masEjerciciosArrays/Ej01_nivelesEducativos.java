package ej02_masEjerciciosArrays;

import java.util.Arrays;

public class Ej01_nivelesEducativos {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1. Declara y crea un tipo de variable que sea capaz de
		 * contenerel número de alumnos matriculados en 4 institutos en
		 * 5 niveles de estudios: ESO, BACHILLERATO, CGM, CGS, PCPI.
		 */
		
		int[][] institutos = new int[4][5];

		institutos[1][0] = 2;
		institutos[1][3] = 3;
		
		System.out.println(Arrays.toString(institutos[1]));
	}

}
