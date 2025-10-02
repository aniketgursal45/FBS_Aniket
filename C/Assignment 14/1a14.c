#include<stdio.h>
#include<string.h>
typedef struct student{
	int rollno;
	char name[20];
	int marks;
}student;
void store(student*);
void display(student);
void main(){
	student s1,s2,s3;
	
	store(&s1);
	store(&s2);
	store(&s3);
	
	display(s1);
	display(s2);
	display(s3);
}
void store(student* s){
	printf("Enter Your Roll No:- ");
	scanf("%d",&s->rollno);
	printf("Enter Your Name:- ");
	scanf(" %[^\n]",s->name);
	printf("Enter Your Marks:- ");
	scanf("%d",&s->marks);
}
void display(student s){
	printf("\nRoll No:- %d Name:- %s Marks:- %d",s.rollno,s.name,s.marks);
}
