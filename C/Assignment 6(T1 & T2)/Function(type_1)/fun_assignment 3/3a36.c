#include<stdio.h>
void firen();
void main(){
	firen();

}
void firen(){
	int start =1,end=5,sum=0;
	
	while(start<=end){
		sum = sum + start;
		start++;
	}
	printf("sum of number from start to end is :- %d",sum);
}