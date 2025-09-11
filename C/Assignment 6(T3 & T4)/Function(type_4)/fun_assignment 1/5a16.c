#include<stdio.h>
int voteeligible(int);//function declaration
void main(){
	int age ;
	
	voteeligible(24)?printf("eligible"):printf("Not eligible");//function call

}
int voteeligible(int age){//function defination
	
	
	return age >= 18;
}