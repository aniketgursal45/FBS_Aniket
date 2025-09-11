#include<stdio.h>
int areatr(int ,int);// function declaration
void main(){
	int base,height;
	printf("area of triangle is %d",areatr(5,10));//function call
}
int areatr(int base,int height){//function defination
	return ( base * height) /2;
}