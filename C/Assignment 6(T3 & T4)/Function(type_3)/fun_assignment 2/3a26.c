#include<stdio.h>
void greaterthan(int,int,int);//function declaration
void main(){
	int num1,num2,num3;
	printf("Enter Num1:- ");
	scanf("%d",&num1);
	printf("Enter Num2:- ");
	scanf("%d",&num2);
	printf("Enter Num3:- ");
	scanf("%d",&num3);
	greaterthan(num1,num2,num3);//function call

}
void greaterthan(int num1,int num2,int num3){//function defination

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