#include<stdio.h>
int divinum(int);
void main(){
	int num;
	printf("Enter a Number:- ");
	scanf("%d",&num);
	int result = divinum(num);//function call
	
	if(result==1)
		printf("divisible by 3 not by 5");
	else if(result==2)
		printf("divisible by 5 not by 3");
	else if(result==3)
		printf("divisible by 3 & 5");
	else
		printf("not divisible by both");

}
int divinum(int num){//function defination

	
	if(num % 3 == 0 && num % 5 != 0)
		return 1;
	else if(num % 3 != 0 && num % 5 ==0)
		return 2;
	else if(num % 3 == 0 && num % 5 ==0)
		return 3;
	else
		return 4;
}