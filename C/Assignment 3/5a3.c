#include<stdio.h>
void main(){
	int n = 153,sum=0,rem,temp = n;
	
	while(n >0){
		rem = n % 10;
		sum = sum +(rem * rem * rem);
		n = n /10;
	}
	sum==temp?printf("Armstrong"):printf("Not Armstrong");
}