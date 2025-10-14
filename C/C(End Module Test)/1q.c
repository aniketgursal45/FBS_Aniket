#include<stdio.h>
void countfact(int);
void main(){
	int n;
	printf("Enter n num to print factorial till that:- ");
	scanf("%d",&n);
	
	countfact(n);
}
void countfact(int n){
	int fact=1;
	int tsum=0;
	for(int i=1;i<=n;i++){
		fact=1;
		for(int j=i;j>1;j--){
			fact =fact *j;
		}
		printf("%d factorial is:- %d\n",i,fact);
		tsum=tsum+fact;
	}
	printf("Sum of series is 1 to n :- %d",tsum);
}