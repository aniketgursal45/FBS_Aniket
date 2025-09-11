#include<stdio.h>
int firlas(int,int,int,int);
void main(){
	int n=12345,first,last,sum;
	printf("%d",firlas(n,first,last,sum));
	
}
int firlas(int n,int first,int last,int sum){
	
	last = n % 10;
	
	first =n;
	while(first >= 10){
		
		first = first /10;
	}
	
	sum= first +last;
	return sum;
}