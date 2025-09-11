#include<stdio.h>
void disprice(int,char);//function declaration
void main(){
	int price ;
	printf("Enter the price:- ");
	scanf("%d",&price);
	
	fflush(stdin);
	char des;
	printf("you are a student ( say in  small letter y or n):- ");
	scanf("%c",&des);
	disprice(price,des);//function call
}
void disprice(int price,char des){//function defination

	
	if(des == 'y'){
		if(price > 500){
			float tc = price *(1 -0.20);
			printf("total price with discount is 20%:- %f",tc); 
		}else if(price <= 500){
			float tc = price *(1-0.10);
			printf("total price with discount is 10%:- %f",tc );
		}
	}else{
			if(price > 600){
				float tc = price *(1-0.15);
				printf("total price with discount is 15 %:- %f",tc);
			}else if(price <= 600){
				float tc = price;
				printf("Total price without discout:- %f",tc);
			}
	}
}