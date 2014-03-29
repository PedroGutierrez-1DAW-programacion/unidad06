package ej03_pantalla_Ej10;

import java.awt.peer.MenuPeer;

public class Pantalla {
	private char[][] pantalla;
	private char dibujar = 'X';
	private final char basePantalla = '*';
	
	public Pantalla(){
		int tamanio = MenuPantalla.PANTALLA.datos()[0];
		
		this.pantalla = new char[tamanio][tamanio];
	}

	public Pantalla(int size){
		this.pantalla = new char[size][size];
	}
	
	public void iniciar(){
		rellenarPantalla(this.basePantalla);
		
		while(true){
			switch((int) MenuPantalla.MENU.datos()[0]){
			case 1: accionCaracter(MenuPantalla.CARACTER.datos());break;
			case 2: accionCuadrado(MenuPantalla.CUADRADO.datos());break;
			case 3: accionRectangulo(MenuPantalla.RECTANGULO.datos());break;
			case 4: accionTriangulo(MenuPantalla.TRIANGULO.datos());break;
			case 6: accionMostrarPantalla(); break;
			default: System.err.println("Opción no válida\n"); break;
			}
		}
	}

	private void rellenarPantalla(char caracter) {
		for(int x=0; x<pantalla.length; x++)
			for(int y=0; y<pantalla[x].length; y++)
				pantalla[x][y] = caracter;
	}

	private void accionCaracter(Integer[] datos) {
		this.dibujar = (char) (int) datos[0];	
	}

	private void accionCuadrado(Integer[] datos) {
		int x = datos[0];
		int y = datos[1];
		int s = --datos[2];

		dibujarRectangulo(x, y, s, s);
	}

	private void accionRectangulo(Integer[] datos) {
		int x = datos[0];
		int y = datos[1];
		int sx = --datos[2];
		int sy = --datos[3];
		
		dibujarRectangulo(x, y, sx, sy);
	}

	private void accionTriangulo(Integer[] datos) {
		int x = datos[0];
		int y = datos[1];
		int s = --datos[2];

		dibujarLinea(x, y, x, y + s);
		dibujarLinea(x, y + s, x + s, y + s);
		dibujarDiagonal(x, y, s);
	}

	private void accionMostrarPantalla() {
		for(int x=0; x<pantalla.length; x++){
			for(int y=0; y<pantalla[x].length; y++)
				System.out.printf(" " + pantalla[y][x]);
			System.out.println();
		}
		System.out.println();
	}

	private void dibujarRectangulo(int x, int y, int sx, int sy) {
		dibujarLinea(x, y, x, y + sy);
		dibujarLinea(x, y, x + sx, y);
		dibujarLinea(x + sx, y, x + sx, y + sy);
		dibujarLinea(x, y + sy, x + sx, y + sy);		
	}
	
	private void dibujarLinea(int x1, int y1, int x2, int y2) {
		for(int x=x1; x<=x2; x++)
			for(int y=y1; y<=y2; y++)
				dibujarPunto(x, y);
	}
	
	private void dibujarDiagonal(int x, int y, int s) {
		for(int d=0; d<=s; d++)
			dibujarPunto(x + d, y + d);
	}

	private void dibujarPunto(int x, int y) {
		dibujarPunto(x, y, this.dibujar);
	}

	private void dibujarPunto(int x, int y, char caracter) {
		if(pantalla.length > x)
			if(pantalla[x].length > y)
				pantalla[x][y] = caracter;
	}
	

}
