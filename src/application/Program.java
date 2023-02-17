package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Students> students = new HashSet<>();
		int repeat = 3, studentAmount = 0;
		
		for (int i = 0; i < repeat; i++) {
			System.out.printf("How many students for course %s? ", chooseCourse(i));
			int studentsNumber = sc.nextInt();
			for (int j = 0; j < studentsNumber; j++) {
				students.add(new Students(sc.nextLong()));
			}
		}
		
		for (Students student : students) {
			studentAmount += 1;
		}
		
		System.out.println("Total students: " + studentAmount);
	}
	
	private static char chooseCourse(int indice) {
		char letter = ' ';

		switch (indice) {
		case 0:
			return letter = 'A';
		case 1:
			return letter = 'B';
		case 2:
			return letter = 'C';
		}
		return letter;
	}
}
