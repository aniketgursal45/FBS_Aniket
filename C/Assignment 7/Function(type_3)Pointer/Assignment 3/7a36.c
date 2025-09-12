#include<stdio.h>
void factn(int*,int*,int*);
void main(){
	int n = 5,fact=1,temp = n;
	factn(&n,&fact,&temp);

}
void factn(int* n,int* fact,int* temp){

	while(*n >0){
		*fact = *fact * *n;
		(*n)--;
	}
	printf("factorial of %d is %d",*temp,*fact);	
}