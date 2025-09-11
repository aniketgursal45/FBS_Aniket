#include<stdio.h>
void primeon();
void main(){
	int n,i,flag;
	primeon(7,2,0);

}
void primeon(int n,int i,int flag){

	
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