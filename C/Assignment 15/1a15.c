#include<stdio.h>
typedef struct book{
	char bname[20];
	int id;
	char author[20];
	int price;	
}bk;
void store(bk*);
void display(bk*);
void main(){
	bk sj[4];
	
	store(sj);
	display(sj);
	
}
void store(bk* sj){
	printf("Enter Book details");
	for(int i=0;i<4;i++){
		printf("\nEnter book name:- ");
		scanf(" %[^\n]",sj[i].bname);
		printf("Enter book id:- ");
		scanf("%d",&sj[i].id);
		printf("Enter author name:- ");
		scanf(" %[^\n]",sj[i].author);
		printf("Enter book price:- ");
		scanf("%d",&sj[i].price);
	}
}
void display(bk* sj){
	printf("Book details");
	for(int i=0;i<4;i++){
		printf("\nBook Name:- %s  Book Id:- %d  Author Name:- %s  Book Price:- %d",sj[i].bname,sj[i].id,sj[i].author,sj[i].price);
	}
}