#include<stdio.h>
void agech(int);//function declaration
void main(){
	int age;
	printf("Enter Your age:- ");
	scanf("%d",&age);
	
	agech(age);//function call

}
void agech(int age){//function defination

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