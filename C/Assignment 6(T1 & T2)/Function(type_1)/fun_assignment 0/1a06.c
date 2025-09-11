#include<stdio.h>
void sum();//function declaration
void main(){
	sum();// function call

}
void sum(){ // function defination
	int a,b,sum;
	
	a=22;
	b=10;
	sum = a+b;
	
	printf("Addition of %d & %d is %d",a,b,sum);
}