#include<stdio.h>
#include<string.h>
void main() {
	char arr[1000];
	printf("Enter a string to see is palindrome or not:- ");
	scanf("%[^\n]",arr);

	printf("%s",arr);
	int len=strlen(arr);
	int count=0;
	int flag=0;
	int i=0;
	int j=len-1;
	while(i<j) {
		if(arr[i]==' ') {
			i++;
			continue;
		}
		if(arr[j]==' ') {
			j--;
			continue;
		}
		
		if(arr[i]!=arr[j]){
			flag=1;
			break;
		}
		i++;
		j--;
	}
	if(flag==0) {
		printf("\nstring is a palindrome");
	} else
		printf("\nstring is not palindrome");
}