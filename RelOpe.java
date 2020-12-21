//Relational Operator

import java.io.*;
class RelOpe{
public static void main(String args[]){

	/*BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); throws IOException
	System.out.println("Enter the value of a and b");
	int a= Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());*/
	int a=20,b=30;
	
	if(a==b) 	//equal
	System.out.println("a is equal to b");
	
	else if(a<b)		//lessthan
	System.out.println("a is less than b");
	
	else if (a>b)		//greater than
	System.out.println("a is greater than b");
	
	 if  (a!=b)		//not equal to //same as <>operator
	System.out.println("a is not equal to b");
}
}
