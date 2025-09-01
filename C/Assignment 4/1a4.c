#include<stdio.h>
#include<math.h>
void main(){
	int n,sum=0,rem,i=1,temp=i,power,count=0;
	printf("Give a n number:- ");
	scanf("%d",&n);
	while(i<=n){
		sum = 0;
		temp =i;
		count =0;
		while(temp >0){
			temp = temp/10;
			count++;
		}
		temp=i;
	while(temp>0){
		rem = temp % 10;
		temp = temp/10;
		power = (int)pow(rem,count);
		sum = sum + power;
	}
	if(sum == i ){
		printf("Armstrong:-%d \n",i); 
	}
	i++;
}
}