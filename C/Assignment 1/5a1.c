//Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
void main(){
	int age = 24;
	
	if(age >= 18){
		printf("eligible to vote");
	}else{
		printf("Not eligible to vote");
	}
}