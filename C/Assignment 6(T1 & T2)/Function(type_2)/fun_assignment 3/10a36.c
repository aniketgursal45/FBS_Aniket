#include<stdio.h>
int firlas();
void main(){
	printf("%d",firlas());
	
}
int firlas(){
	int n=12345,first,last,sum;
	
	last = n % 10;
	
	first =n;
	while(first >= 10){
		
		first = first /10;
	}
	
	sum= first +last;
	return sum;
}