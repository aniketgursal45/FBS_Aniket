#include<stdio.h>
int primeon();
void main(){
	primeon()?printf("number is prime"):printf("numper is not prime");

}
int primeon(){
	int n= 7;
	int i =2;
	int flag = 0;
	
	while(i <n){
		if( n%i==0){
			flag =1;
			return 0;
		}
		i++;
	}
	return 1;
}