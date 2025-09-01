#include<stdio.h>
void main(){
	int n,i=2,flag=0,j=2,temp;
	printf("Enter n number:- ");
	scanf("%d",&n);
	temp=n;
	while(j<=temp){
		n=j;
		i=2;
		flag=0;
	while(i<n){
		if(n %i==0){
			flag=1;
			break;
		}
		i++;
	}
	if(flag==0){
		printf("prime %d \n",n);
	}
	j++;
}
}
