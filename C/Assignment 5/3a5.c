#include<stdio.h>
void main(){
	int n=5;
	
	for(int i=1;i<=n;i++){
		for(int j =5;j>=i;j--){
			if(j>=i)
				printf("*");
		}
		printf("\n");
	}
}