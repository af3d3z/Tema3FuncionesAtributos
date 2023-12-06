package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	static int menu() {
		int opcion;
		
		//mostramos el menú
		System.out.println("CALCULADORA:");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
		System.out.println("0.Salir");
		
		opcion = (int) pideNumero();
		return opcion;
	}
	
	static double pideNumero() {
		boolean continuar = true;
		double entradaUsuario = -1;
		
		do {
			try {
				System.out.println("Introduce un número:");
				entradaUsuario = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.err.println("Error: El dato introducido es inválido:");
				sc.nextLine();
			}
		}while(entradaUsuario == -1);
		
		return entradaUsuario;
	}
	
	public static void main(String[] args) {
		// guardará la opción seleccionada en el menú
		int opcion;
		// guardará los dos operandos
		double primerNumero, segundoNumero;
		// guardará el resultado de la operación
		double resultado;
		
		opcion = menu();
		
		if(opcion <= 0 || opcion > 6) {
			System.out.println("¡Hasta luego!");
		}else {
			// pedimos los operadores
			primerNumero = pideNumero();
			segundoNumero = pideNumero();
			
			// creamos el objeto operaciones
			Operaciones operaciones = new Operaciones(primerNumero, segundoNumero);
			
			// en función de lo seleccionado en el menú se ejecutará una opción u otra
			switch(opcion) {
			case 1: {
				resultado = operaciones.suma();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
			case 2: {
				resultado = operaciones.resta();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
			case 3: {
				resultado = operaciones.multiplicacion();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
			case 4: {
				resultado = operaciones.division();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
			case 5: {
				resultado = operaciones.max();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
			case 6: {
				resultado = operaciones.min();
				System.out.printf("El resultado es: %f\n", resultado);
				break;
			}
		}
			
	}
		
		sc.close();
	}

}
