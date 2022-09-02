import java.util.Scanner;

/* Ejercicio 02
 * 
 * Calcular la mensualidad de el usuario segun su nivel y cupon de descuento
 * int cupon = 10;
 * Variables: Nivel, Mensualidad, Cupon
 * Niveles: Basico, Intermedio, Completo, Pro
 * Output: "Suscripcion $suscripcion de: $mensaulidad aplicando cupon de promocion"
 * 
 * Monto: Basico = $100, Intermedio = 120, Completo = 170, Pro = 250;
 * 
 * Mensualidad: monto - (monto * cupon);
 * resultado = monto - (monto * %);
 * 
 * 100 * .10 = 10% = 
*/

public class DescuentoFan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nivel de Fan para mostrar la mensualidad:");
		int nivel = sc.nextInt();
		
		final double cupon = 0.1D;
		String nivelF;
		int monto;
		double mensualidad;
		
		switch(nivel) {
		case 1:
			nivelF = "Basico";
			monto = 100;
			mensualidad = (monto - (monto*cupon));
			System.out.println("Suscripcion "+nivelF+" de: $"+mensualidad+" aplicando cupon de promocion");
			break;
		case 2: 
			nivelF = "Intermedio";
			monto = 120;
			mensualidad = monto - (monto*cupon);
			System.out.println("Suscripcion "+nivelF+" de: $"+mensualidad+" aplicando cupon de promocion");
			break;
		case 3:
			nivelF = "Completo";
			monto = 170;
			mensualidad = monto - (monto*cupon);
			System.out.println("Suscripcion "+nivelF+" de: $"+mensualidad+" aplicando cupon de promocion");
			break;
		case 4:
			nivelF = "Pro";
			monto = 250;
			mensualidad = monto - (monto*cupon);
			System.out.println("Suscripcion "+nivelF+" de: $"+mensualidad+" aplicando cupon de promocion");
			break;
		default:
			System.out.println("No existe el nivel ingresado.");
		}
	}
}
