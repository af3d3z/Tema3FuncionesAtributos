package ejercicio3;

public class Circulo {
	private double radio;
	
	public Circulo() {}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double circunferencia() {
		double resultado = 2 * Math.PI * radio;
		return resultado;
	}
	
	public double area() {
		double resultado = Math.PI * Math.pow(radio, 2);
		return resultado;
	}
}
