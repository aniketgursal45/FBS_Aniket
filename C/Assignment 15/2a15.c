#include<stdio.h>
typedef struct time {
	int hour;
	int min;
	int sec;
} t;
void tm(t*);
void store(t*);
void display(t*);
void main() {
	t t1,t2,t3;
	store(&t1);
	store(&t2);
	display(&t1);
	display(&t2);
	t3.hour=t1.hour+t2.hour;
	t3.min=t1.min+t2.min;
	t3.sec=t1.sec+t2.sec;
	tm(&t3);
	display(&t3);
}
void store(t* i) {
	scanf("%d",&i->hour);
	scanf("%d",&i->min);
	scanf("%d",&i->sec);
}
void display(t* i) {
	printf("\n%d:%d:%d",i->hour,i->min,i->sec);
}
void tm(t* n) {
		n->min+=n->sec/60;
		n->sec=n->sec%60;
		n->hour+=(n->min /60);
		n->min=n->min %60;
	
}