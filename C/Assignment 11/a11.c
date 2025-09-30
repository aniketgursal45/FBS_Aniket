#include<stdio.h>
#include<string.h>
void mystrcpy(char*,char*);
void main() {
	char str[]="Aniket Gursal";
	int size = strlen(str)+1;
	char ptr[size];
	mystrcpy(str,ptr);
	printf("str=%s",str);
	printf("\nptr=%s",ptr);
}
void mystrcpy(char* str,char* ptr) {
	int i=0;
	while(str[i]!='\0'){
		ptr[i]=str[i];
		i++;
	}
	ptr[i]='\0';
}