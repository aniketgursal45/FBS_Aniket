#include<stdio.h>
void main(){
	int n,rem,fact,sum=0,i=1,num;
	printf("Give a range of n number :-");
	scanf("%d",&n);
	while(i <=n){
		sum=0;
		num=i;
		while(num>0){
			rem = num %10;
			num = num/10;
			fact=1;
			while(rem>0){
				fact = fact * rem;
				rem--;
			}
			sum=sum+fact;
		}
		if(i==sum){
			printf("Strong %d \n",i);
	}
	i++;
}
}