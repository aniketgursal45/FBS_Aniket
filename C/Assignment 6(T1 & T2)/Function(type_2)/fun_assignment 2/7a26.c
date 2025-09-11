#include<stdio.h>
int agech();//function declaration
void main(){
	int result= agech();//function call
	
	if(result==1)
		printf("Child");
	else if(result==2)
		printf("Teenager");
	else if(result==3)
		printf("Adult");
	else
		printf("Senior");
}
int agech(){//function defination
	int age;
	printf("Enter Your age:- ");
	scanf("%d",&age);
	
	if(age<12)
		return 1;
	else if( age <= 19)
		return 2;
	else if(age <= 59)
		return 3;
	else 
		return 4;
}