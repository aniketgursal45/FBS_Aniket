//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>

void main(){
	char ch ='C';
	
	if(ch >='a' && ch<='z'){
		printf("character is lowercase.");
	}else{
		printf("character is uppercase");
	}
}