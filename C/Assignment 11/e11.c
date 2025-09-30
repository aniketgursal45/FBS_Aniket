#include<stdio.h>
#include<string.h>
void mystrncpy(char*,char*,int);
void main() {
	char str[]="Aniket Gursal";
	int size = strlen(str)+1;
	char ptr[size];
	int n=3;
	mystrncpy(str,ptr,n);
	printf("str=%s",str);
	printf("\nptr=%s",ptr);
}
void mystrncpy(char* str,char* ptr,int n) {
	int i=0;
	while(str[i]!='\0'){
		ptr[i]=str[i];
		i++;
		if (i==n)
			break;
	}
	ptr[i]='\0';
}