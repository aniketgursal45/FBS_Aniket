#include<stdio.h>
int factn(int,int,int);
void main(){
	int n = 5,fact=1,temp = n;
	printf("factorial is %d",factn(5,1,temp));

}
int factn(int n,int fact,int temp){
	
	
	while(n >0){
		fact = fact *n;
		n--;
	}
	return fact;	
}