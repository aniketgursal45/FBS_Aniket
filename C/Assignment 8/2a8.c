#include<stdio.h>
void main(){
	int arr[10];
	printf("Enter in array number:- ");
	for(int i=0;i<10;i++){
		scanf("%d",&arr[i]);
	}
	
	for(int i=0;i<10;i++){
		printf("%d\n",arr[i]);
	}
	
	int num,index=-1;
	
	printf("Enter a num to check in array:- ");
	scanf("%d",&num);
	for(int i=0;i<10;i++){
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