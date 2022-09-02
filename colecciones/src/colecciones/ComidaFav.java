package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

//Crear un menu donde se le pregunte al usuario su comida favorita
//1. Pedir/Ingresar comida favorita .add
//2. Preguntar si quiere agregar mas comidas favoritas
//3. Dar opcion de modificar alguna comida .set
//4. Dar opcion de borrar cualquier comida que haya ingresado .remove

public class ComidaFav {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> comidasFav = new ArrayList<String>();
		System.out.println("Menu\n Eliga una opcion: \n 1.Ingresar comida\n 2. Modificar comidas favoritas\n 3. Borrar alguna comida de la lista");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Ingresa tu comida favorita:");
			String comidaIngresada = sc.nextLine();
			comidasFav.add(comidaIngresada);
			System.out.println(comidasFav);
			break;
		case 2:
			System.out.println(comidasFav);
			break;
		case 3:
			System.out.println(comidasFav);
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
	}
}