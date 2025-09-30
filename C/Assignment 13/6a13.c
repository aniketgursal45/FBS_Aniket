#include<stdio.h>
#include<stdlib.h>
void store(int*,int);
void display(int*,int);
void primen(int*,int);
void main() {
	int* arr=(int*)malloc(sizeof(int)*5);
	store(arr,5);
	display(arr,5);
	primen(arr,5);

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
void primen(int* arr,int size) {
	for(int i=0; i<size; i++) {

		if(arr[i]<1) {
			continue;
		}
		int isprime =1;
		for(int num = 2; num<arr[i]; num++) {
			if(arr[i] % num==0) {
				isprime =0;
				break;
			}
		}
		if(isprime==1) {
			printf("prime no %d ",arr[i]);
		}
	}
}