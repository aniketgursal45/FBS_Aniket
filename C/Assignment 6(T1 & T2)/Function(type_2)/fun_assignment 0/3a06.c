#include<stdio.h>
double temper();//function declaration
void main(){
	printf("%Lf",temper());//function call
}
double temper(){
	double c=50;
	return (c *9/5)+32;
}