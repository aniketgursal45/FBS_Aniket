#include<stdio.h>
int greaterthan(int,int,int);//function declaration
void main(){
	int num1,num2,num3;
	printf("Enter Num1:- ");
	scanf("%d",&num1);
	printf("Enter Num2:- ");
	scanf("%d",&num2);
	printf("Enter Num3:- ");
	scanf("%d",&num3);
	
	
	printf("greatest number is %d",greaterthan(num1,num2,num3));//function call

}
int greaterthan(int num1,int num2,int num3){//function defination

	if(num1 > num2){
		if(num1 > num3)
			return num1;
		else
			return num3 ;
		
	}else{
		if(num2 > num3)
			return num2;
		else
			return num3 ;
	}
}