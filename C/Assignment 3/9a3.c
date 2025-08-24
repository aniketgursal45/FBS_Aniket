#include<stdio.h>
void main(){
	int n =121,temp=n,rev=0,rem;
	
	while(n>0){
		rem = n % 10;
		rev = rev *10 +rem;
		n = n /10;
		}
		temp == rev?printf("palindrome"):printf("notpalindrome");
	}
	