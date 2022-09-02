
public abstract class Doctor {
	
	String nombre;
	
	//Metodo para atender a un paciente
	public abstract void atenderPaciente();

}

class Pediatra extends Doctor {

	@Override
	public void atenderPaciente() {
		System.out.println("EL pediatra te regala una paletita.");
	}
	
}

class Cardiologo extends Doctor {

	@Override
	public void atenderPaciente() {
		System.out.println("El cardiologo nos coloca muchos cables en nuestro corazón.");
	}
	
}

class Nutriologa extends Doctor {

	@Override
	public void atenderPaciente() {
		System.out.println("La nutriologa nos regaña por tomar coca.");
	}
	
}

/*class TestDoctor{
	public static void main(String args[]) {
		
		//No podemos instanciar objetos de la clase abstracta
		// Doctor Felipe = new Doctor();
		
		Cardiologo Felipe = new Cardiologo();
		Felipe.atenderPaciente();
		
		Pediatra Fernanda = new Pediatra();
		Fernanda.atenderPaciente();
		
		Nutriologa Mariana = new Nutriologa();
		Mariana.atenderPaciente();
		
	}
}*/

