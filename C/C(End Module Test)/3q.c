#include<stdio.h>
#include<stdlib.h>
typedef struct mobiledetails {
	int mid;
	char mname[20];
	int price;
	char brand[20];
} mdetail;
void store(mdetail*,int);
void display(mdetail*,int);
void main() {
	int n=5;
	mdetail* sj=malloc(sizeof(mdetail)*n);
	int choice =0;

	while(choice!=3){
	printf("Enter choice 1 to store 2 to display(3 to exit):- ");
	scanf("%d",&choice);
	if(choice==1){
		store(sj,n);
	}else if(choice==2){
	display(sj,n);
}
}
}
void store(mdetail* sj,int n) {
	printf("\nEnter Mobile Details:- \n");
	for(int i=0; i<n; i++) {
		printf("Enter mobile id:- ");
		scanf("%d",&sj[i].mid);
		printf("Enter mobile name:- ");
		scanf(" %[^\n]",sj[i].mname);
		printf("Enter mobile price:- ");
		scanf("%d",&sj[i].price);
		printf("Enter mobile brand:- ");
		scanf(" %[^\n]",sj[i].brand);
	}
}
void display(mdetail* sj,int n){
	for(int i=0;i<n;i++){
		printf("MID:- %d || Mname:- %s || Mprice:- %d || Mbrand:- %s  \n",sj[i].mid,sj[i].mname,sj[i].price,sj[i].brand);
	}
}