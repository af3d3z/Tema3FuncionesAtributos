package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	static int menu() {
		int opcion = 0;
		
		System.out.println("1. Volumen");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		
		do {
			try {
				System.out.println("Seleccione una opción:");
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("El dato introducido es erroneo.");
				sc.nextLine();
			}
		}while(opcion < 0 || opcion > 2);
		
		return opcion;
	}
	
	static double pideRadioBase() {
		double radio = 0;
		
		do {
			try {
				System.out.println("Introduce el radio de la base del cilindro:");
				radio = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.err.println("El dato introducido es erroneo.");
				sc.nextLine();
			}
		}while(radio <= 0);
		
		return radio;
	}
	
	static double altura() {
		double altura = 0;
		
		do {
			try {
				System.out.println("Introduce la altura del cilindro:");
				altura = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.err.println("El dato introducido es erroneo.");
				sc.nextLine();
			}
		}while(altura <= 0);
		
		return altura;
	}

	public static void main(String[] args) {
		int opcion;
		double radioBase, altura;
		double resultado = 0;
		
		opcion = menu();
		
		if(opcion == 0) {
			System.out.println("¡Hasta luego!");
		}else {
			radioBase = pideRadioBase();
			altura = altura();
			Cilindro cilindro = new Cilindro(radioBase, altura);
			
			switch(opcion) {
				case 1: {
					resultado =  cilindro.volumen();
					break;
				}
				case 2: {
					resultado = cilindro.area();
					break;
				}
			}
			System.out.printf("El resultado es: %f", resultado);
		}
		sc.close();
	}

}
