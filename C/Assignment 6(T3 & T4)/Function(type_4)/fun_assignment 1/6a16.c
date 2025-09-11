#include<stdio.h>
int loweupp(char);//function declaration
void main(){
	char ch ='A';
 	loweupp(ch)?printf("character is lowercase."):printf("character is uppercase");//function call

}
int loweupp(char ch){//function defination

	return ch >='a' && ch<='z';
}