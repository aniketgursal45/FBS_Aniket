#include<stdio.h>
void areatr(int,int,int);// function declaration
void main(){
	int triangle ,base=5,height=10;
	triangle = ( base * height) /2;
	areatr(triangle,base,height);//function call
}
void areatr(int triangle,int base,int height){//function defination

	
	printf("area of triangle is %d",triangle);
}