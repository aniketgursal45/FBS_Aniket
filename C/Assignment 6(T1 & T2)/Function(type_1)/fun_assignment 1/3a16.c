#include<stdio.h>
void leafnotl();//function defination
void main(){
	leafnotl();//function call

}
void leafnotl(){//function defination
	int yr =2024;
	
	if( yr % 400 == 0 ||( yr % 100 != 0 && yr % 4 == 0)){
		printf("%d given year is a leap year.",yr);
	}else{
		printf("%d given year is not a leap year.",yr);
	}
}