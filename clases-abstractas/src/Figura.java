/*
 * Metodos o funciones que no tienen cuerpo. No realizan ninguna accion, solo nos dice que
 * debemos hacer pero no nos dice como.
 * 
 * Notas:
 * 
 * -Una clase abstracta es una clase normal con al menos un metodo abstracto.
 * -Una clase abstracta puede ser heredada por n cantidad de subclases, pero no puede ser instanciada.
 * 
 * 
 * 
 * */
public abstract class Figura {
	//Atributos
	private int numLados;

	//Constructores
	public Figura() {
		this.numLados = 0;
	}
	
	//Constructor "normal"
	
	
	//Metodo para calcular area
	public abstract float area();
	
	//Figura
	
	
	
}
