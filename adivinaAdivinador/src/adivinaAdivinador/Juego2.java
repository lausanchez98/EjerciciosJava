package adivinaAdivinador;

import java.util.Random;
import java.util.Scanner;

public class Juego2 {

	public static void main(String[] args) {
//		Objetos
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
//		Variables globales
		int randomNumber = rand.nextInt(10) + 1;
	

//		Debugging
		System.out.println("El numero random es: " + randomNumber);
		
//		Ingresar valor
		System.out.println("Ingrese un numero del 1 al 10");
		int numeroUsuario = sc.nextInt();
		
//		Primer condicion
		if(numeroUsuario == randomNumber) {
			System.out.println("Se ha ganado unos chocorroles");
		}else if(numeroUsuario > randomNumber) {
			System.out.println("Su numero ingresado es mayor");
		}else {
			System.out.println("Su numero ingresado es menor");
		}
	}
}