#include<stdio.h>
double temper(double);//function declaration
void main(){
	double c=50;
	printf("%Lf",temper(c));//function call
}
double temper(double c){
	
	return (c *9/5)+32;
}