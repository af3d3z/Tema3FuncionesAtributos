package ejercicio2;

public class Rectangulo {
	private double ancho;
	private double alto;
	
	public Rectangulo() {}
	
	// constructor Rectangulo con sus atributos para luego realizar operaciones
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	// devuelve el perímetro del rectángulo
	double perimetro() {
		double resultado = (2*this.ancho)+(2*this.alto);
		return resultado;
	}
	
	// devuelve el área del rectángulo
	double area() {
		double resultado = this.ancho * this.alto;
		return resultado;
	}
}
