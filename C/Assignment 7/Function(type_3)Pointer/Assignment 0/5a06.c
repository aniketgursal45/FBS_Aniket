#include<stdio.h>
void aver(int*,int*,int*,int*,int*,int*,int*);//function declaration
void main(){
	int no1=10,no2=10,no3=10,no4=10,no5=10,t5,average;
	aver(&no1,&no2,&no3,&no4,&no5,&t5,&average);	//function call
}
void aver(int* no1,int* no2,int* no3,int* no4,int* no5,int* t5,int* average){ //function defination
	*t5 = *no1+*no2+*no3+*no4+*no5;
	*average = *t5/ 5;
	printf("Average is %d",*average);
}