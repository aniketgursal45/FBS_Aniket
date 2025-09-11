#include<stdio.h>
void agech();//function declaration
void main(){
	agech();//function call

}
void agech(){//function defination
	int age;
	printf("Enter Your age:- ");
	scanf("%d",&age);
	
	if(age<12){
		printf("Child");
	}else if( age <= 19){
		printf("Teenager");
	}else if(age <= 59){
		printf("Adult");
	}else {
		printf("Senior");
	}	
}