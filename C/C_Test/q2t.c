#include<stdio.h>
void main(){
	int year =1900;
	
	if(year %400 ==0 ||(year %100 != 0 && year %4 ==0)){
		printf("%d is a Leap Year",year);
	}else{
		printf("%d is not a Leap year",year);
	}
}