#include<stdio.h>
int palinnpal();

void main(){
	int n =121,temp=n,rev=0,rem;
	palinnpal(n,temp,rev,rem)?printf("palindrome"):printf("notpalindrome");

	}
	int palinnpal(int n,int temp,int rev,int rem){

	while(n>0){
		rem = n % 10;
		rev = rev *10 +rem;
		n = n /10;
		}
		if(temp == rev)
			return 1;
		else
			return 2;	
	}
	