public class Bucles {
	public static void main(String[] args) {
		//While finito
//		int suma = 0;
//		while (suma <= 10) {
//			suma++;
//			System.out.println(suma);
//		}
		
		//Do while
//		int num = 0;
//		int suma = 0;
//		boolean disparador = true;
//		
//		do {
//			System.out.println(++suma);
//			disparador = false;
//		} while(disparador == true);

		//Do whle para hacer la suma de los primeros 10 numeros naturales
		//Sumar 1 + 1 = 2, 2 + 2 = 4, 4 + 3 = 7, 7 + 4 = 11 ... n + 10;

//		int num = 0;
//		int suma = 0;
//		
//		do {
//			suma = suma + num;
//			num++;
//			System.out.println(suma);
//		}while(num<=10);
		
		//For infinito
		
//		for(int i = 1; i >= 1; i++) {
//			System.out.println("Hoy no fio mañana si");
//		}

		//For imprimir los numeros del 1 al 100
		
//		for(int i = 1; i<=100; i++) {
//			System.out.println(i);
//		}
		
		//For suma de los primeros 10 numeros naturales
//		int suma = 0;
//		for(int i = 0; i<=10; i++) {
//			System.out.println(suma+=i);
//		}
		
//		Ejercicio 01 	
//		Escribir un programa que regrese el valor del factorial de un numero;
//		Factorial es: (n * n-1* n-2 * n-3) ... n >= 0;
		
		int num = 5;
		int fact = 1;
		for(int i = 1 ; i <= num; i++) {
			 fact *= i;
		}
		System.out.println("El factorial de "+num+" es "+fact);

//		Ejercicio 02
//		Si un numero es multiplo de 3 mostrar 'Fizz'
//		Si un numero es multiplo de 2 mostrar 'Buzz'
//		Si un numero es multiplo de 3 y 5 mostrar 'Fizz Buzz'

		for(int i = 1; i <=50; i++) {
            if(i % 15 == 0) {
                System.out.println("Fizz Buzz " + i);
            }
            if(i % 3 == 0) {
                System.out.println("Fizz " + i);
            }
            if(i % 2 == 0) {
                System.out.println("Buzz " + i);
            }
        }
		
		//Ejercicio 03 Serie de Fibonacci
		
		//Variables globales
		int cont = 1;
		int a = 0;
		int c = 0;
		int b = 1;
		
		while(cont <= 13) {
			a = b;
			b = c;
			c = a + b;
			cont++;
			System.out.println(c);
		}
	}
}