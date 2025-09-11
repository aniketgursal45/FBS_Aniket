#include<stdio.h>
int  vowelconsonant();//function declaration
void main(){
	vowelconsonant()?printf("Vowel"):printf("Consonant");//function call
}
int vowelconsonant(){//function defination
	char ch = 'e';
	if(ch == 'a' || ch== 'e' || ch== 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch== 'E' || ch== 'I' || ch == 'O' || ch == 'U'){
		return 1;
	}else{
		return 0;
	}
}