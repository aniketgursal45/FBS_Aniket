#include<stdio.h>
typedef struct Product{
	int id;
	char name[20];
	int quantity;
	int price;
}prd;
void store(prd*);
void display(prd*);
void main(){
	prd arr[3];
	
	store(arr);
	display(arr);
}
void store(prd* arr){
	for(int i=0;i<3;i++){
		printf("\nEnter Product Id:- ");
		scanf("%d",&arr[i].id);
		printf("Enter Product Name:- ");
		scanf("%s",&arr[i].name);
		printf("Enter Product quantity:- ");
		scanf("%d",&arr[i].quantity);
		printf("Enter Product Price:- ");
		scanf("%d",&arr[i].price);
	}
}
void display(prd* arr){
	printf("Product Details");
	for(int i=0;i<3;i++){
		printf("\nID:- %d Name:- %s quantity:- %d Price:- %d",arr[i].id,arr[i].name,arr[i].quantity,arr[i].price);
	}
}