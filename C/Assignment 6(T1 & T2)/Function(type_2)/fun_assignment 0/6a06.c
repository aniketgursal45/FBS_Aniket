#include<stdio.h>
int sqr();//function declaration
int cub();//function declaration
void main(){
	
	printf("Square of given number is %d\n",sqr());//function call
	printf("cube of given number is %d",cub());//function call
}
int sqr(){//function defination
	int num =10;
	return num * num;
}
int cub(){
	int num =10;
	return num * num * num;
}