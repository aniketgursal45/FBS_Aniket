#include<stdio.h>
#include<string.h>
void mystrrev(char*);
void main(){
	char arr[]="Aniket";
	mystrrev(arr);
	printf("%s",arr);
}
void mystrrev(char* arr){
	int i=strlen(arr)-1;
	int j=0;
	char temp;
	while(j<i){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i--;
		j++;
	}
}