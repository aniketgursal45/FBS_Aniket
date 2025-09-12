#include<stdio.h>
void evenodd(int*);//function declaration
void main(){
	int no = 9;
	evenodd(&no);//function call
}
void evenodd(int* no){//function defination
	if(*no % 2 ==0){
		printf("Number is even");
	}else{
		printf("Number is odd");
	}
}