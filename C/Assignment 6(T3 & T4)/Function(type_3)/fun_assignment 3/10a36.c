#include<stdio.h>
void firlas(int,int,int,int);
void main(){
	int n=12345,first,last,sum;
	last = n % 10;
	first =n;
	firlas(n,first,last,sum);
	
}
void firlas(int n,int first,int last,int sum){
	
	while(first >= 10){
		
		first = first /10;
	}
	
	sum= first +last;
	printf("%d",sum);
}