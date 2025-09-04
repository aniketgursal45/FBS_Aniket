#include<stdio.h>
void main(){
	int n = 5;
	for(int i=1;i<=n;i++){
		for(int s=1;s<i;s++){
			printf(" ");
		}
		for(int j=5;j>=i;j--){
			if(j>=i)
				printf("*");
		}
		printf("\n");
}
}