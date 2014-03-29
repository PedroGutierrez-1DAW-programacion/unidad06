package ej03_pantalla_Ej10;

import java.util.Scanner;
import java.util.Vector;

public enum MenuPantalla {
	MENU		(1, 1, "Menu", new String[]{"Elegir carácter", "Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Mostrar pantalla"}),
	PANTALLA	(2, 1, "Pantalla", new String[]{"Tamaño"}),
	CARACTER	(2, 2, "Caracter", new String[]{"Caracter"}),
	CUADRADO	(2, 1, "Cuadrado", new String[]{"Inicio [Eje X]", "Inicio [Eje Y]", "Tamaño"}),
	RECTANGULO	(2, 1, "Rectángulo", new String[]{"Inicio [Eje X]", "Inicio [Eje Y]", "Tamaño [Eje X]", "Tamaño [Eje Y]"}),
	TRIANGULO	(2, 1, "Triángulo", new String[]{"Inicio [Eje X]", "Inicio [Eje Y]", "Tamaño"}),
	CIRCULO		(2, 1, "Círculo", new String[]{"Centro [Eje X]", "Centro [Eje Y]", "Radio"});

	private int tipoMenu = 0;
	private int tipoDato = 0;
	private String titulo = "";
	private Vector<Integer> resultados;
	private String[] listaDatos;
	private Scanner scn = new Scanner(System.in);
	
	MenuPantalla(int tipoMenu, int tipoDato, String titulo, String[] menu){
		this.tipoMenu = tipoMenu;
		this.tipoDato = tipoDato;
		this.titulo = titulo;
		this.listaDatos = menu;
	}
	
	public Integer[] datos(){
		
		this.resultados = new Vector<Integer>();
		
		System.out.printf("--[%s]%s\n", this.titulo, "--------------------".substring(this.titulo.length() + 4));
		
		switch(this.tipoMenu){
			case 1:
				int n = 0;
				for(String dato : listaDatos)
					System.out.printf("[%d] %16s\n", ++n, dato);
				this.resultados.add(pedirDato("--------------------"));
				break;
			case 2:
				for(String dato : listaDatos)
					this.resultados.add(pedirDato(dato));
				break;
		}

		System.out.println("--------------------\n");
		
		return toIntArray(this.resultados);
	}

	private int pedirDato(String nombre) {
		String dato = "-1";
		
		System.out.println(nombre);
		
		switch(this.tipoDato){
		case 1: 
			do System.out.print("  => ");
			while(!(new String(dato = scn.nextLine())).matches("[0-9]{1,3}"));
			break;
		case 2: 
			do{
				System.out.print("  => ");
				
				String linea = scn.nextLine();
				if(linea.length() == 0) continue;
				
				dato = new String("" + ((int) (new String(linea)).charAt(0)));
			}while(!(new Integer(dato) >= 0 && new Integer(dato) < 256 && dato != "-1"));
			break;
		}
		
		
		return new Integer(dato);
	}

	private Integer[] toIntArray(Vector<Integer> resultados) {
		return (Integer[]) resultados.toArray(new Integer[listaDatos.length]);
	}
	
}
