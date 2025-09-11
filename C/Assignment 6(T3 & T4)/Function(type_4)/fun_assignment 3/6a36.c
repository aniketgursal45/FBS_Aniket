#include<stdio.h>
int pernotper(int,int,int);
void main(){
	int n,i,sum;
	pernotper(28,1,0)?printf("perfectnumber"):printf("not perfectnumber");

}
int pernotper(int n, int i, int sum){
	
	
	while(i< n){
		if(n%i==0){
			sum = sum+i;
		}
		i++;
	}
	if(sum == n)
		return 1;
	else
		return 0;
}