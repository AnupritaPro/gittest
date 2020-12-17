//Bitwise operator

class BitOpe{
public static void main(String args[]){

	int a=60, b=13,c=0;       //a=111100 b=1101

	c=a&b;					//
	System.out.println("line 1 value:\t"+c);
	 
	c=a|b;
        System.out.println("line 2 value:\t"+c);   

	 c=a^b;
        System.out.println("line 3 value:\t"+c);   

	 c=~a;
        System.out.println("line 4 value:\t"+c);   
	 
	c=a<<2;
	System.out.println("line 5 value:\t"+c);   
        
	 c=a>>2;
       	System.out.println("line 6 value:\t"+c);   

	 c=a>>>2;
        System.out.println("line 5 value:\t"+c);   

}
}
