import org.generation.nomina.Employee; //Si se deja el *, se tendra acceso a todos los elementos. En este caso, la unica clase que importa es la clase Employee.
import org.generation.nomina.Supervisor;


public class TestEmployee {

	public static void main(String[] args) {
		//Constructor por defecto
		//Es importante mantener el orden de los parametros al momento de construir a nuestro empleado
		Employee Felipe = new Employee("Felipe", "Maqueda", 30, "MAGF920416XXX", 350.65);
		Employee Angel = new Employee("Angel", "Martinez", 24, "XXXXXXXXXXXXX", 1024.50);
		Employee Karlos = new Employee("Karlos", "Torres", 3567.57);
		
		System.out.println(Felipe);
		System.out.println(Angel);
		System.out.println();
		System.out.println("Salario de Felipe");
		Felipe.calculateSalary();
		Felipe.calculateSalary(13);
		Felipe.calculateSalary(10,2);
		System.out.println();
		System.out.println("Salario de Angel");
		Angel.calculateSalary();
		Angel.calculateSalary(8);
		Angel.calculateSalary(13,2);
		
		Employee Zabdiel = new Employee("Zabdiel", "Díaz", 23, "ZABD123456XXX", 11150.65);
		
		Supervisor Alonso = new Supervisor("Alonso", "Grajeda", 289, "ALGR123456XXX", 15000.32, "Mentoria", 500);
		
		System.out.println(Zabdiel);
		System.out.println(Alonso);
		
	}//main
	
}//class
