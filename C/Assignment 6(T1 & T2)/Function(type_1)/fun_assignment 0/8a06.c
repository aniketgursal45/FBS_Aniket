#include<stdio.h>
void perirec();//function declaration
void main(){
	perirec();//function call

}
void perirec(){//function defination
	int perimeter,length,width;
	
	length = 10;
	width = 5;
	perimeter =2*(length + width);
	
	printf("Perimeter of Rectangle is %d ",perimeter);
}