
public class Triangulo extends Figura {
	//Atributos
	int base;
	int altura;
	
	//Metodo que viene desde la figura
	@Override
	public float area() {
		return this.base*this.altura/2;
	}
	
	//Clase triangulo
	/*
	 * 
	 * Sobrecarga != Sobreescritura (overload/override)
	 * 
	 * Sobrecarga de metodos: El mismo metodo con parametros distintos.
	 * Sobreescritura de metodos: El mismo metodo, con cuerpos distintos.
	 * 
	*/

}
