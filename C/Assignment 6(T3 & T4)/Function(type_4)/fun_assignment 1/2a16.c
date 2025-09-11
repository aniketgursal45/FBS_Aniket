#include<stdio.h>
int palinnot(int);//function declaration
void main(){
	int no;
	palinnot(121)?printf("palindrome"):printf("not palindrome");//function call
}
int palinnot(int no){//function defination
	
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