package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Colecciones {

	public static void main(String[] args) {
		/*
		 * Estructuras de datos
		 * 
		 * 
		 * Son un sistema mediante el cual se organizan los datos en la memoria de
		 * nuestra aplicacion que estamos desarrollando. Tenemos muchas formas de
		 * organizar esta informacion, como:
		 * 
		 * 
		 * - Arrays (datos primitivos)
		 * 
		 * - Colecciones (clases) - Listas (list) - Conjuntos (Set/HashSet) - Mapas
		 * (Map/HashMap)
		 * 
		 * //Sintaxis de nuestros arreglos en JAVA
	
	//TipoDato [] nombreDelArreglo = {"elemento 1", "elemento 2", "elemento n};

		 */ 
		//Ejemplo de arreglo de cadena 
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo" };
		//Ejemplo de arreglo de enteros
		int[] numeros = { 1, 5, 8 };
		//Iteracion de arreglo
		for (String recorrido : meses) {
			System.out.println(recorrido);
		}
		
		//Matriz (arreglo de arreglos)
		int matriz [][] = {
				{1, 2, 3, 4, 5},//0
				{6, 7, 8, 9, 10},//1
				{11, 12, 13, 14, 15}//2
		};
		
		System.out.println(matriz[1][3]);
		
		 /* 
		 * Los arreglos normales son para un solo tipo de dato, ordenados por indice y
		 * tienen un tamanio definido.
		 * 
		 * Cosas que podemos hacer con arreglos normales:
		 * - Crearlos
		 * - Recorrerlos
		 * - Saber su tamanio
		 * - Encontrar elementos por su indice
		 * - Hacer copias
		 *
		*/

		System.out.println(meses.length);
		System.out.println(numeros.length);

		/*
		 * Colecciones
		 * 
		 * Listas (list):
		 * La interfaz List define una sucesion de elementos. A diferencia de la interfaz Set, esta si admite elementos duplicados. Podemos hacer distintas cosas con las listas como:
		 * 
		 * - Manipular elementos en funcion de su posicion dentro de esta lista
		 * - Buscar elementos concretos en la lista y devolver su posicion
		 * - Iterar o hacer ciclos sobre esos elementos
		 * - Realizar operaciones sobre rangos de elementos de la misma lista
		 * 
		 * ArrayList:
		 * Implementacion mas utilizada dentro de la coleccion List. Se basa en un array redimensionable, esto es que va aumentando de tamanio dependiendo de la situacion. Es el que mayor rendimiento tiene dentro de las listas (linkedlist).
		 * 
		 * Caracteristicas del ArrayList: 
		 *	- Siempre va indexado
		 *	- Si le agregamos un elemento, solo se agrega al final
		 *	- Podemos almacenar elementos repetidos
		 *	- Tienen un orden conforme los vamos agregando
		 * 
		*/
		
		//Sintaxis basica de un ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		
		//Agregar datos a ArrayList con .add
		
		cars.add("Honda");
		cars.add("Nissan");
		cars.add("Audi");

		System.out.println(cars);
		
		//Metodo para modificar items con .set
		cars.set(0, "Mustang");
		System.out.println(cars);
		
		//Metodo para quitar o remover items con .remove
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		cars.clear();
		System.out.println(cars);
		
		/////////////////////////
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingesa tu comida favorita:");
		String comidaIngresada = sc.nextLine();
		
		ArrayList<String> comidaFav = new ArrayList<String>();
		
		comidaFav.add(comidaIngresada);
		System.out.println("Tu comida favorita es: " + comidaFav);

		/*
		 * Set (conjuntos)
		 * Define una coleccion que no puede tener elementos duplicados. Dentro de esta interfaz existen distintas implementaciones, una de ellas es HashSet. Sirve para almacenar datos en una tabla hash. Es la implementacion que mejor rendimiento de todas da, pero no garantiza el orden al momento de hacer iteraciones. Debemos definir el tamanio inicial de la tabla porque el tamanio marcara el rendimiento de esta implementacion.
		 * 
		*/
		
		/*
		 * Map (mapa)
		 * La interfaz Map asocia claves a valores, y no puede contener claves duplicadas, y cada una de esas claves solo puede tener asociado un valor como maximo. Dentro de los map, existe la implementacion llamada HashMap, la cual almacena las claves en una tabla hash. Es la implementacion que mejor rendimiento tiene de todas, y es imporante definir el tamanio inicial de la tabla ya que este tamanio define el rendimiento de la implementacion.
		 * 
		*/
		
		//ArrayList
		System.out.println("ARRAYLIST");
		ArrayList<String> participantes = new ArrayList<String>(); 
		participantes.add("Felipe");
		participantes.add("Jaciel");
		participantes.add("Edwin");
		participantes.add("Gabriel");
		participantes.add("Fernando");
		participantes.add("Fernando");
		System.out.println(participantes);			
					
		//HashSet 
		//Metodo para comprobar si existe un elemento o no
		System.out.println("HASHSET");
		HashSet<String> participantes2 = new HashSet<String>();
		participantes2.add("Felipe");
		participantes2.add("Jaciel");
		participantes2.add("Edwin");
		participantes2.add("Gabriel");
		participantes2.add("Fernando");
		System.out.println(participantes2);
		System.out.println(participantes2.contains("Edwin"));
		System.out.println(participantes2.contains("Laura"));
					
		//HashMap
		System.out.println("HASHMAP");
		HashMap<String, Integer> calificaciones1 = new HashMap<String, Integer>();
		//Metodo put para agregar informacion
		calificaciones1.put("Felipe", 5);
		calificaciones1.put("Jaciel", 10);
		calificaciones1.put("Edwin", 10);
		calificaciones1.put("Gabriel", 9);
		calificaciones1.put("Fernando1", 9);
		calificaciones1.put("Fernando2", 7);
		calificaciones1.put("Fernando3", 0);
		System.out.println(calificaciones1);
	}
}