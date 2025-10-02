#include<stdio.h>
#include<string.h>
typedef struct Employee {
	int id;
	char name[20];
	int salary;
} emp;
void store(emp* );
void display(emp*);
void main() {
	emp arr[3];
	store(arr);
	display(arr);
}
void store(emp* arr) {
	for(int i=0; i<3; i++) {
		printf("\nEnter EID:- ");
		scanf("%d",&arr[i].id);
		printf("Enter Name:- ");
		scanf(" %[^\n]",arr[i].name);
		printf("Enter salary:- ");
		scanf("%d",&arr[i].salary);
	}
}
void display(emp* arr) {
	printf("Employee Information:- ");
	for(int i=0; i<3; i++) {
		printf("\nID:- %d Name:- %s salary:- %d",arr[i].id,arr[i].name,arr[i].salary);
	}
}
