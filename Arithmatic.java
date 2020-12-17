class Arithmatic{
public static void main(String args[]){
	int a=24,b=2,c;

	c=a+b;					//for addition
	System.out.println("Addition of number:\t"+c);

	c=a-b;					//for subtraction
	System.out.println("Subtraction of number\t"+c);

	c=a*b;					//for multiplication
	System.out.println("Multiplication of number:\t"+c);

	c=a/b;					//for division
	System.out.println("Division of number:\t"+c);

	c=a%b;					//for module
	System.out.println("Mode of number:\t"+c);

	System.out.println("value of b="+b);
	b++;					//post increment
	System.out.println("increment of b="+b);
	b++;
	System.out.println("increment of b="+b);


	System.out.println("value of a="+a);
	a--;					//post decrement
	System.out.println("increment of a="+a);
	a--;
	System.out.println("increment of a="+a);



	System.out.println("value of b="+b);
	++b;					//pre increment
	System.out.println("increment of b="+b);
	++b;
	System.out.println("increment of b="+b);



	System.out.println("value of a="+a);
	--a;					//pre decrement
	System.out.println("increment of a="+a);
	--a;
	System.out.println("increment of a="+a);


	}
}

