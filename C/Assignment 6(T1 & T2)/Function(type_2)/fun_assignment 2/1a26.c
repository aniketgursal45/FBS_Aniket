#include<stdio.h>
int operat();//function declaration
void main(){
	
	printf("%d",operat());//function call

}
int operat(){//function defination
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