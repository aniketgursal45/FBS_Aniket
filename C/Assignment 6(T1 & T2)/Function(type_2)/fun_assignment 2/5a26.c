#include<stdio.h>
float disprice();//function declaration
void main(){
	printf("%f",disprice());//function call
		
}
float disprice(){//function defination
	int price ;
	printf("Enter the price:- ");
	scanf("%d",&price);
	
	fflush(stdin);
	char des;
	printf("you are a student ( say in  small letter y or n):- ");
	scanf("%c",&des);
	
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