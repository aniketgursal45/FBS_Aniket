#include<stdio.h>
void main(){
	printf("odd:- ");
	for(int i=10;i<26;i++){
		if(i%2 !=0)
			printf(" %d ",i);
	}
	
	printf("\neven:- ");
	for(int i=1;i<16;i++){
		if(i%2 ==0)
			printf(" %d ",i);
	}
}