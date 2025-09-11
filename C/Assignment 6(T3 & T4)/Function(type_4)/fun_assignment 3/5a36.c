#include<stdio.h>
int armnotarm(int,int,int,int);
void main(){
	int n = 153,sum=0,rem,temp = n;
	armnotarm(n,sum,rem,temp)?printf("Armstrong"):printf("Not Armstrong");
}
int armnotarm(int n,int sum,int rem,int temp){
	
	while(n >0){
		rem = n % 10;
		sum = sum +(rem * rem * rem);
		n = n /10;
	}
	if(sum==temp)
		 return 1;
	else
		return 0;
}