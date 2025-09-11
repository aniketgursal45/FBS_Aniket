#include<stdio.h>
void sqrcub();//function declaration
void main(){
	
	sqrcub();//function call
}
void sqrcub(){//function defination
	int num =10,square,cube;
	square = num * num;
	cube = num * num * num;
	
	printf("Square and cube of given number %d is %d %d",num,square,cube);
}