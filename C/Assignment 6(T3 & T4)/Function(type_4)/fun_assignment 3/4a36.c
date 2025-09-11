#include<stdio.h>
int primeon(int,int,int);
void main(){
	int n,i,flag;
	
	primeon(7,2,0)?printf("number is prime"):printf("numper is not prime");

}
int primeon(int  n,int i,int flag){

	while(i <n){
		if( n%i==0){
			flag =1;
			return 0;
		}
		i++;
	}
	return 1;
}