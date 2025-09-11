#include<stdio.h>
void voteeligible();//function declaration
void main(){
	
	voteeligible();//function call

}
void voteeligible(){//function defination
	int age = 24;
	
	if(age >= 18){
		printf("eligible to vote");
	}else{
		printf("Not eligible to vote");
	}
}