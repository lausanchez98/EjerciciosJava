package datos_publicos;

import datos_privados.Bigotes;

public class CollarBigotes {

	public static void main(String[] args) {
		Bigotes Bigotes = new Bigotes("Bigotes", 15, "cafe", 14, true, "Siames", true, "Moctezuma y Madero", 105, "Lomas de Santa Anita", "5512345678", 00100, "Leo", 12.34d);
		
		System.out.println(Bigotes);
		System.out.println();
		
		Bigotes.datosCollarBigotes();
		System.out.println();
		
		Bigotes.nombre = "Peluche";//Se reasigna el valor nombre del objeto
		System.out.println(Bigotes);
		
		//Errores
		//System.out.println();
		//Bigotes.peso = 5.24d; //no se puede reasignar pues es un dato privado
		//System.out.println(Bigotes.peso);// igual no puede obtener el dato de peso por la misma razón
		
		Bigotes.setPeso(3.45d);
		System.out.println(Bigotes.getPeso());
	}
}
