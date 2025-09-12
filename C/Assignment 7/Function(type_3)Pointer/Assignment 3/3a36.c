#include<stdio.h>
void firen(int*,int*,int*);
void main(){
	int start =1,end=5,sum=0;
	firen(&start,&end,&sum);	

}
void firen(int* start,int* end,int* sum){
	
	while(*start<=*end){
		*sum = *sum + *start;
		(*start)++;
	}
	printf("sum of number from start to end is :- %d",*sum);
}
