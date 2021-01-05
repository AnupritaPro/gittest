//Arithmatic Operator

#include<iostream>
using namespace std;
int main(){
	int a=24,b=2,c;        
	c=a+b;                 //Adding
	cout<<"Addition of number is:"<<c<<endl;
	
	c=a-b;			//Subtracting
	cout<<"subtraction of number is:"<<c<<endl;

	c=a*b;			//Multiplication
	cout<<"multiplication of number is "<<c<<endl;

	c=a/b;			//Division
	cout<<"Division of number "<<c<<endl;

	c=a%b;			//Module
	cout<<"module of number is "<<c<<endl;
	
	cout<<"value of a is:"<<a<<endl;
	a++;
 	cout<<"value of a is"<<a<<endl;   //pre increment
	a++;
	cout<<"value of a is"<<a<<endl;


	a--;
	cout<<"value of a is"<<a<<endl;		//pre decrement
	a--;
	cout<<"value of a is "<<a<<endl;

}
