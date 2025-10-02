#include<stdio.h>
#include<string.h>
struct complex{
	int real,img;
};
void display(struct complex );
void main(){
	struct complex c1,c2,c3;
	
	c1.real=22;
	c1.img=101;
	c2.real=10;
	c2.img=127;
	 
	c3.real=c1.real+c2.real;
	c3.img=c1.img+c2.img;
	display(c1);
	display(c2);
	display(c3);
}
void display(struct complex c){
	printf("\n %d & %d ",c.real,c.img);
}