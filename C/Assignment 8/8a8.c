#include<stdio.h>
void main() {
	int s1,s2,s3;
	printf("Enter of size of arr:- ");
	scanf("%d",&s1);
	printf("Enter of size of arr:- ");
	scanf("%d",&s2);

	int arr[s1];
	int brr[s2];
	s3=s1 + s2;
	int crr[s3];

	printf("Enter array of arr: -");
	for(int i=0; i<s1; i++) {
		scanf("%d",&arr[i]);
	}
	printf("Enter array of brr: -");
	for(int i=0; i<s2; i++) {
		scanf("%d",&brr[i]);
	}

	printf("[");
	for(int i=0; i<s1; i++) {
		printf(" %d ",arr[i]);
	}
	printf("]");



	printf("[");
	for(int i=0; i<s2; i++) {
		printf(" %d ",brr[i]);
	}
	printf("]");
	
	int j=0;
	for(int i=0;i<s1;i++){
		crr[j]=arr[i];
		j++;
	}
	for(int i=0;i<s2;i++){
		crr[j]=brr[i];
		j++;
	}
	
	printf("[");
	for(int i=0; i<s3; i++) {
		printf(" %d ",crr[i]);
	}
	printf("]");
}