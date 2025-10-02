#include<stdio.h>
typedef struct Time {
	int Hour;
	int Min;
	int Sec;
} time;
void store(time*);
void display(time*);
void main() {
	time sj[3];
	store(sj);
	display(sj);
}
void store(time* sj) {
	for(int i=0; i<3; i++) {
		printf("\nEnter hour:- ");
		scanf("%d",&sj[i].Hour);
		printf("Enter min:- ");
		scanf("%d",&sj[i].Min);
		printf("Enter sec:- ");
		scanf("%d",&sj[i].Sec);
	}
}
void display(time* sj) {
	for(int i=0; i<3; i++) {
		printf("\n%d:%d:%d",sj[i].Hour,sj[i].Min,sj[i].Sec);
	}
}