#include<stdio.h>
void perirec(int*,int*,int*);//function declaration
void main(){
	int length=10,width=5,perimeter=2*(length + width);
	perirec(&length,&width,&perimeter);//function call

}
void perirec(int* length,int* width,int* perimeter){//function defination

	printf("Perimeter of Rectangle is %d ",*perimeter);
}