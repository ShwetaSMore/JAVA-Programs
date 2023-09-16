package com.ScannerClass;
import java.util.*;

import com.Methods.Student;

public class Main_Student 
{
	public static void main(String[] args) 
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter student name: ");
		String str = sobj.next();
		
		System.out.println("Enter marks for English: ");
		float eng = sobj.nextFloat();
		
		System.out.println("Enter marks for Marathi: ");
		float mar = sobj.nextFloat();
		
		System.out.println("Enter marks for Hindi: ");
		float hindi = sobj.nextFloat();
		
		System.out.println("Enter marks for Science: ");
		float sci = sobj.nextFloat();
		
		System.out.println("Enter marks for Maths: ");
		float maths = sobj.nextFloat();
		
		
		Student s1 = new Student();
		s1.percentage(str,eng,mar,hindi,sci,maths);
		
		
		
		/*Student s2 = new Student();
		s2.percentage("Suya", 57,99, 78, 46, 44);
		Student s3 = new Student();
		s3.percentage("Saku", 78, 66,98, 78, 89);
		*/
	}

}
