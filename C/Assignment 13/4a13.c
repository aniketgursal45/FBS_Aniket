#include<stdio.h>
#include<stdlib.h>
void store(int*,int);
void display(int*,int);
void evenodd(int*,int);
void main() {
	int* arr = (int*)malloc(sizeof(int) * 5);
	store(arr,5);
	display(arr,5);
	evenodd(arr,5);
}
void store(int* arr,int size) {
	printf("Enter a number's in array:- ");
	for(int i =0; i<size; i++) {
		scanf("%d",&arr[i]);
	}
}
void display(int* arr,int size) {
	printf("{");
	for(int i =0; i<size; i++) {
		printf(" %d ",arr[i]);
	}
	printf("}\n");

}
void evenodd(int* arr,int size) {
	for(int i=0; i<size; i++) {
		if(arr[i] %2 == 0) {
			printf("Even no:- %d \n",arr[i]);
		} else {
			printf("odd no:- %d \n",arr[i]);
		}
	}
}