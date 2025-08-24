#include<stdio.h>
void main(){
	int n = 5,fact=1,temp = n;
	
	while(n >0){
		fact = fact *n;
		n--;
	}
	printf("factorial of %d is %d",temp,fact);
}