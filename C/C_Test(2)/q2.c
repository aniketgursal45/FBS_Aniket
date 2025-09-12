#include<stdio.h>
void main(){
	int num;
	printf("enter a number:- ");
	scanf("%d",&num);
	
	if(num==0)
		printf("Neutral");
	else if(num>0)
		printf("positive");
	else
		printf("Negative");
}