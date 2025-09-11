#include<stdio.h>
int tsala(int);//function declaration
void main(){
	int basic;
	printf("Total Salary is:- %d",tsala(6000));//function call

}
int tsala(int basic){//function defination
	
	
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