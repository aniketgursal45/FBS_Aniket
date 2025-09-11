#include<stdio.h>
int tsala();//function declaration
void main(){
	printf("Total Salary is:- %d",tsala());//function call

}
int tsala(){//function defination
	int basic =6000;
	
	int DA ,TA,HRA,TS;
	
	
	if(basic <= 5000){
		DA = 0.10 * basic;
		TA = 0.20 * basic;
		HRA = 0.25 * basic;
		return basic + DA + TA + HRA;
	}else{
		DA = 0.15 * basic;
		TA = 0.25 * basic;
		HRA = 0.30 * basic;
		return basic + DA + TA + HRA;
	}
}