#include<stdio.h>
void strongn();
void main(){
	strongn();

}
void strongn(){
	int n = 145,rem,fact,sum=0,temp=n;
	
	while(n >0){
		rem = n %10;
		n = n/10;
		
		fact = 1;
		
		while(rem >= 1){
			fact = fact * rem;
			rem--;
		}
		sum = sum +fact;
	}
	temp == sum?printf("strongnumber"):printf("notstrongnumber");
}