#include<stdio.h>
void primeon(int*,int*,int*);
void main(){
	int n=7,i=2,flag=0;
	primeon(&n,&i,&flag);

}
void primeon(int* n,int* i,int* flag){

	
	while(*i <*n){
		if( *n%*i==0){
			*flag =1;
			printf("number is not prime");
			break;
		}
		(*i)++;
	}
	if(*flag==0){
		printf("numper is prime");
	}
}