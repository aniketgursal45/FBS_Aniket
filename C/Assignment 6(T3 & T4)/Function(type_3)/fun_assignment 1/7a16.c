#include<stdio.h>
void tsala(int,int,int,int,int);//function declaration
void main(){
	int basic =6000,DA ,TA,HRA,TS;

	tsala(basic,DA ,TA,HRA,TS);//function call

}
void tsala(int basic,int DA ,int TA,int HRA,int TS){//function defination
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