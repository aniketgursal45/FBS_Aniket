#include<stdio.h>
void sqrcub(int,int,int);//function declaration
void main(){
	int num =10,square,cube;
	sqrcub(10,square,cube);//function call
}
void sqrcub(int num,int square,int cube){//function defination
	square = num * num;
	cube = num * num * num;
	
	printf("Square and cube of given number %d is %d %d",num,square,cube);
}