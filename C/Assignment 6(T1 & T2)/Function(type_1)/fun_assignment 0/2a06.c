#include<stdio.h>
void areaofcir();//function declaration
void main(){
	areaofcir();//function call
}
void areaofcir(){//function defination
	int r= 7;
	float area = 3.14 *r *r;
	printf("Area of circle is %f",area);
}