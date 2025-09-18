#include<stdio.h>
void store(int*,int);
void display(int*,int);
void alternum(int*,int);
void main(){
	int arr[5];
	store(arr,5);
	display(arr,5);
	alternum(arr,5);	

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
void alternum(int* arr,int size){
		printf("{");
	for(int i=0;i<size;i++){
		if(i % 2==0)
			printf(" %d ",arr[i]);
		}
	printf("}\n");
}