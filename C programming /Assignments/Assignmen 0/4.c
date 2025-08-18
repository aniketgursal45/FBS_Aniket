#include<stdio.h>
int main(){
	int a,b,c;
	a = 22;
	b = 10;
	c= a;
	a=b;
	b=c;
	printf("%d %d",a,b);
	return 0;
}