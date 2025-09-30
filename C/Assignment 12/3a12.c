#include<stdio.h>
#include<string.h>
void main(){
	char s1[1000];
	printf("Enter your sentence:- ");
	scanf("%[^\n]",s1);
	
	int n;
	printf("Enter number n:- ");
	scanf("%d",&n);
	int len=strlen(s1);
	int i=0;
	i=n;
			while(i<len){
				s1[i]=s1[i+1];
				i++;
		
	}
	printf("%s",s1);
}
	
	
	
	