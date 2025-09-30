#include<stdio.h>
#include<stdlib.h>
void store(int*,int);
void display(int*,int);
void max(int*,int);
void min(int*,int);
void main() {
	int* arr=(int*)malloc(sizeof(int)*10);
	store(arr,10);//function call
	display(arr,10);
	max(arr,10);
	min(arr,10);

}
void store(int* arr,int size) { //function defination
	for(int i =0; i<size; i++) {
		scanf("%d",&arr[i]);
	}
}
void display(int* arr,int size){
		for(int i =0; i<size; i++) {
		printf("%d\n",arr[i]);
	}
}
void max(int* arr,int size){
	
	int max =arr[0];

	for(int i=1; i<size; i++) {
		if(max<arr[i])
			max = arr[i];
	}
	printf(" maximum number in array is :- %d\n",max);

}
void min(int* arr,int size){
	
	int min =arr[0];

	for(int i=1; i<size; i++) {
		if(min>arr[i])
			min = arr[i];
	}
	printf(" minimum number in array is :- %d\n",min);
}