#include<stdio.h>
#include<stdlib.h>
void store(int*,int);
void display(int*,int);
void sumallnum(int*,int);
void main() {
	int* arr=(int*)malloc(sizeof(int)*5);
	store(arr,5);
	display(arr,5);
	sumallnum(arr,5);
}
void store(int* arr,int size) {
	printf("Enter a number in array:- ");
	for(int i=0; i<size; i++) {
		scanf("%d",&arr[i]);
	}
}
void display(int* arr,int size) {
	printf("{");
	for(int i=0; i<size; i++) {
		printf(" %d ",arr[i]);
	}
	printf("}\n");

}
void sumallnum(int* arr,int size) {
	int sum=0;

	for(int i=0; i<size; i++) {
		sum = sum+arr[i];
	}

	printf("sum of all number is:- %d",sum);
}

