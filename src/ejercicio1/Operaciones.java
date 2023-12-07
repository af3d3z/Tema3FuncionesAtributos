package ejercicio1;

public class Operaciones {
	private double num1;
	private double num2;
	
	public Operaciones() {
		
	}
	
	// constructor Operaciones con sus números para luego realizar operaciones
	public Operaciones(double primerNumero, double segundoNumero) {
		this.num1 = primerNumero;
		this.num2 = segundoNumero;
	}
	
	// suma los números y devuelve el resultado
	public double suma() {
		double resultado = this.num1 + this.num2;
		return resultado;
	}
	
	//resta los números y devuelve el resultado
	public double resta() {
		double resultado = this.num1 - this.num2;
		return resultado;
	}
	
	// multiplica los números y devuelve el resultado
	public double multiplicacion() {
		double resultado = this.num1 * this.num2;
		return resultado;
	}
	
	// comprueba si uno de los números es 0 y si ninguno lo es divide los números
	public double division() {
		double resultado = this.num1 == 0 || this.num2 == 0 ? 0 : this.num1 / this.num2;
		return resultado;
	}
	
	// en caso de que el primer número sea mayor al segundo se devolverá el primero, en caso contrario se devolverá el segundo
	public double max() {
		double resultado = this.num1 > this.num2 ? this.num1: this.num2;
		return resultado;
	}
	
	// en caso de que el primer número sea menor al segundo se devolverá el primero, en caso contrario se devolverá el segundo
	public double min() {
		double resultado = this.num1 < this.num2 ? this.num1: this.num2;
		return resultado;
	}
	
}
