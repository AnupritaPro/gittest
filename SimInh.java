class Calculation {

	int a=10;
	int b=20;
	int c=0;
	void  addition(){
		c=a+b;
		System.out.println("Addition of number is :"+c);
		}
	void subtraction(){
		c=a-b;
		System.out.println("Subtraction of number is:"+c);
		}
	}
class SimInh extends Calculation{

	void multiplication(){
		c=a*b;
		System.out.println("multiplication of number is:"+c);
		}
	public static void  main(String args[]){
		SimInh s= new SimInh();
		s.addition ();
		s.subtraction();
		s.multiplication();
}
}
