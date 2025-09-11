#include<stdio.h>
void divinum(int);
void main(){
	int num;
	printf("Enter a Number:- ");
	scanf("%d",&num);
	divinum(num);//function call

}
void divinum(int num){//function defination

	
	if(num % 3 == 0 && num % 5 != 0){
		printf("divisible by 3 not by 5");
	}else if(num % 3 != 0 && num % 5 ==0){
		printf("divisible by 5 not by 3");
	}else if(num % 3 == 0 && num % 5 ==0){
		printf("divisible by 3 & 5");
	}else{
		printf("not divisible by both");
	}
}