#include<stdio.h>
#include<stdlib.h>
void store(int*,int);
void display(int*,int);
void merge(int*,int*,int*,int,int,int);
void main() {
	int s1,s2,s3;
	printf("Enter of size of arr:- ");
	scanf("%d",&s1);
	printf("Enter of size of arr:- ");
	scanf("%d",&s2);

	int* arr=(int*)malloc(sizeof(int)*s1);
	int* brr=(int*)malloc(sizeof(int)*s2);
	s3=s1 + s2;
	int* crr=(int*)malloc(sizeof(int)*s3);
	printf("Enter array of arr: -");
	store(arr,s1);
	printf("Enter array of arr: -");
	store(brr,s2);
	merge(arr,brr,crr,s1,s2,s3);
	display(arr,s1);
	display(brr,s2);
	display(crr,s3);

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
void merge(int* arr,int* brr,int* crr,int s1,int s2,int s3){
		int j=0;
	for(int i=0;i<s1;i++){
		crr[j]=arr[i];
		j++;
	}
	for(int i=0;i<s2;i++){
		crr[j]=brr[i];
		j++;
	}
}