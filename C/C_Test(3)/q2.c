#include<stdio.h>
void main(){
	int sum=0;
	for(int start=1;start<6;start++){
		sum=sum + start;
		start=start+1;
	}
	printf("sum= %d",sum);
}