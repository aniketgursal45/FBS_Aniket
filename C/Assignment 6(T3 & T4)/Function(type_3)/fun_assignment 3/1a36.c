#include<stdio.h>
void prnum(int);//function declaration
void main(){
	int no;
	prnum(1);//function call

}
void prnum(int no){//function defination

	while(no<=10){
	printf("%d\n",no);
	no++;
}
}