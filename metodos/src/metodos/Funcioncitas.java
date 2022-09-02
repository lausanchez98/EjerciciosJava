package metodos;

public class Funcioncitas {
	//Funcion para hacer un System.out
	static void imprimirDatos() {
		System.out.println("Primer funcion de Funcioncitas");
	}
	//Funcion con argumentos
	static void imprimirDatosArg(String mensaje) {
		System.out.println(mensaje);
	}
	//Funcion return boolean
	static boolean regresarBooleano() {
		return true;
	}
	//Funcion return int
	static int regresarEntero() {
		return 2022;
	}
	//Funcion return String 
	static String regresarString() {
		return "Hola Mundo";
	} 
	//Funcion return double
	static double regresarDoble() {
		return 3.1415;
	}
	//Funcion return double y args double
	static double areaTriangulo(double base, double altura) {
		return base*altura/2; //la jerarquia se ajusta, pues se lee de izq a der
	}
	//Funcion return double + mensaje
	static String areaTrianguloMensaje(double base, double altura) {
		String mensaje = "El área es: " + (base * altura / 2);
		return mensaje;
	}
	//Funcion que imprime longitud de un mensaje
	static String imprimirLongitud(String mensaje) {
		int longitud = mensaje.length();
		String mensajeImp = "La longitud del mensaje es: " + longitud;
		return mensajeImp;
	}
	//Metodo Overloading
	static String error(String error) {
		String mensaje = "Ha ocurrido un error: " + error;
		return mensaje;
	}
	static String error(String error, String warning) {
		String mensaje = "Ha ocurrido un error: " + error + "\n" + warning;
		return mensaje;
	}
	static String error(int error) {
		String mensaje = "Ha ocurrido un error: " + error;
		return mensaje;
	}
	
	public static void main(String[] args) {
//		imprimirDatos();
//		imprimirDatosArg("Hola");
//		imprimirDatosArg("¿Como estas?");
//		System.out.println(regresarBooleano());
//		System.out.println(regresarEntero());
//		System.out.println(regresarString());
//		System.out.println(regresarDoble());
//		System.out.println(areaTriangulo(3,7));
//		System.out.println(areaTrianguloMensaje(5,6));
//		System.out.println(imprimirLongitud("Tangananica"));
		System.out.println(error("404"));
		System.out.println(error("404", "No se encontro la ruta"));
		System.out.println(error(404));
	}
	
}