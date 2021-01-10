/*Que 6: write a Program to read a integer  from user and conver it 
to binary and octal using user define function*/

import java.util._;

object ConverNum{
 def main(args : Array [String]){
	var sr=new Scanner(System.in);
	 println("enter the num");
	
	var n:Int = sr.nextInt();
	 println("Binary Numbers is :"+ Integer.toString(n,2));
	 println("Octal Numbers is :"+ Integer.toString(n,8));
}
}



/*

Output:

enter the num
54
Binary Numbers is :110110
Octal Numbers is :66

*/
