#include<stdio.h>
#include<string.h>
void main(){
	char s1[1000];
	printf("Enter your sentence:- ");
	scanf("%[^\n]",s1);
	
	int i=0;
	int len=strlen(s1);
	
	while(s1[i] !='\0'){
		if(s1[i]==' '){
			s1[i]='$';
		}
		i++;
	}
	printf("%s",s1);
}