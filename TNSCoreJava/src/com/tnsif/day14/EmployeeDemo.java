package com.tnsif.day14;

import java.util.*;
public class EmployeeDemo {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101,"Divyanka",80000));
		empList.add(new Employee(101,"Ritesh",80000));
		empList.add(new Employee(101,"Rama",80000));
		empList.add(new Employee(101,"Vinu",80000));
		empList.add(new Employee(101,"Sneha",80000));
		
		System.out.println("Employee Details : \n" + empList);
		System.out.println("-------------------------");
		System.out.println();
		
		
		Collections.sort(empList, new SortByEmployeeName());
		System.out.println("--------Employee Details in ascending order by name :--------------\n");
		System.out.println(empList);
		
		
		Collections.sort(empList, new SortBySalary());
		System.out.println();
		System.out.println("--------Employee Details in ascending order by salary :--------------\n");
		
		System.out.println(empList);

	}

}
