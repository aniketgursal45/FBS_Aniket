#include<stdio.h>
void main(){
	int units,ebill;
	printf("enter number of units:- ");
	scanf("%d",&units);
	
	if(units<50)
		ebill = 30 * units;
	else if(units<150)
		ebill = (30 *50)+ (units-50)*40;
	else
		ebill = (30 *50)+ (40*100)+(units-150)*50;
		
	printf("Total electricity bill is:- %d",ebill);
}