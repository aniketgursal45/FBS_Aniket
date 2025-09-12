#include<stdio.h>
void palinnpal(int*,int*,int*,int*);
void main(){
	int n =121,temp=n,rev=0,rem;
	palinnpal(&n,&temp,&rev,&rem);

	}
	void palinnpal(int* n,int* temp,int* rev,int* rem){	
	while(*n>0){
		*rem = *n % 10;
		*rev = *rev *10 + *rem;
		*n = *n /10;
		}
		*temp == *rev?printf("palindrome"):printf("notpalindrome");	
	}
	