#include<stdio.h>
typedef struct Distance {
	int feet;
	int inch;
} dis;
void store(dis*);
void display(dis*);
void main() {
	dis sj[3];
	store(sj);
	display(sj);
}
void store(dis* sj) {
	for(int i=0; i<3; i++) {
		printf("\nEnter feet:- ");
		scanf("%d",&sj[i].feet);
		printf("Enter inch:- ");
		scanf("%d",&sj[i].inch);

	}
}
void display(dis* sj) {
	for(int i=0; i<3; i++) {
		printf("\n%d feet %d inches",sj[i].feet,sj[i].inch);
	}
}