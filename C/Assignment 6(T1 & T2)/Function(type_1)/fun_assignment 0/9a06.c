#include<stdio.h>
void areatr();// function declaration
void main(){
	areatr();//function call
}
void areatr(){//function defination
		int triangle ,base,height;
	base = 5;
	height = 10;
	triangle = ( base * height) /2;
	
	printf("area of triangle is %d",triangle);
}