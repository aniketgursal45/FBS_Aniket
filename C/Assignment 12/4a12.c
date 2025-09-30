#include<stdio.h>
#include<string.h>
void main(){
	char s1[1000];
	printf("Enter your sentence:- ");
	scanf("%[^\n]",s1);
	
	int len = strlen(s1);
	int i=0;
	int k=0;
	int j=len-1;
	char temp;

			temp=s1[k];
			s1[k]=s1[j];
			s1[j]=temp;

	printf("%s",s1);
}