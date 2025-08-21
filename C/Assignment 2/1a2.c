#include<stdio.h>
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
	
	
	if(op == '+'){
		printf("%d", no1 + no2);
	}
	else if(op == '-'){
		printf("%d", no1 - no2);
	}
	else if(op == '*'){
		printf("%d", no1 * no2);
	}
	else if(op=='/'){
		printf("%d", no1 / no2);
	}
	else if(op =='%'){
		printf("%d", no1 % no2);
	}
	else {
		printf("Give correct op");
}
}