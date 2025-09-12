#include<stdio.h>
void class(float*);//function declaration
void main(){
	float marks;
	
	printf("Enter Your Marks: ");
	scanf("%f",&marks);
	
	class(&marks);//function call

}
void class(float* marks){//function defination

	if(*marks >75){
		printf("Distinction");
	}else if(*marks > 65 ){
		printf("First Class");
	}else if(*marks >55){
		printf("Second Class");
	}else if(*marks >=40){
		printf("Pass Class");
	}else{
		printf("Fail");
	}
}