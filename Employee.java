//Employee 

import java.io.*;
class Employee{
	public String enm;
	private double sal;
 
	public Employee(String name){          //constructor
  	enm=name;
	}
	
	public void setSalary(double empSal){    
	sal=empSal;
	}

	public void printEmp(){			//display
	System.out.println("name:\t"+enm);
	System.out.println("salary:\t"+sal);
	}

	public static void main(String args[]){
 	
	Employee e1=new Employee("Anu");	//first object creating 
	e1.setSalary(1000);
	e1.printEmp();
	
	Employee e2=new Employee("saritaa");	//2nd object creating
	e2.setSalary(100);
	e2.printEmp();

	}
}
 
