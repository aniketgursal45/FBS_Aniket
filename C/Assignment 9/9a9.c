#include<stdio.h>
void rev(int*);
void main(){
	int arr[5]={1,2,3,4,5};
	rev(arr);

}
void rev(int* arr){
	for(int i=4;i>-1;i--){
		printf(" %d ",arr[i]);
	}
}