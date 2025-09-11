#include<stdio.h>
void loweupp(char);//function declaration
void main(){
	char ch ='C';
 	loweupp(ch);//function call

}
void loweupp(char ch){//function defination
	if(ch >='a' && ch<='z'){
		printf("character is lowercase.");
	}else{
		printf("character is uppercase");
	}
}