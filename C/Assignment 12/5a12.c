#include<stdio.h>
#include<string.h>
void main(){
	char s1[1000];
	printf("Enter your sentence:- ");
	scanf("%[^\n]",s1);
	
	int i=0;
	int vcount=0;
	
	while(s1[i]!='\0'){
		if(s1[i]=='A' || s1[i]=='a' || s1[i]=='E' || s1[i]=='e' || s1[i]=='I' || s1[i]=='i' || s1[i]=='o' || s1[i]=='O'|| s1[i]=='u' || s1[i]=='U'  ){
			vcount++;
		}
		i++;
	}
	printf("Total number of vowels are:- %d",vcount);
}