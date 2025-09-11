#include<stdio.h>
int  vowelconsonant(char);//function declaration
void main(){
	char ch = 'e';
	vowelconsonant(ch)?printf("Vowel"):printf("Consonant");//function call
}
int vowelconsonant(char ch){//function defination
	if(ch == 'a' || ch== 'e' || ch== 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch== 'E' || ch== 'I' || ch == 'O' || ch == 'U'){
		return 1;
	}else{
		return 0;
	}
}