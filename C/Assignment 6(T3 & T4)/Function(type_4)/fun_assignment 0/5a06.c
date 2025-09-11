#include<stdio.h>
int aver(int,int,int,int,int,int);//function declaration
void main(){
	int no1,no2,no3,no4,no5,t5;
	no1 = 10;
	no2 = 10;
	no3 = 10;
	no4 = 10;
	no5 = 10;
	printf("Average is %d",aver(no1,no2,no3,no4,no5,t5));	//function call
}
int aver(int no1,int no2,int no3,int no4,int no5,int t5){ //function defination
	t5 = no1+no2+no3+no4+no5;
	return t5/5;
}