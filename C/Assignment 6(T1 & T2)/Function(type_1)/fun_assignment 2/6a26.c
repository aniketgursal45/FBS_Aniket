#include<stdio.h>
void divinum();
void main(){
	divinum();//function call

}
void divinum(){//function defination
	int num;
	printf("Enter a Number:- ");
	scanf("%d",&num);
	
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