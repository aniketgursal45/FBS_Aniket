#include<stdio.h>
void  timehrmin();//function declaration
void main(){
	
	timehrmin();//function call
}
void timehrmin(){//function defination
	int hours ,remainmin,givenmin;
	
	givenmin = 122;
	
	hours = 122/60;
	
	remainmin = 122 % 60;
	
	printf("%d hours and remaining minutes %d.",hours,remainmin);
}