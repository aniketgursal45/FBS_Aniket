#include<stdio.h>
void store(int*,int);
void display(int*,int);
void sumn(int*,int*,int*,int);
void main(){
	int arr[5];
	int brr[5];
	int crr[5];
	int size=5;
	
	printf("Enter number in arr array:- ");
	store(arr,size);
	printf("Enter number in brr array:- ");
	store(brr,size);
	display(arr,size);
	display(brr,size);
	sumn(arr,brr,crr,size);
	
}
void store(int* arr,int size) {
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
void sumn(int* arr,int* brr,int* crr,int size){
		printf("{");
	for(int i =0;i<5;i++){
		crr[i]=arr[i] +brr[i];
		printf(" %d ",crr[i]);
	}
	printf("}");
}