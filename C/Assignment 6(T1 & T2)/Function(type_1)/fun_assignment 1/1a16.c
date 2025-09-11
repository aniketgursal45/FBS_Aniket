#include<stdio.h>
void evenodd();//function declaration
void main(){
	evenodd();//function call
}
void evenodd(){//function defination
	int no = 8;
	
	if(no % 2 ==0){
		printf("Number is even");
	}else{
		printf("Number is odd");
	}
}