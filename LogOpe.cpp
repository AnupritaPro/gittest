
#include <iostream>
using namespace std;
int main(){

	int a=21,c=0;
	char b='t';
	if (a>0  &&  a%2==0)		//logical and 
	cout<<"Number is even natural number"<<endl;
	else 
	cout<<"Number is not even"<<endl;

	if(b == 'a'|| b == 'e' || b =='i' || b =='o' || b =='u') //Logical or  
	cout<<"vowel character"<<endl;
	else
	cout<<"constant "<<endl;

	if( c!=0 )				//Not equal
	cout<<"num is non zero"<<endl;
	else
	cout<<"num is zero"<<endl;
}

