package flujo;
//imports
import java.util.Scanner;
public class Practica1 {
	public static void main(String[] args) {
		//variables globales
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad: ");
		//variables locales
		int edad  = sc.nextInt();
		if(edad > 0) {
			if (edad>=18) {
				System.out.println("Ahi viene el SAT. Pasa al afore.");
			}else {
				System.out.println("Chiquitin.");
			}
		}else {
			System.out.println("Ingrese una edad valida.");
		}
		//misma verificacion con else if
//		if (edad<=0) {
//			System.out.println("Ingrese una edad valida.");
//		}else if(edad < 18) {
//			System.out.println("Chiquitin.");
//		}else {
//			System.out.println("Ahi viene el SAT. Pasa al afore.");
//		}
	}//main
}//class
