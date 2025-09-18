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
		
		if(arr[i]<1){
			continue;
		}
		int isprime =1;
		for(int num = 2;num<arr[i];num++){
			if(arr[i] % num==0){
				isprime =0;
				break;
			}
		}
		if(isprime==1){
			printf("prime no %d ",arr[i]);
		}
	}
}