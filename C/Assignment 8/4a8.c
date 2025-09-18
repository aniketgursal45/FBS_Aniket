#include<stdio.h>
void main(){
	int arr[5];
	
	printf("Enter a number's in array:- ");
	for(int i =0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	printf("{");
	for(int i =0;i<5;i++){
		printf(" %d ",arr[i]);
	}
	printf("}\n");
	
	for(int i=0;i<5;i++){
		if(arr[i] %2 == 0){
			printf("Even no:- %d \n",arr[i]);
		}else{
			printf("odd no:- %d \n",arr[i]);
		}
	}
}