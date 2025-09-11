#include<stdio.h>
float areaofcir();//function declaration
void main(){
	printf("Area of circle is %f",areaofcir());//function call
}
float areaofcir(){//function defination
	int r= 7;
	return 3.14 *r *r;
}