#include<stdio.h>
void loweupp();//function declaration
void main(){
 	loweupp();//function call

}
void loweupp(){//function defination
	char ch ='C';
	
	if(ch >='a' && ch<='z'){
		printf("character is lowercase.");
	}else{
		printf("character is uppercase");
	}
}