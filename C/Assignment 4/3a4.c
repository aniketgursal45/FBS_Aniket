#include<stdio.h>
void main(){
	int n,i=1,sum,j=2;
	printf("enter a n range:- ");
	scanf("%d",&n);
	while(j<=n){
		sum=0;
		i=1;
		while(i<j){
			if(j%i==0){
				sum=sum +i;
			}
			i++;
		}
		if(sum==j){
			printf("Perfect %d \n",j);
		}
		j++;
}
}