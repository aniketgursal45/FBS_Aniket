#include<stdio.h>
void leafnotl(int*);//function defination
void main(){
	int yr =2024;
	leafnotl(&yr);//function call

}
void leafnotl(int* yr){//function defination
	
	if( *yr % 400 == 0 ||( *yr % 100 != 0 && *yr % 4 == 0)){
		printf("%d given year is a leap year.",*yr);
	}else{
		printf("%d given year is not a leap year.",*yr);
	}
}