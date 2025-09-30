#include<stdio.h>
int mystrlen(char*);
void main() {
	char s1[1000];
	char s2[1000];
	printf("Enter first string:- ");
	scanf("%[^\n]",s1);

	printf("Enter second string:- ");
	scanf(" %[^\n]",s2);

	int s1len=mystrlen(s1);
	int s2len=mystrlen(s2);

	if(s1len>s2len)
		printf("s1 is greater");
	else if(s1len<s2len)
		printf("s2 is greater");
	else if(s1len==s2len) {
		int i=0;
		for(i=0; i<s1len; i++) {
			if(s1[i]!=s2[i]) {
				if(s1[i]>s2[i]) {
					printf("s1 is grater");
					break;
				} else if(s1[i]<s2[i]) {
					printf("s2 is grater");
					break;
				} 
			}
		}	if(i==s1len) {
		printf("Both are same");
	}


	}

}
int mystrlen(char* s1) {
	int i=0;
	while(s1[i]!='\0') {
		i++;
	}
	return i;
}