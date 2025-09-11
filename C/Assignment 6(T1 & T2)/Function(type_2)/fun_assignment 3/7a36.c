#include<stdio.h>
int factn();
void main(){
	printf("factorial is %d",factn());

}
int factn(){
	int n = 5,fact=1,temp = n;
	
	while(n >0){
		fact = fact *n;
		n--;
	}
	return fact;	
}