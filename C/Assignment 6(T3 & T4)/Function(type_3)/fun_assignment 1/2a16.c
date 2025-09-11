#include<stdio.h>
void palinnot(int,int,int,int,int,int);//function declaration
void main(){
	int no =121;
	int r1,r2,r3,rev,q;
	palinnot(no,r1,r2,r3,rev,q);//function call
}
void palinnot(int no,int r1,int r2,int r3,int rev,int q){//function defination	
	r1= no % 10;
	q = no / 10;
	r2 = q % 10;
	r3 =  q / 10;
	
	rev = r1 *100 + r2 * 10 + r3;
	
	if( rev == no){
		printf("Given number is pallindrome");
	}else{
		printf("Given number is Not a pallindrome");
	}
}