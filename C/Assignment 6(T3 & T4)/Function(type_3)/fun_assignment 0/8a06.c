#include<stdio.h>
void perirec(int,int,int);//function declaration
void main(){
	int length=10,width=5,perimeter=2*(length + width);
	perirec(perimeter,length,width);//function call

}
void perirec(int perimeter,int length,int width){//function defination

	printf("Perimeter of Rectangle is %d ",perimeter);
}