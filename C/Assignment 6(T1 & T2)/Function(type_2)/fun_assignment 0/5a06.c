#include<stdio.h>
int aver();//function declaration
void main(){
	printf("Average is %d",aver());	//function call
}
int aver(){ //function defination
	int no1,no2,no3,no4,no5,t5;
	no1 = 10;
	no2 = 10;
	no3 = 10;
	no4 = 10;
	no5 = 10;
	t5 = no1+no2+no3+no4+no5;
	return t5/5;
}