#include<stdio.h>
void sidetrian();//function declaration
void main(){
	
	sidetrian();//function call

}
void sidetrian(){//function defination
	int s1,s2,s3;
	
	printf("side1 of triangle is :");
	scanf("%d",&s1);
	printf("side2 of triangle is :");
	scanf("%d",&s2);
	printf("side3 of triangle is :");
	scanf("%d",&s3);
	
	if(s1==s2 && s1==s3 && s2 == s3 ){
		printf("Equilateral triangle");
	}else if(s1 == s2 || s1 == s3 || s2 == s3){
		printf("Isosceles triangle");
	}else{
		printf("Scalene triangle");
	}
}