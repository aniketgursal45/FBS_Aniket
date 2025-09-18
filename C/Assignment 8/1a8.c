#include<stdio.h>
void main(){
	int arr[10];
	for(int i =0;i<10;i++){
		scanf("%d",&arr[i]);
	}
	for(int i =0;i<10;i++){
		printf("%d\n",arr[i]);
	}
	
	int max =arr[0];
	
	for(int i=1;i<10;i++){
		if(max<arr[i])
			max = arr[i];
	}
	printf(" maximum number in array is :- %d\n",max);
	
	int min =arr[0];
	
	for(int i=1;i<10;i++){
		if(min>arr[i])
			min = arr[i];
	}
	printf(" minimum number in array is :- %d\n",min);
}