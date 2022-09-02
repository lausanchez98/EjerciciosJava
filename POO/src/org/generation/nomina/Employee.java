package org.generation.nomina;

public class Employee {
	//1. Propiedades
	
	public String firstName;
	public String lastName;
	public int age;
	public String rfc;
	public double salary;
	
	//2. Constructores

	/*
	 * En el constructor debemos tomar en cuenta lo siguiente:
	 * 1. Debe coincidir con el nombre de nuestra clase
	 * 2. Debe tener los parametros que declaremos anteriormente
	 * 
	 * */
	
	public Employee(String firstName, String lastName, int age, String rfc, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.rfc = rfc;
		this.salary = salary;
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(String firstName) {
		super();
		this.firstName = firstName;
	}
	
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//Estructura de un metodo o una funcion
	
	//Modificador de acceso + tipo de retorno + Nombre + Parametros

	
	//3. Metodos 
	
	//Calcular salario por mes
	//Imprimir el recibo de nomina
	
	//Calcular salario
	//Sintaxis del metodo (modificador de acceso + void + nombre del metodo + parametros)

	public void calculateSalary() {
		System.out.println("Tu salario por 21 dias es: "+this.salary*21);
	}
	
	public void calculateSalary(int days) {
		System.out.println("Tu salario por "+days+" es: "+this.salary*days);
	}
	
	public void calculateSalary(int days, int holidays) {
			holidays*=3;
			System.out.println("Tu salario por "+days+" dias y "+holidays+" festivos: "+((this.salary*holidays)+(this.salary*days)));
			
			
			
	}
	
	//Metodo para visualizar en forma de cadena la informacion del objeto y no su espacio
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", rfc=" + rfc
				+ ", salary=" + salary + "]";
	}
	
}

/*
 * 1. Crear dos clases: Employee y TestEmployee
 * 2. Clases y objetos:
 * 	- Tipos de datos
 * 	- Clases Wrapper
 * 3. Crear primer constructor
 * 4. Crear metodos para calcular salario
 * 5. Sobrecarga de metodos 
 * 6. Sobrecarga de constructores
 * 7. Crear paquetes (org.generation.nomina)
 * 8. Revisar errores
 * 
 */