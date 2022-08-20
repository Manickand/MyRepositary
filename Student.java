package org.student;

import org.department.Department;

public class Student extends Department {
	
	public String studentName(String str)
	{
		System.out.println("The name of the Student is: "+str);
		return str;
	}
	
	public String dept(String str)
	{
		System.out.println("The Department is: "+str);
		return str;
	}

	public int studentId(int num)
	{
		System.out.println("The ID of the student is: "+num);
		return num;
	}

}
