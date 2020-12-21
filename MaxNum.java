class MaxNum{
public  static void main(String args[]){

	MaxNum m=new MaxNum();
	m.max(20,30);
}
public void max(int a, int b)
{

	if (a<b)
		System.out.println("b is greater than a:"+b);
	else 
		System.out.println("a is greater than b:"+a);

}
}
