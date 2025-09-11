#include<stdio.h>
int sum(int,int);//function declaration
void main(){
	int a=127,b=101;
	printf("%d",sum(a,b));// function call
}
int sum(int a ,int b){ // function defination

	return a+b;
}
