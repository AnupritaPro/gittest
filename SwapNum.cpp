#include<iostream>
using namespace std;

//int Swap1(int a, int b);//fuction  declaration	

int main(){
	 int a1=12,b1=23;
	int c;

	cout <<"before swapping a :"<<a1<<endl;
	cout <<"before swapping b :"<<b1<<endl;
	
	swap(a1,b1);		//fuction call

	cout <<"after swapping a :"<<a1<<endl;
	cout <<"after swapping b :"<<b1<<endl;
return 0;
}

int swap(int a,int b){ 		//fuction defination

	int temp;
	
	temp=a;
	a=b;
	b=temp;

return temp;

}
