package areaTriangulo;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		//Programa para calcular el area de un triangulo, el usuario ingresa base y altura.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la base del triangulo:");
		float base = scan.nextFloat();
		System.out.println("Ingrese la altura del triangulo:");
		float alt = scan.nextFloat();
		final float op = (base*alt)/2;
		System.out.println("El area del triangulo es: "+op);
	}
}