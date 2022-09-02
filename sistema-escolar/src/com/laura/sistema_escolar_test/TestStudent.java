package com.laura.sistema_escolar_test;

import com.laura.sistema_escolar.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student Lena = new Student("Lena","Hernandez",8, 7, 10, 9, 8);
		Lena.average();
		System.out.println("");
		Lena.sortGrades();
	}

}
