#include<stdio.h>
void main(){
	int tmin = 182;
	
	int hrs = tmin / 60;
	int min = tmin % 60;
	
	int tsec = (hrs * 3600)+(min * 60);
	
	printf("time is %d hrs %d min and total sec is %d",hrs,min,tsec);
}