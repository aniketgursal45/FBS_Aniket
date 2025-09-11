#include<stdio.h>
float areaofcir(int);//function declaration
void main(){
	int r= 7;
	printf("Area of circle is %f",areaofcir(r));//function call
}
float areaofcir(int r){//function defination
	return 3.14 *r *r;
}