#include<stdio.h>
void temper();//function declaration
void main(){
	temper();//function call
}
void temper(){
	double f,c;
	c=50;
	f = (c *9/5)+32;
	printf("%Lf",f);
}