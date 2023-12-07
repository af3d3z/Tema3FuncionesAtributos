package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	// muestra el menú y pide el número al usuario hasta que dé un número válido
	static int menu() {
		int opcion = 0;
		
		System.out.println("1. Circunferencia");
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
	
	// pide el radio del círculo al usuario
	static double pideRadio () {
		double radio = 0;
		
		do {
			try {
				System.out.println("Introduce el radio del circulo");
				radio = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.err.println("El dato introducido es erroneo.");
				sc.nextLine();
			}
		}while(radio <= 0);
		
		return radio;
	}
	
	public static void main(String[] args) {
		// guarda el resultado de lo que elija el usuario en el menú
		int opcion;
		// guarda el radio introducido por el usuario
		double radio;
		double resultado = 0;
		
		opcion = menu();
		
		if(opcion == 0) {
			System.out.println("¡Hasta luego!");
		}else {
			radio = pideRadio();
			
			Circulo circulo = new Circulo(radio);
			
			switch(opcion) {
				case 1: {
					resultado =  circulo.circunferencia();
					break;
				}
				case 2: {
					resultado = circulo.area();
					break;
				}
			}
			
			System.out.printf("El resultado es: %f", resultado);
		}
		sc.close();
	}

}
