package adivinaAdivinador;
//imports
import java.util.Scanner;
import java.util.Random;
//Crear un programa donde el usuario deba adivinar un numero del 1 al 10
//Declarar un numero del 1 al 10
//Mientras no se adivine, sigue preguntando al usuario
//Avisar al usuario si el numero es mayor, menor o igual al declarado
//Debe de terminar cuando el usuario adivine.
public class Juego {
	public static void main(String[] args) {
		//Objetos
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		//Variables globales
		int randomNum = rm.nextInt(10)+1;
		int numIntento;
//		System.out.println(randomNum);
		do {
			System.out.println("¿Que numero piensa que la computadora esta guardando?");
			numIntento = sc.nextInt();
			if((numIntento <= 0) || (numIntento > 10)) {
				System.out.println("Ingrese un numero valido, entre 1 y 10");
			}else if(numIntento!=randomNum){
				System.out.println("Aun no, intente nuevamente...");
			}			
		}while(numIntento!=randomNum);
		System.out.println("Lo adivino! el numero era... "+randomNum);
	}
}