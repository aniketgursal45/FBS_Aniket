#include<stdio.h>
#include<string.h>
void main(){
	char arr[]="My Name is Aniket Gursal";
	
	int i=0;
	int word =0;
	while(arr[i]==' '){
		i++;
	}
	for(;arr[i]!='\0';i++){
		if((arr[i]!=' ' &&i==0)|| (arr[i]!=' ' && arr[i-1]==' ')){
			word++;
		}
	}
	printf("Number of Words Present in a String is:- %d",word);
}