#include<stdio.h>
float disprice(int,char);//function declaration
void main(){
	int price ;
	printf("Enter the price:- ");
	scanf("%d",&price);
	
	fflush(stdin);
	char des;
	printf("you are a student ( say in  small letter y or n):- ");
	scanf("%c",&des);
	printf("%f",disprice(price,des));//function call
		
}
float disprice(int price,char des){//function defination

	
	if(des == 'y'){
		if(price > 500)
			return price *(1 -0.20);
		else if(price <= 500)
			return price *(1-0.10);
	}else{
			if(price > 600)
				return price *(1-0.15);
			else if(price <= 600)
				return price;
	}
}