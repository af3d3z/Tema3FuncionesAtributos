package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	// pedimos un número al usuario y comprobamos que la opción introducida por el usuario es válida y si no lo es vuelve a preguntarle al usuario
	static int menu() {
		int opcion = -1;
		
		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		
		do {
			try {
				System.out.println("Introduce el número de la opción deseada:");
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Dato introducido incorrecto.");
				sc.nextLine();
			}
		}while(opcion < 0 || opcion > 2);
		
		return opcion;
	}
	
	// pide el ancho y si no es un valor real vuelve a preguntarlo
	static double pideAncho() {
		int ancho = 0;
		
		do {
			try {
				System.out.println("Introduce el ancho del rectángulo:");
				ancho = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Dato introducido incorrecto.");
				sc.nextLine();
			}
		}while(ancho <= 0);
		return ancho;
	}
	
	// pide el alto y si no es un valor real vuelve a preguntarlo
	static double pideAlto() {
		int alto = 0;
		
		do {
			try {
				System.out.println("Introduce el alto del rectángulo:");
				alto = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Dato introducido incorrecto.");
				sc.nextLine();
			}
		}while(alto <= 0);
		return alto;
	}
	
	public static void main(String[] args) {
		// guardará la opción seleccionada en el menú
		int opcion;
		// guardan el ancho y alto introducidos por el usuario
		double ancho, alto;
		double resultado = 0;
		
		opcion = menu();
		
		if(opcion == 0) {
			System.out.println("¡Hasta luego!");
		}else {
			ancho = pideAncho();
			alto = pideAlto();
			
			Rectangulo rectangulo = new Rectangulo(alto, ancho);
			
			switch(opcion) {
				case 1: {
					resultado = rectangulo.perimetro();
					break;
					}
				case 2: {
					resultado = rectangulo.area();
					break;
					}
			}
			
			System.out.printf("El resultado es: %f", resultado);
		}
		sc.close();
	}

}
