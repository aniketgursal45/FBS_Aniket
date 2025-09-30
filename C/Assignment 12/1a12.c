#include<stdio.h>
#include<string.h>
void main(){
	char s1[1000];
	printf("Enter your sentence:- ");
	scanf("%[^\n]",s1);
	
	char s2;
	printf("\nenter one character:- ");
	scanf(" %c",&s2);
	
	char* result=strchr(s1,s2);
	
	if(result!=NULL)
		printf("character is present in the string");
	else
		printf("Not present");
}