#include<stdio.h>
void swapi();//function declaration
void main(){
	swapi();//function call
}
void swapi(){//function defination
	int a,b,c;
	a = 22;
	b = 10;
	c= a;
	a=b;
	b=c;
	printf("a= %d b=%d",a,b);
	}