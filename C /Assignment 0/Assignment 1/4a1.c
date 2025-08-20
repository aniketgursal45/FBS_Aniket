//Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
void main(){
	char ch = 'z';
	if(ch == 'a' || ch== 'e' || ch== 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch== 'E' || ch== 'I' || ch == 'O' || ch == 'U'){
		printf(" given character is a vowel");
	}else{
		printf("given character is a consonant");
	}
}