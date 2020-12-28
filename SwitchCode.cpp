#include <iostream>
using namespace std;
int main(){
	int a=11,b=20,c=0 ,opt=3;

	switch (opt)
	{
	case 1 : 
		c=a+b;
		cout<<"Addition:\t"<<c<<endl;	//Arithmatic
		break;
	case 2 : 
		if(a<b)
		cout<<"value of a is less than b"<<endl;
		else
		cout<<"value of is a is greater than b"<<endl;
		break;
	case 3 : 
		if (a%2==0)
		cout<<"a is even number"<<endl;
		else 
		cout<<"a is odd number"<<endl;
		break;
	default : 
		cout<<"invalid option"<<endl;
		break;
	}
	cout<<"result is:"<<c<<endl;
	
return 0;
} 


