#include<stdio.h>
void pernotper(int,int,int);
void main(){
	int n =28,i=1,sum=0;
	pernotper(n,i,sum);

}
void pernotper(int n,int i,int sum){

	
	while(i< n){
		if(n%i==0){
			sum = sum+i;
		}
		i++;
	}
	sum == n?printf("perfectnumber"):printf("not perfectnumber");
}