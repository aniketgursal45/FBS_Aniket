#include<stdio.h>
int pernotper();
void main(){
	pernotper()?printf("perfectnumber"):printf("not perfectnumber");

}
int pernotper(){
	int n =28,i=1,sum=0;
	
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