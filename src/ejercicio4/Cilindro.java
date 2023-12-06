package ejercicio4;

public class Cilindro {
	private double radioBase;
	private double altura;
	
	public Cilindro() {}
	
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	public double volumen() {
		double resultado = Math.PI * Math.pow(radioBase, 2) * altura;
		return resultado;
	}
	
	public double area() {
		double resultado = 2 * Math.PI * radioBase * (radioBase + altura);
		return resultado;
	}
}
