#include<stdio.h>
void main(){
	int basic =6000;
	
	int DA ,TA,HRA,TS;
	
	
	if(basic <= 5000){
		DA = 0.10 * basic;
		TA = 0.20 * basic;
		HRA = 0.25 * basic;
		TS = basic + DA + TA + HRA;
		printf("Total Salary is:- %d",TS);
	}else{
		DA = 0.15 * basic;
		TA = 0.25 * basic;
		HRA = 0.30 * basic;
		TS = basic + DA + TA + HRA;
		printf(" Total Salary is:- %d",TS);
	}


}
