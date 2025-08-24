#include<stdio.h>
void main(){
	int n =28,i=1,sum=0;
	
	while(i< n){
		if(n%i==0){
			sum = sum+i;
		}
		i++;
	}
	sum == n?printf("perfectnumber"):printf("not perfectnumber");
}