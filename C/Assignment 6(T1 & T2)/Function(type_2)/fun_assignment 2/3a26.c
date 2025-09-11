#include<stdio.h>
int greaterthan();//function declaration
void main(){
	
	printf("greatest number is %d",greaterthan());//function call

}
int greaterthan(){//function defination
	int num1,num2,num3;
	printf("Enter Num1:- ");
	scanf("%d",&num1);
	printf("Enter Num2:- ");
	scanf("%d",&num2);
	printf("Enter Num3:- ");
	scanf("%d",&num3);
	
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