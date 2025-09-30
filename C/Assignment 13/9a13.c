#include<stdio.h>
#include<stdlib.h>
void rev(int*);
void store(int*,int);
void main(){
	int* arr=(int*)malloc(sizeof(int) * 5);
	printf("Enter number in arr array:- ");
	int size=5;
	store(arr,size);
	rev(arr);

}
void store(int* arr,int size) {
	for(int i =0; i<size; i++) {
		scanf("%d",&arr[i]);         
	}
}
void rev(int* arr){
	for(int i=4;i>-1;i--){
		printf(" %d ",arr[i]);
	}
}