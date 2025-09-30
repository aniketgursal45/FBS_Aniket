#include<stdio.h>
#include<string.h>
void mystrupper(char*);
void main(){
	char arr[]="anIkEt";
	mystrupper(arr);
	printf("%s",arr);
}
void mystrupper(char* arr){
	int i=0;
	while(arr[i]!='\0'){
		if(arr[i]>='a' && arr[i]<='z')
			arr[i]=arr[i]-32;
		
		i++;
	}
	
}