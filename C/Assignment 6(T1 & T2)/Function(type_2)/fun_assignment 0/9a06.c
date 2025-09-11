#include<stdio.h>
int areatr();// function declaration
void main(){
	printf("area of triangle is %d",areatr());//function call
}
int areatr(){//function defination
	int base,height;
	base = 5;
	height = 10;
	return ( base * height) /2;
}