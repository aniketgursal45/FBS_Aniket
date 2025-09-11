#include<stdio.h>
int armnotarm();
void main(){
	armnotarm()?printf("Armstrong"):printf("Not Armstrong");
}
int armnotarm(){
	int n = 153,sum=0,rem,temp = n;
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