#include<stdio.h>
void temper(double*);//function declaration
void main(){
	double f,c=50;
	f = (c *9/5)+32;
	temper(&f);//function call
}
void temper(double* f){
	
	printf("%Lf",*f);
}