package com.tnsif.day15;

//import java.util.*;
import java.util.Comparator;
import java.util.TreeSet;
import com.tnsif.day14.Employee;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> courseSet = new TreeSet<String>();
		
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("React");
		courseSet.add("Angular");
		System.out.println(courseSet);
		
//		(TreeSet) -> It gives automatically sorted order of List
		System.out.println("First Course : " + courseSet.first());
		System.out.println("Last Course : " + courseSet.last());  
		
//		Removes course " C " it it is present
		courseSet.remove("C");
		System.out.println(courseSet);
		
//		remove first element
		courseSet.pollFirst();
		System.out.println(courseSet);
		
//		remove last element
		courseSet.pollLast();
		System.out.println(courseSet);
		
//		courseSet.add(null); //(java.lang.NullPointerException) this exception occurs
		System.out.println("--------------------------------");
		
		
//		Comparator is a functional interface
//		Sort in Ascending Order by empId
//		Comparator<Employee> comp = (e1, e2)->e1.getEmpId()-e2.getEmpId();
		
//		Sort in Ascending Order by empSalary	
		Comparator<Employee> comp = (e1, e2)-> (int) (e1.getSalary()-e2.getSalary());
		
		TreeSet<Employee> empSet = new TreeSet<Employee>(comp);
		
		empSet.add(new Employee(101,"Divyanka", 88000));
		empSet.add(new Employee(103,"Ritesh", 89000));
		empSet.add(new Employee(109,"Siddhika", 75000));
		empSet.add(new Employee(107,"Sneha", 78000));
		empSet.add(new Employee(104,"Pradyum", 92000));
		
//		System.out.println("Employee Details (Sorted By Employee Id): \n" + empSet);
		
		System.out.println("Employee Details (Sorted By Employee Salary): \n" + empSet);

	}
}
