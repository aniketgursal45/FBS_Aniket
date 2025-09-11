#include<stdio.h>
int voteeligible();//function declaration
void main(){
	
	voteeligible()?printf("eligible"):printf("Not eligible");//function call

}
int voteeligible(){//function defination
	int age = 24;
	
	return age >= 18;
}