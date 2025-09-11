#include<stdio.h>
int operat(int,int,char);//function declaration
void main(){
	int no1;
	printf("Enter Number 1:- ");
	scanf("%d",&no1);
	int no2;
	printf("Enter Number 2:- ");
	scanf("%d",&no2);
	
	fflush(stdin);
	char op; 
	printf("Enter the operator:- ");
	scanf("%c",&op);
	
	printf("%d",operat(no1,no2,op));//function call

}
int operat(int no1,int no2,char op){//function defination

	
	if(op == '+')
		return no1 + no2;
		
	else if(op == '-')
		return no1 - no2;
		
	else if(op == '*')
		return no1 * no2;
		
	else if(op=='/')
		return no1 / no2;

	else if(op =='%')
		return no1 % no2;
	
	else {	
		printf("Give correct op");
		return 0;
}
}