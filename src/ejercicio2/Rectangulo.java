package ejercicio2;

public class Rectangulo {
	private double ancho;
	private double alto;
	
	public Rectangulo() {}
	
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	double perimetro() {
		double resultado = (2*this.ancho)+(2*this.alto);
		return resultado;
	}
	
	double area() {
		double resultado = this.ancho * this.alto;
		return resultado;
	}
}
