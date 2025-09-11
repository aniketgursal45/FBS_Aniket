#include<stdio.h>
int palinnpal();
void main(){
	palinnpal()?printf("palindrome"):printf("notpalindrome");

	}
	int palinnpal(){
	int n =121,temp=n,rev=0,rem;
	
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
	