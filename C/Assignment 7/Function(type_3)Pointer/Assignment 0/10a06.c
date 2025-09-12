#include<stdio.h>
void perce(int*,int*,int*,int*,int*,float*,float*,float*);//function declaration
void main(){
	int Mathematics = 97,Science=87,English = 96,History= 98,Computer = 99;
	float tmarks =500,omarks,percentage;
	
	perce(&Mathematics,&Science,&English ,&History,&Computer,&tmarks,&omarks,&percentage);//function call
}
void perce(int* Mathematics,int* Science,int* English ,int* History,int* Computer,float* tmarks,float* omarks,float* percentage){//function defination

	*omarks = *Mathematics + *Science + *English + *History + *Computer;
	
	*percentage = *omarks*100/500;
	
	printf("total marks are %f and percentage is %f %%",*omarks,*percentage);
}