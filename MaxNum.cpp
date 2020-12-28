#include <iostream>
using namespace std;

int max( int num1 ,int num2);		//fuction declaration

int main(){

	int a=100,b=200,ret;		//local variable declaration

	ret= max(a,b);			//fuction calling

	cout<<"maximum number is: "<<ret<<endl;

	return 0;
}

int max(int num1,int num2){		//fuction defination

	if(num1<num2)

		return num2;
	else
		return num1;
}
