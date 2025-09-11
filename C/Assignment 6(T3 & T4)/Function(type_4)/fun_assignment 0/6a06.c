#include<stdio.h>
int sqr(int);//function declaration
int cub(int);//function declaration
void main(){
	int num =10;
	printf("Square of given number is %d\n",sqr(num));//function call
	printf("cube of given number is %d",cub(num));//function call
}
int sqr(int num){//function defination
	return num * num;
}
int cub(int num){
	return num * num * num;
}