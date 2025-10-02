#include<stdio.h>
typedef struct Admin{
	int id;
	char name[20];
	int salary;
	int allowance;
}admin;
void store(admin*);
void display(admin*);
void main(){
	admin sj[3];
	store(sj);
	display(sj);
}
void store(admin* sj){
	for(int i=0;i<3;i++){
		printf("\nEnter ID:- ");
		scanf("%d",&sj[i].id);
		printf("Enter Name:- ");
		scanf(" %[^\n]",sj[i].name);
		printf("Enter salary:- ");
		scanf("%d",&sj[i].salary);
		printf("Enter allowance:- ");
		scanf("%d",&sj[i].allowance);
	}
}
void display(admin* sj){
	for(int i=0;i<3;i++){
		printf("\nID:- %d Name:- %s Allowance:- %d Salary:- %d",sj[i].id,sj[i].name,sj[i].allowance,sj[i].salary);
	}
}