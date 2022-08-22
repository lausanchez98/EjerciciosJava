public class OperadoresDatosVariables {
	public static void main(String[] args) {
		// Todo lo que se ejecute, se pone dentro de main
		/* Tipos de datos
		 * 
		 * - Grupo de datos primitivos
		 * 	-byte: 1 byte -128 al 127
		 * 	-short: 2 bytes (-32768 al 32767)
		 * 	-int: 4 bytes (-2,147,483,648 al 2,147,483,647)
		 * 	-long: 8 bytes (-9,223,372,036,854,775,808 al 9,223,372,036,854,775,807)
		 * 	-float: 4 bytes, almacena numeros fraccionarios, 6 o 7 digitos decimales.
		 * 	-double: 8 bytes, almacena numeros fraccionarios, 15 digitos decimales.
		 * 	-boolean: 1 bit, almacena datos true o false
		 * 	-char: 2 bytes, almacena caracteras o letras en formato ASCII
		 * 
		 * - Grupo de datos no primitivos
		 * 
		*/
		//Numeros
		byte edadHumano = 17 ;
		short edadTortuga = 150;
		int edadTierra = 4543000;
		long edadUniverso = 456777802048L;
		float pi = 3.1416f;
		double piGrande = 3.14159265359d;
		//Booleanos
		boolean estudiamosJava = true;
		boolean quieroHacerExamen = false;
		//Caracteres
		char inicialNomre = 'L';
		byte edad = 1;
		char edad2 = '1';
		//Variables en Java
		/*
		 * Las variables son contenedores que nos permiten almacenar valores de datos o informacion (vaso de agua, vaso de leche, vaso de refresco, etc)
		 * 
		 * - String: almacena texto en forma de cadena, y se usan las comillas dobles
		 * - int: almacena datos enteros
		 * - float: almacena datos tipo coma flotante
		 * - char: almacena caracteres individuales como A, 1 y se usan las comillas simples
		 * - booleanos: almacenan valores con dos estados: true o false
		 * 
		*/
		String nombre = "Martin";
		int numeroDomicilio = 9;
		float estatura = 1.73f;
		char grupo = 'A';
		boolean descanso = false;
		//Declaración vs Inicialización
		String declaracion;
		declaracion = "si";	
		final int anios;
		anios = 70;
		//println imprime con salto de linea
		//print imprime todo de corrido
		System.out.println("Hola mundo");
		System.out.println("Nos vamos a descansito: " + descanso);
		System.out.println(anios);
		System.out.println(5+60);
		//Declarar multiples variables
		int x = 50;
		int y = 15;
		int z = 25;
		int a = 24, b = 55, c = 50;
		System.out.println(x + y + z);
		System.out.println(a + b + c);
		/*
		 * Conversion de tipos de datos en Java (casting o casteo)
		 * 
		 * Es cuando se asigna un valor de un tipo de datos primitivo a otro.
		 * 
		 * - Ampliacion: de un tipo pequeño a un tipo mas grande
		 * - Reduccion: de un tipo grande a un tipo mas pequeño, no todos los tipos se pueden reducir
		 * 
		 * double > float > long > int > char > short > byte
		 * 
		*/
		int pesitos = 60;
		double pesitosConCentavos = pesitos;
		double dolaresConCentavos = 35.89d;
		System.out.println(pesitos);
		System.out.println(pesitosConCentavos);
		System.out.println(pesitos + dolaresConCentavos);
		//Cuando se reduce un valor, es importante agregar (tipoDato) y la variable a castear
		double edadLaura = 24.8d;
		int edadLauraEntero = (int)edadLaura;
		System.out.println(edadLaura);
		System.out.println(edadLauraEntero);
		/*
		 * Operadores en Java
		 * 
		 *	- Operadores aritmeticos (+, -, *, /, %, ++, --)
		 *	- Operadores de asignacion (=, =+, -=)
		 *	- Operadores de comparacion (==, !=, >, <, >=,<=)
		 *	- Operadores logicos (&&, ||, !)
		 *  - Operadores bit a bit 
		 * 
		*/
		int num1 = 5;
		int num2 = 13;
		//Operadores aritmeticos
		int suma = num1 + num2;
		int resta = num2 - num1;
		int multi = num1 * num2;
		float div = num1 / num2;
		float mod = num1 % num2;
		int incre = ++ num1;
		int decre = -- num2;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multi);
		System.out.println(div);
		System.out.println(mod);
		System.out.println(incre);
		System.out.println(decre);
		//Operadores de asignacion
		int dinero = 4;
		dinero += 3;
		dinero = dinero +3;
		dinero -= 5;
		dinero *= 8;
		dinero /= 4;
		dinero %= 3;
		System.out.println(dinero);
		//Operadores bit a bit
		dinero &= 5;
		dinero |= 5;
		dinero >>= 3;
		//Ejemplo con reasignacion usando ++
		int ahorro = 10;
		int domingo = ++ahorro; //11
		//ahorro = ahorro + 1
		System.out.println("Mi primer ahorro es: " + ahorro);
		//Ejemplo usando operador suma (+)
		int ahorro2 = 10;
		int domingo2 = 1 + ahorro2; //		
		System.out.println("Mi segundo ahorro es: "+ ahorro2);
		//Operadores de comparacion
		/*
		 * En JS,se usa un operador llamado "estrictamente igual" (===).
		 * Este permite evaluar el tipo de dato y el valor, los cuales deben coincidir 
		 * 
		*/
		int num3 = 5;
		int num4 = 6;
		boolean igual = num3 == num4; //false
		boolean noIgual = num3 != num4; //true
		boolean mayorQue = num3 > num4; //false
		boolean menorQue = num3 < num4; //true
		boolean mayorIgualQue = num3 >= num4; //false
		boolean menorIgualQue = num3 <= num4; //true
		System.out.println(igual);
		System.out.println(noIgual);
		System.out.println(mayorQue);
		System.out.println(menorQue);
		System.out.println(mayorIgualQue);
		System.out.println(menorIgualQue);
		//Operadores logicos
		//&& devolver un true si se resuelven las dos condiciones
		//|| devolver un true si una de las condiciones se cumple
		//! not invierte el resultado
		int num5 = 7;
		int num6 = 7;
		int num7 = 8;
		//AND &&
		boolean opAnd = num5 >= num6 && num6 <= num7; 
		System.out.println(opAnd);
		//OR ||
		boolean opOr = num5 >= num6 && num6 <= num7; 
		System.out.println(opOr);
		//NOT !
		boolean opNot = !(num5 > num6 || num6 >= num7);
		System.out.println(opNot);
	}//main
}//class