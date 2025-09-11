#include<stdio.h>
int palinnot();//function declaration
void main(){
	
	palinnot()?printf("palindrome"):printf("not palindrome");//function call
}
int palinnot(){//function defination
	int no;
	int r1,r2,r3,rev,q;
	
	r1= no % 10;
	q = no / 10;
	r2 = q % 10;
	r3 =  q / 10;
	
	rev = r1 *100 + r2 * 10 + r3;
	
	if( rev == no)
		return 1;
	else
		return 0;
}