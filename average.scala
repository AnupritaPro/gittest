/*write the program to calculate average of all number between   n1 and n2 
(eg.100 to 200 read the values of n1 and n2  from user )*/


object average{
 def main(args : Array [String]){

	var sum=0.0;
	var avg=0.0;
	
	
	println("Enter the 1st number ");
	var n1= scala.io.StdIn.readInt();

	println("Enter the 2nd number ");
        var n2= scala.io.StdIn.readInt();

	for(i<-n1 to n2){

		sum=sum+i;

		}
	avg=(sum/200);
	println("sum of 100 and 200 is "+sum+"and average"+avg);
}
}


/*
output:

Enter the 1st number 
100
Enter the 2nd number 
200
sum of 100 and 200 is 15150.0and average75.75
*/
