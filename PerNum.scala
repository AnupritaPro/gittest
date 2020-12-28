/*Write a program to read a random  number and check that random number 
are perfect or not*/

object PerNum{
	def main (args : Array[String]){
	
	//var i,j;
	var sum=0;
	var r=scala.util.Random;
	
	for(j<-1 to 5){
		var num= r.nextInt(50);
		for(i<-1 to num-1){
		if(num%i==0){
			sum=sum +i;  
		}
	}
	
	if(sum == num)
	println(num+" is a Perfect Number");
	else 
	println(num+" is a not perfect number ");
	
	}
}
}

