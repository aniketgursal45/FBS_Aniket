#include<stdio.h>
void primeon();
void main(){
	primeon();

}
void primeon(){
	int n= 7;
	int i =2;
	int flag = 0;
	
	while(i <n){
		if( n%i==0){
			flag =1;
			printf("number is not prime");
			break;
		}
		i++;
	}
	if(flag==0){
		printf("numper is prime");
	}
}