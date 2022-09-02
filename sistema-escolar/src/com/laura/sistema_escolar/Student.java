package com.laura.sistema_escolar;

public class Student {
	public String firstName;
	public String lastName;
	public double gra1;
	public double gra2;
	public double gra3;
	public double gra4;
	public double gra5;
	
	public Student(String firstName, String lastName, double gra1, double gra2, double gra3, double gra4, double gra5) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gra1 = gra1;
		this.gra2 = gra2;
		this.gra3 = gra3;
		this.gra4 = gra4;
		this.gra5 = gra5;
	}

	public void average() {
		double average = (this.gra1+this.gra2+this.gra3+this.gra4+this.gra5)/5;
		System.out.println("Alumno/a: "+this.firstName+" "+this.lastName+" Promedio: "+average);
	}
	
	public void sortGrades() {
		System.out.println("Alumno/a: "+this.firstName+" "+this.lastName);
		
		if (this.gra1 > this.gra2 && this.gra1 > this.gra3 && this.gra1 > this.gra4 && this.gra1 > this.gra5)
            System.out.println("La calificación mayor es: "+ this.gra1);
		if (this.gra2 > this.gra3 && this.gra2 > this.gra4 && this.gra2 > this.gra5)
            System.out.println("La calificación mayor es: "+ this.gra2);
		if (this.gra3 > this.gra1 && this.gra3 > this.gra2 && this.gra3 > this.gra4 && this.gra3 > this.gra5)
            System.out.println("La calificación mayor es: "+ this.gra3);
		if (this.gra4 > this.gra1 && this.gra4 > this.gra2 && this.gra4 > this.gra3 && this.gra4 > this.gra5)
            System.out.println("La calificación mayor es: "+ this.gra4);
		if (this.gra1 > this.gra2 && this.gra1 > this.gra3 && this.gra1 > this.gra4 && this.gra1 > this.gra5)
            System.out.println("La calificación mayor es: "+ this.gra5);

		if (this.gra1 < this.gra2 && this.gra1 < this.gra3 && this.gra1 < this.gra4 && this.gra1 < this.gra5)
            System.out.println("La calificación menor es: "+ this.gra1);
		if (this.gra2 < this.gra1 && this.gra2 < this.gra3 && this.gra2 < this.gra4 && this.gra2 < this.gra5)
            System.out.println("La calificación menor es: "+ this.gra2);
		if (this.gra3 < this.gra1 && this.gra3 < this.gra2 && this.gra3 < this.gra4 && this.gra3 < this.gra5)
            System.out.println("La calificación menor es: "+ this.gra3);
		if (this.gra4 < this.gra1 && this.gra4 < this.gra2 && this.gra4 < this.gra3 && this.gra4 < this.gra5)
            System.out.println("La calificación menor es: "+ this.gra4);
		if (this.gra1 < this.gra2 && this.gra1 < this.gra3 && this.gra1 < this.gra4 && this.gra1 < this.gra5)
            System.out.println("La calificación menor es: "+ this.gra5);
	}
}
