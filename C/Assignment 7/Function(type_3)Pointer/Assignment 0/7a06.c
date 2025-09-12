#include<stdio.h>
void  timehrmin(int*,int*);//function declaration
void main(){
	int hours=122/60 ,remainmin=122 % 60,givenmin=122;
	timehrmin(&hours,&remainmin);//function call
}
void timehrmin(int* hours,int* remainmin){//function defination
	printf("%d hours and remaining minutes %d.",*hours,*remainmin);
}