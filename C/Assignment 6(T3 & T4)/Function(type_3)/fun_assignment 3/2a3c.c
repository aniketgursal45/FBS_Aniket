#include<stdio.h>
void numtab(int,int,int);
void main(){
	int n ,i,table;
	numtab(5,1,table);

}
void numtab(int n,int i,int table){	
	while(i <=10){
		table = n * i;
		printf("%d * %d = %d\n",n,i,table);
		i++;
	}
}