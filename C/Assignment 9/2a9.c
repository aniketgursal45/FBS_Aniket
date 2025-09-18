#include<stdio.h>
void store(int*,int);
void display(int*,int);
void nfound(int*,int);
void main(){
	int arr[10];
	store(arr,10);
	display(arr,10);
	nfound(arr,10);


}
void store(int* arr,int size){
	printf("Enter in array number:- ");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	}
}
void display(int* arr,int size){
	for(int i=0;i<size;i++){
		printf("%d\n",arr[i]);
	}
}
void nfound(int* arr,int size){
	int num,index=-1;
	
	printf("Enter a num to check in array:- ");
	scanf("%d",&num);
	for(int i=0;i<size;i++){
		if(num==arr[i]){
			index = i;
			break;
		}
	}
	if(index>=0)
		printf("number is found at index %d",index);
	else
		printf("Number not found");
}