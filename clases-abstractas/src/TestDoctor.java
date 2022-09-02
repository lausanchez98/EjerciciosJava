
public class TestDoctor {

	public static void main(String[] args) {
		//No podemos instanciar objetos de la clase abstracta
				// Doctor Felipe = new Doctor();
				
				Cardiologo Felipe = new Cardiologo();
				Felipe.atenderPaciente();
				
				Pediatra Fernanda = new Pediatra();
				Fernanda.atenderPaciente();
				
				Nutriologa Mariana = new Nutriologa();
				Mariana.atenderPaciente();
	}

}
