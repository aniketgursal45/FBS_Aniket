#include<stdio.h>
#include<string.h>
void mystrlower(char*);
void main(){
	char arr[]="anIkEt";
	mystrlower(arr);
	printf("%s",arr);
}
void mystrlower(char* arr){
	int i=0;
	while(arr[i]!='\0'){
		if(arr[i]>='A' && arr[i]<='Z')
			arr[i]=arr[i]+32;
		
		i++;
	}
	
}