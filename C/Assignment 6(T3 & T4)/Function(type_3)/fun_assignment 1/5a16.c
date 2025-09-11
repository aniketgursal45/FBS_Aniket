#include<stdio.h>
void voteeligible(int);//function declaration
void main(){
	int age = 24;
	voteeligible(age);//function call

}
void voteeligible(int age){//function defination

	if(age >= 18){
		printf("eligible to vote");
	}else{
		printf("Not eligible to vote");
	}
}