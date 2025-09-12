#include<stdio.h>
void areaofcir(int*);//function declaration
void main(){
	int r=7;
	areaofcir(&r);//function call
}
void areaofcir(int* r){//function defination
	float area = 3.14 * *r * *r;
	printf("Area of circle is %f",area);
}