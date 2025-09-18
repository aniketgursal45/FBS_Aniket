#include<stdio.h>
void main(){
	int arr[5];
	printf("Enter a number in array:- ");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	printf("{");
	for(int i=0;i<5;i++){
		printf(" %d ",arr[i]);
	}
	printf("}\n");
	
	int sum=0;
	
	for(int i=0;i<5;i++){
		sum = sum+arr[i];
	}
	
	printf("sum of all number is:- %d",sum);
}

