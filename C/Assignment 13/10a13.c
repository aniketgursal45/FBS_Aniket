#include<stdio.h>
#include<stdlib.h>
void sort(int*);
void store(int*,int);
void main(){
	int* arr=(int*)malloc(sizeof(int) * 6);
	int size=6;
	store(arr,size);
	sort(arr);
	

}
void store(int* arr,int size) {
	for(int i =0; i<size; i++) {
		scanf("%d",&arr[i]);         
	}
}
void sort(int* arr){
	int temp;
	printf("{");
	for(int i=0;i<6;i++){
		for(int j =i+1;j<6;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	
		printf(" %d ",arr[i]);
	}
	printf("}");
}