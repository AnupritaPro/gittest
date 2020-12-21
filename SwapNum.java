class SwapNum{
public static void main(String args[]){
	SwapNum s1=new SwapNum();
	s1.swap(2,4);
}
public void swap(int a,int b){

	int temp; 
	System.out.println("before swapping a:"+a+"\tb:"+b);
	temp=a;
	a=b;
	b=temp;

	System.out.println("after swaping a:"+a+"\tb:"+b);
}
}
