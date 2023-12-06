package ejercicio1;

public class Operaciones {
	private double num1;
	private double num2;
	
	public Operaciones() {
		
	}
	
	public Operaciones(double primerNumero, double segundoNumero) {
		this.num1 = primerNumero;
		this.num2 = segundoNumero;
	}
	
	
	public double suma() {
		double resultado = this.num1 + this.num2;
		return resultado;
	}
	
	public double resta() {
		double resultado = this.num1 - this.num2;
		return resultado;
	}
	
	public double multiplicacion() {
		double resultado = this.num1 * this.num2;
		return resultado;
	}
	
	public double division() {
		double resultado = this.num1 == 0 || this.num2 == 0 ? 0 : this.num1 / this.num2;
		return resultado;
	}
	
	public double max() {
		double resultado = this.num1 > this.num2 ? this.num1: this.num2;
		return resultado;
	}
	
	public double min() {
		double resultado = this.num1 < this.num2 ? this.num1: this.num2;
		return resultado;
	}
	
}
