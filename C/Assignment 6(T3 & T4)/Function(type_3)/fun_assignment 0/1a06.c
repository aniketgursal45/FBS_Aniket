#include<stdio.h>
void sum(int,int);//function declaration
void main(){
	int a,b;
	sum(22,10);// function call

}
void sum(int a,int b){ // function defination
	int sum;
	
	sum = a+b;
	
	printf("Addition of %d & %d is %d",a,b,sum);
}