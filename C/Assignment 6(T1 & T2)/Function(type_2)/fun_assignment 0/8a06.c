#include<stdio.h>
int perirec();//function declaration
void main(){
	printf("Perimeter of Rectangle is %d ",perirec());//function call

}
int perirec(){//function defination
	int length,width;
	
	length = 10;
	width = 5;
	return 2*(length + width);
}