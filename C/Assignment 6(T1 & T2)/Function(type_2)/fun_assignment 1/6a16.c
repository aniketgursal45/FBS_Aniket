#include<stdio.h>
int loweupp();//function declaration
void main(){
 	loweupp()?printf("character is lowercase."):printf("character is uppercase");//function call

}
int loweupp(){//function defination
	char ch ='A';
	
	return ch >='a' && ch<='z';
}