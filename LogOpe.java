//Logical Operator
class LogOpe{
public static void main(String arg[]){
	
	int a=21,c=0;
	char b='t';
	if (a>0  &&  a%2==0) //Logical  and Operator
	System.out.println("Number is even natural number");
	else 
	System.out.println("Number is not even");

	if(b == 'a'|| b == 'e' || b =='i' || b =='o' || b =='u')   //Logical or operator
	System.out.println("vowel character");
	else
	System.out.println("constant ");

	if( c!=0 )				//not equal
	System.out.println("num is non zero");
	else
	System.out.println("num is zero");
}
}
