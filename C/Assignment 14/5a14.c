#include<stdio.h>
typedef struct SalesManager {
	int id;
	char name[20];
	int salary;
	int incentive;
	int target;
} sm;
void store(sm*);
void display(sm*);
void main() {
	sm sj[3];
	store(sj);
	display(sj);
}
void store(sm* sj) {
	for(int i=0; i<3; i++) {
		printf("\nEnter ID:- ");
		scanf("%d",&sj[i].id);
		printf("Enter Name:- ");
		scanf(" %[^\n]",sj[i].name);
		printf("Enter salary:- ");
		scanf("%d",&sj[i].salary);
		printf("Enter incentive:- ");
		scanf("%d",&sj[i].incentive);
		printf("Enter target:- ");
		scanf("%d",&sj[i].target);
	}
}
void display(sm* sj) {
	for(int i=0; i<3; i++) {
		printf("\nID:- %d Name:- %s incentive:- %d Salary:- %d target:- %d",sj[i].id,sj[i].name,sj[i].incentive,sj[i].salary,sj[i].target);
	}
}