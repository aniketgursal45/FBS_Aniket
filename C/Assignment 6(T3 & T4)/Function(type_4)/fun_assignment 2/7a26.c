#include<stdio.h>
int agech(int);//function declaration
void main(){
	int age;
	printf("Enter Your age:- ");
	scanf("%d",&age);
	int result= agech(age);//function call
	
	if(result==1)
		printf("Child");
	else if(result==2)
		printf("Teenager");
	else if(result==3)
		printf("Adult");
	else
		printf("Senior");
}
int agech(int age){//function defination

	
	if(age<12)
		return 1;
	else if( age <= 19)
		return 2;
	else if(age <= 59)
		return 3;
	else 
		return 4;
}