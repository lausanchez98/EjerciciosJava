package org.generation.nomina;

public class Supervisor extends Employee {
	
	/*
	 * 1. Atributos
	 * 2. Constructores
	 * 3. Metodos
	 * 4. toString()
	 * 5. Getters y Setters
	 * 
	*/
	
	private String departamento;
	private double bono;

	public Supervisor(String firstName, String lastName, int age, String rfc, double salary, String departamento,
			double bono) {
		super(firstName, lastName, age, rfc, salary);
		this.departamento = departamento;
		this.bono = bono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public String toString() {
		return "Supervisor [departamento=" + departamento + ", bono=" + bono + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", rfc=" + rfc + ", salary=" + salary + "]";
	}
	
}
