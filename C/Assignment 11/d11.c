#include<stdio.h>
#include<string.h>
void mystrcat(char*,char*);
void main() {
	char arr[]="Aniket";
	char str[]="Gursal";
	mystrcat(arr,str);
	printf("%s",arr);
}
void mystrcat(char* arr,char* str) {
	int i=0;
	int size = strlen(arr);
	while(str[i]!='\0') {
		if(arr[size]=='\0') {
			arr[size]=str[i];
			size++;
		}
		i++;
	}
	arr[size]='\0';
	
}