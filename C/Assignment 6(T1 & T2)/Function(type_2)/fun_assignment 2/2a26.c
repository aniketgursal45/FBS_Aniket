#include<stdio.h>
int sidetrian();//function declaration
void main(){
	
	int result= sidetrian();//function call
	
	if(result==1)
		printf("Equilateral triangle");
	else if(result==2)
		printf("Isosceles triangle");
	else
		printf("Scalene triangle");

}
int sidetrian(){//function defination
	int s1,s2,s3;
	
	printf("side1 of triangle is :");
	scanf("%d",&s1);
	printf("side2 of triangle is :");
	scanf("%d",&s2);
	printf("side3 of triangle is :");
	scanf("%d",&s3);
	
	if(s1==s2 && s1==s3 && s2 == s3 )
		return 1;
		
	else if(s1 == s2 || s1 == s3 || s2 == s3)
		return 2;
		
	else
		return 3;
}