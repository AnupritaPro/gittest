class SwitchCode{
	public static void main(String args[]){
	int a=11,b=20,c=0 ,opt=3;

	switch (opt)
	{
	case 1 : c=a+b;
		System.out.println("Addition:\t"+c);	//Arithmatic
		break;
	case 2 : if(a<b)
		System.out.println("value of a is less than b");
		elsed
		System.out.println("value of is a is greater than b");
		break;
	case 3 : if (a%2==0)
		System.out.println("a is even number");
		break;
	default : System.out.println("invalid option");
		break;
	}
	System.out.println("result is:"+c);
} 
}
