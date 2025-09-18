#include<stdio.h>
void main(){
	int arr[5];
	int brr[5];
	int crr[5];
	
	printf("Enter a number's in arr array:- ");
	for(int i =0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("Enter a number's in brr array:- ");
	for(int i =0;i<5;i++){
		scanf("%d",&brr[i]);
	}
	printf("{");
	for(int i =0;i<5;i++){
		printf(" %d ",arr[i]);
	}
	printf("}\n");
	printf("{");
	for(int i =0;i<5;i++){
		printf(" %d ",brr[i]);
	}
	printf("}\n");
	
	printf("{");
	for(int i =0;i<5;i++){
		crr[i]=arr[i] +brr[i];
		printf(" %d ",crr[i]);
	}
	printf("}");
	
}