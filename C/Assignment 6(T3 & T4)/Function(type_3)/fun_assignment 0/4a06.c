#include<stdio.h>
void swapi(int,int,int);//function declaration
void main(){
	int a,b,c;
	swapi(10,22,c);//function call
}
void swapi(int a,int b,int c){//function defination
	c= a;
	a=b;
	b=c;
	printf("a= %d b=%d",a,b);
	}