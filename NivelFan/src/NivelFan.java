import java.util.Scanner;

/*Ejercicio 1
 * Calcular el descuento de usuario segun nivel Fan club
 * Variables: Nivel fan, descuento
 * Niveles: 1- 5%, 2- 10%, 3- 20%, 4- 50%
 * Output: "Usted es Super Fan de nivel $nivel y su descuento es de $descuento"
*/


public class NivelFan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nivel de Fan para mostrar el desucento asignado:");
		int nivel = sc.nextInt();
		String nivelF;
		int desc;
		switch(nivel) {
		case 1:
			nivelF = "Basico";
			desc = 5;
			System.out.println("Usted es Fan de nivel "+nivelF+" y su descuento es de "+desc+"%.");
			break;
		case 2: 
			nivelF = "Intermedio";
			desc = 10;
			System.out.println("Usted es Fan de nivel "+nivelF+" y su descuento es de "+desc+"%.");
			break;
		case 3:
			nivelF = "Completo";
			desc = 20;
			System.out.println("Usted es Fan de nivel "+nivelF+" y su descuento es de "+desc+"%.");
			break;
		case 4:
			nivelF = "Pro";
			desc = 50;
			System.out.println("Usted es Fan de nivel "+nivelF+" y su descuento es de "+desc+"%.");
			break;
		default:
			System.out.println("No existe el nivel ingresado.");
		}
	}
}