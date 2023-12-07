package ejercicio3;

public class Circulo {
	private double radio;
	
	public Circulo() {}
	
	// constructor Circulo con el atributo radio
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	// devuelve la circunferencia del círculo con el radio dado en el constructor
	public double circunferencia() {
		double resultado = 2 * Math.PI * radio;
		return resultado;
	}
	
	// devuelve el área del círculo con el radio dado en el constructor
	public double area() {
		double resultado = Math.PI * Math.pow(radio, 2);
		return resultado;
	}
}
