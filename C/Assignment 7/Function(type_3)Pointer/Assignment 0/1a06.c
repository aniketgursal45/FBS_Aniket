#include<stdio.h>
void sum(int*,int*,int*);//function declaration
void main(){
	int a=22,b=10,sum1;
	sum(&a,&b,&sum1);// function call
	printf("Addition of %d & %d is %d",a,b,sum1);
}
void sum(int* a,int* b,int* sum1){ // function defination
	*sum1 = *a+*b;
}