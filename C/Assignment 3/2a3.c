#include<stdio.h>
void main(){
	int n =5;
	int i=1;
	int table;
	
	while(i <=10){
		table = n * i;
		printf("%d * %d = %d\n",n,i,table);
		i++;
	}
}