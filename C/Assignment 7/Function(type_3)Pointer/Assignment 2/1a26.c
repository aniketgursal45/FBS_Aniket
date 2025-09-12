#include<stdio.h>
void operat(int*,int*,char*);//function declaration
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
	
	
	operat(&no1,&no2,&op);//function call

}
void operat(int* no1,int* no2,char* op){//function defination
	if(*op == '+'){
		printf("%d", *no1 + *no2);
	}
	else if(*op == '-'){
		printf("%d", *no1 - *no2);
	}
	else if(*op == '*'){
		printf("%d", *no1 * *no2);
	}
	else if(*op=='/'){
		printf("%d", *no1 / *no2);
	}
	else if(*op =='%'){
		printf("%d", *no1 % *no2);
	}
	else {
		printf("Give correct op");
}
}