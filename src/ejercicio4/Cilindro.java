package ejercicio4;

public class Cilindro {
	private double radioBase;
	private double altura;
	
	public Cilindro() {}
	
	// constructor Cilindro con sus atributos para luego operar con ellos
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	// devuelve el volumen de un objeto cilindro ya instanciado y con sus atributos establecidos
	public double volumen() {
		double resultado = Math.PI * Math.pow(radioBase, 2) * altura;
		return resultado;
	}

	// devuelve el area de un objeto cilindro ya instanciado y con sus atributos establecidos
	public double area() {
		double resultado = 2 * Math.PI * radioBase * (radioBase + altura);
		return resultado;
	}
}
