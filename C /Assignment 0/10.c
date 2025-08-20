#include<stdio.h>
int main(){
	int Mathematics = 97;
	int Science=87;
	int English = 96;
	int History= 98 ;
	int Computer = 99;
	float tmarks =500;
	float omarks;
	float percentage;
	
	omarks = Mathematics + Science + English + History + Computer;
	
	percentage = omarks*100/500;
	
	printf("total marks are %f and percentage is %f %%",omarks,percentage);
	return 0;
}