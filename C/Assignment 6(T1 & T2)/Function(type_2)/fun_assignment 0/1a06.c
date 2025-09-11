#include<stdio.h>
int sum();//function declaration
void main(){
	printf("%d",sum());// function call

}
int sum(){ // function defination
	int a,b;
	
	a=127;
	b=101;
	return a+b;
}