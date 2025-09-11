#include<stdio.h>
int firen();
void main(){
	printf("sum of number from start to end is :- %d",firen());

}
int firen(){
	int start =1,end=5,sum=0;
	
	while(start<=end){
		sum = sum + start;
		start++;
	}
	return sum;
}