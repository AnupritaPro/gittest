//Que:Write a program to calculate factorial Program


object fact{

	def main(args:Array [String ]){

	var f=1;
	println("Enter the number ");
	var n=scala.io.StdIn.readInt();


	for(i<-1 to n){
		f=f*i;
		}

	println("Factorial of"+ n+"\tis "+f);
}

}



/*
Output:

Enter the number 
3
Factorial of3	is 6
ubuntu@itsme:~/Desktop/scala$ scala fact
Enter the number 
4
Factorial of4	is 24
*/
