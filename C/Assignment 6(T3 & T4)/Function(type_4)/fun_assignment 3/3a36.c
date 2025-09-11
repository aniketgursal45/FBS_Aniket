#include<stdio.h>
int firen(int ,int,int);
void main(){
	int start =1,end=5,sum=0;
	printf("sum of number from start to end is :- %d",firen(start,end,sum));

}
int firen(int start,int end,int sum){
	
	
	while(start<=end){
		sum = sum + start;
		start++;
	}
	return sum;
}