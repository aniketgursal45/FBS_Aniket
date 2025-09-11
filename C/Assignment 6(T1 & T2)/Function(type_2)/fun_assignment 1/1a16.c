#include<stdio.h>
int evenodd();//function declaration
void main(){
	evenodd()?printf("even"):printf("odd");//function call
}
int evenodd(){//function defination
	int no = 8;
	
	if(no % 2 ==0)
		return 1;
	else
		return 0;
}