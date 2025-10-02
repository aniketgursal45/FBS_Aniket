#include<stdio.h>
typedef struct HR{
	int id;
	char name[20];
	int salary;
	int commission;
}hr;
void store(hr*);
void display(hr*);
void main(){
	hr sj[3];
	store(sj);
	display(sj);
}
void store(hr* sj){
	for(int i=0;i<3;i++){
		printf("\nEnter ID:- ");
		scanf("%d",&sj[i].id);
		printf("Enter Name:- ");
		scanf(" %[^\n]",sj[i].name);
		printf("Enter salary:- ");
		scanf("%d",&sj[i].salary);
		printf("Enter commission:- ");
		scanf("%d",&sj[i].commission);
	}
}
void display(hr* sj){
	for(int i=0;i<3;i++){
		printf("\nID:- %d Name:- %s commission:- %d Salary:- %d",sj[i].id,sj[i].name,sj[i].commission,sj[i].salary);
	}
}