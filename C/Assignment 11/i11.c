#include<stdio.h>
#include<string.h>
void mystrstr(char*,char*);
void main() {
	char arr[]="Aniket Gursal";
	mystrstr(arr,"Gursal");
}
void mystrstr(char* arr,char* sub) {
	int len=strlen(sub);

	int i=0,j=0;
	int flag=0;
	while(arr[i]!='\0') {
		if(arr[i]==sub[j]) {
			j=0;
			int k=i;
			flag=0;
			while(arr[k]==sub[j] && sub[j]!='\0') {
				k++;
				j++;
				flag++;
			}
			if(flag==len) {
				printf("Found %s",sub);
				return;
			}
		}
		i++;

	}
	printf("not found");
}
