#include<stdio.h>
int perirec(int,int);//function declaration
void main(){
	int length,width;
	printf("Perimeter of Rectangle is %d ",perirec(10,5));//function call

}
int perirec(int length,int width){//function defination
	return 2*(length + width);
}