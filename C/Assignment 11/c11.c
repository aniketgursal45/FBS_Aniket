#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main() {
	char arr[]="Anike";
	char str[]="aniket Gursal";
	int result=mystrcmp(arr,str);
	if(result==0)
		printf("same");
	else if(result==1)
		printf("different arr is greater");
	else
		printf("different str is greater");
}
int mystrcmp(char* arr,char* str) {
	int i=0;

	while(arr[i]!='\0' && str[i]!='\0') {

		if(arr[i]!=str[i]) {
			if(arr[i]>str[i])
				return 1;
			else
				return -1;
		}
		i++;
	}
	
	if(arr[i]=='\0' && str[i]=='\0')
		return 0;
	else if(arr[i]=='\0')
		return -1;
	else if(str[i]=='\0')
		return 1;
	
}