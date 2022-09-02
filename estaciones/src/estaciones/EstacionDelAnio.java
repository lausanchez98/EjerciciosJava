package estaciones;

//imports
import java.util.Scanner;

public class EstacionDelAnio {
	
	public static void main(String[] args) {
		// Variables globales
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la estacion del año a verificar: ");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Primavera");
			break;
		case 2:
			System.out.println("Verano");
			break;
		case 3:
			System.out.println("Halloween"); // jk
			break;
		case 4:
			System.out.println("Navidad"); // jk
			break;
		default:
			System.out.println("No existe estacion del año relacionada con ese numero.");
		}
		
	}
	
}
