#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main(){
	char arr[]="Rohit Sharma";
	int len=mystrlen(arr);
	printf("len is:- %d",len);
}
int mystrlen(char* arr){
	int i=0;
	while(arr[i]!='\0'){
		i++;
	}
	return i;
}