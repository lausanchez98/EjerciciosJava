package ingresoDatos;
import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		System.out.println("Hola Generation");
		/*
		 * Declarar  nuevo Scanner para ingresar
		 * datos, para esto se usa la palabra reservada Scanner
		 * sc, despues se crea un nuevo scanner con la palabra 
		 * reservada new Scanner
		*/
		//Estoy ya existe, es documentacion de Java
		Scanner sc = new Scanner(System.in);
		/*
		 * Datos introducidos por el usuario
		 * 
		 * -boolean 
		 * 		boolean nextBoolean() //true, false
		 * -bytes 
		 * 		byte nextByte() //30
		 * -double
		 * 		double nextDouble() //1.87650
		 * -float
		 * 		float nextFloat() //3.14
		 * -int 
		 * 		int nextInt() //5
		 * -String
		 * 		String nestString() //Hola me gustan las gorditas de nata
		 * -long
		 * 		long nextLong() //
		 * -short
		 * 		short nextShort() //182944505
		 * -char
		 * 		char nextChar() //?
		 * 
		*/
		System.out.println("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingresa tu edad: ");
		int edad = sc.nextInt();
//		System.out.println("Ingresa tu correo: ");
//		String correo = sc.nextLine();
		System.out.println("Ingresa tu telefono: ");
		long telefono = sc.nextLong();
		System.out.println("Ingresa si estudias programacion (true/false): ");
		boolean estudiaProgramacion = sc.nextBoolean();
//		char inicialNom = sc.nextc;
		System.out.println("Ingresa tu estatura: ");
		float estatura = sc.nextFloat();
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu edad es: "+edad);
//		System.out.println("Tu correo es: "+correo);
		System.out.println("Tu telefono es: "+telefono);
		System.out.println("Estudias programacion: "+estudiaProgramacion);
		System.out.println("Tu estatura es: "+estatura);
		/*Metodos para comprobar que el tipo de dato que estoy ingresando sea el correcto
		 * 
		 * hasNextBoolean() true
		 * hasNextByte
		 * hasNextDouble
		 * hasNextFloat
		 * 
		 *
		*/
	}//main
}//class
