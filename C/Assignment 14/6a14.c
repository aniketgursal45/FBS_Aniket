#include<stdio.h>
typedef struct Date {
	int day;
	int month;
	int year;
} date;
void store(date*);
void display(date*);
void main() {
	date sj[3];
	store(sj);
	display(sj);
}
void store(date* sj) {
	for(int i=0; i<3; i++) {
		printf("\nEnter Day:- ");
		scanf("%d",&sj[i].day);
		printf("Enter month:- ");
		scanf("%d",&sj[i].month);
		printf("Enter year:- ");
		scanf("%d",&sj[i].year);
	}
}
void display(date* sj) {
	for(int i=0; i<3; i++) {
		printf("\n%d/%d/%d",sj[i].day,sj[i].month,sj[i].year );
	}
}