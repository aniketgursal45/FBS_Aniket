#include<stdio.h>
void main(){
	int input = 223410;
	int r1,r2,q;
	
	r2= input % 10;
	q = input/ 10;
	r1 = q % 10;
	int output = r1*10 + r2;
	printf("%d",output);
}