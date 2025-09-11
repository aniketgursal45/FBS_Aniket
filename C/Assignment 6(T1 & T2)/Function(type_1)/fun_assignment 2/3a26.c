#include<stdio.h>
void greaterthan();//function declaration
void main(){
	
	greaterthan();//function call

}
void greaterthan(){//function defination
	int num1,num2,num3;
	printf("Enter Num1:- ");
	scanf("%d",&num1);
	printf("Enter Num2:- ");
	scanf("%d",&num2);
	printf("Enter Num3:- ");
	scanf("%d",&num3);
	
	if(num1 > num2){
		if(num1 > num3){
			printf("num1 is greater");
		}else{
			printf("num3 is greater");
		}
	}else{
		if(num2 > num3){
			printf("num2 is greater");
		}else{
			printf("num3 is greater");
		}
	}
}