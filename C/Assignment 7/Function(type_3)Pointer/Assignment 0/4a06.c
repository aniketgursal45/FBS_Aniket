#include<stdio.h>
void swapi(int*,int*,int*);//function declaration
void main(){
	int a=10,b=22,c;
	printf("a= %d b=%d \n",a,b);
	swapi(&a,&b,&c);//function call
	printf("a= %d b=%d",a,b);
}
void swapi(int* a,int* b,int* c){//function defination
	*c= *a;
	*a=*b;
	*b=*c;
	}