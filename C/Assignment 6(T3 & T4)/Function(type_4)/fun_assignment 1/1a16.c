#include<stdio.h>
int evenodd(int);//function declaration
void main(){
	int no = 8;
	evenodd(no)?printf("even"):printf("odd");//function call
}
int evenodd(int no){//function defination
	
	
	if(no % 2 ==0)
		return 1;
	else
		return 0;
}