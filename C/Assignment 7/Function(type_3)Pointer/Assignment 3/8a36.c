#include<stdio.h>
void strongn(int*,int*,int*,int*,int*);
void main(){
	int n = 145,rem,fact,sum=0,temp=n;
	strongn(&n,&rem,&fact,&sum,&temp);

}
void strongn(int* n,int* rem,int* fact,int* sum,int* temp){
	while(*n >0){
		*rem = *n %10;
		*n = *n/10;
		
		*fact = 1;
		
		while(*rem >= 1){
			*fact = *fact * *rem;
			(*rem)--;
		}
		*sum = *sum + *fact;
	}
	*temp == *sum?printf("strongnumber"):printf("notstrongnumber");
}