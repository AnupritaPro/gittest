/*Que 5: Write a program to calculate sum of prime Numbers between 1 to 100*/


object PrimeNum{
 def main(args : Array [String]){
		var sum = 0;
	
	for(num <- 2 to 100){
		var count = 0;
		for(k <- 2 to num/2){
			
			if((num % k) == 0){
				
				count += 1
			}
		}
	
	if (count == 0 && num != 1)
		
		sum =sum + num
	
	}
 println("Sum of Prime Numbers is :"+ sum);
	
	}

}


/*
Output:

pi@raspberrypi:~ $ scala PrimeNum
Sum of Prime Numbers is :1060
*/
