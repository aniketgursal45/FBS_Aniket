#include<stdio.h>
void main(){
	int arr[6]={22,10,101,127,5,45};
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