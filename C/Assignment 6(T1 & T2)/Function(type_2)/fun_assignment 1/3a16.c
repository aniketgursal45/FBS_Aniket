#include<stdio.h>
int leafnotl();//function defination
void main(){
	leafnotl()?printf("leaf year"):printf("not leaf year");//function call

}
int leafnotl(){//function defination
	int yr =2024;
	
	if( yr % 400 == 0 ||( yr % 100 != 0 && yr % 4 == 0))
		return 1;
	else
		return 0;
}