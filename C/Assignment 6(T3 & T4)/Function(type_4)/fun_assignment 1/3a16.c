#include<stdio.h>
int leafnotl(int);//function defination
void main(){
	int yr;
	leafnotl(2024)?printf("leaf year"):printf("not leaf year");//function call

}
int leafnotl(int yr){//function defination
	
	
	if( yr % 400 == 0 ||( yr % 100 != 0 && yr % 4 == 0))
		return 1;
	else
		return 0;
}
