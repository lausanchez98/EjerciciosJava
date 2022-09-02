package datos_privados;

public class Bigotes {
	
	/*
	 * Orden para crear clases y objetos
	 * 
	 * 1.- Definir atributos de la clase
	 * 2.- Constructores
	 * 3.- Metodos
	 * 4.- toString para poder visualizar la informacion
	 * 
	 */

	public String nombre;
	public int edad;
	private String colorDePelo;
	private int numeroBigotes;
	public boolean enfermedades;
	private String raza;
	public boolean vacunas;
	private String calle;
	private int numeroCasa;
	private String colonia;
	public String numeroTelefono;
	private int codigoPostal;
	public String signoZodiacal;
	private double peso;
	
	public Bigotes(String nombre, int edad, String colorDePelo, int numeroBigotes, boolean enfermedades, String raza,
			boolean vacunas, String calle, int numeroCasa, String colonia, String numeroTelefono, int codigoPostal,
			String signoZodiacal, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.colorDePelo = colorDePelo;
		this.numeroBigotes = numeroBigotes;
		this.enfermedades = enfermedades;
		this.raza = raza;
		this.vacunas = vacunas;
		this.calle = calle;
		this.numeroCasa = numeroCasa;
		this.colonia = colonia;
		this.numeroTelefono = numeroTelefono;
		this.codigoPostal = codigoPostal;
		this.signoZodiacal = signoZodiacal;
		this.peso = peso;
	}
	
	public void datosCollarBigotes() {
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println(this.colorDePelo);
		System.out.println(this.numeroBigotes);
		System.out.println(this.enfermedades);
		System.out.println(this.raza);
		System.out.println(this.vacunas);
		System.out.println(this.calle);
		System.out.println(this.numeroCasa);
		System.out.println(this.colonia);
		System.out.println(this.numeroTelefono);
		System.out.println(this.codigoPostal);
		System.out.println(this.signoZodiacal);
		System.out.println(this.peso);
	}


	/*
	 *Getters y setters
	 *Son metodos ya establecidos para poder sacar la informacion privada de mi objeto, 
	 *almacenarla en un espacio de memoria "virtual", para con estos metodos poder 
	 *consultar o modificar segun me convenga. La gran ventaja de usarlos es que si los 
	 *borro, nunca se habra modificado el objeto original.
	 *
	*/

	//Getter
	public double getPeso() {
		return peso;
	}
	
	//Setter
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Bigotes [nombre=" + nombre + ", edad=" + edad + ", colorDePelo=" + colorDePelo + ", numeroBigotes="
				+ numeroBigotes + ", enfermedades=" + enfermedades + ", raza=" + raza + ", vacunas=" + vacunas
				+ ", calle=" + calle + ", numeroCasa=" + numeroCasa + ", colonia=" + colonia + ", numeroTelefono="
				+ numeroTelefono + ", codigoPostal=" + codigoPostal + ", signoZodiacal=" + signoZodiacal + ", peso="
				+ peso + "]";
	}	
}
