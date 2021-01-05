
//Bitwise Operator
#include<iostream>
using namespace std;
int main(){
	int a=60, b=13,c=0;

	c=a&b;		
	cout<<"line 1 value:\t"<<c<<endl;

	 c=a|b;		
        cout<<"line 2 value:\t"<<c<<endl;

	 c=a^b;
        cout<<"line 3 value:\t"<<c<<endl;

	 c=~a;
        cout<<"line 4 value:\t"<<c<<endl;

	 c=a<<2;
        cout<<"line 5 value:\t"<<c<<endl;

	 c=a>>2;
        cout<<"line 6 value:\t"<<c<<endl;
}
