#include<stdio.h>
#include<string.h>
typedef struct billing {
	char pname[20];
	int Price;
	int quantityAvailable;
} bill;
typedef struct tbilling {
	bill p;
} tb;
void store(bill*);
void display(bill*);
int shoppr(bill*,tb*);
void display1(tb*);
void main() {
	bill pd[4];
	store(pd);
	display(pd);
	tb u1;
	int tcost =shoppr(pd,&u1);
	printf("total cost is:- %d",tcost);
	display1(&u1);
}
void store(bill* d) {
	printf("\nProduct details");
	for(int i=0; i<4; i++) {
		printf("\nProduct Name:-");
		scanf(" %[^\n]",d[i].pname);
		printf("Product price:-");
		scanf("%d",&d[i].Price);
		printf("Product quantity:-");
		scanf("%d",&d[i].quantityAvailable);
	}
}
void display(bill* d) {
	for(int i=0; i<4; i++) {
		printf("\nProduct name:- %s  Price:- %d pQuantity:- %d ",d[i].pname,d[i].Price,d[i].quantityAvailable);
	}
}
int shoppr(bill* pd,tb* u1) {
	int j=1;
	int fcost=0;
	while(j!=-1) {
		printf("\nEnter product name to take:- ");
		scanf(" %[^\n]",u1->p.pname);
		for(int i=0; i<4; i++) {
			if(strcmp(pd[i].pname,u1->p.pname)==0) {
				printf("enter number of quantity:- ");
				scanf("%d",&u1->p.quantityAvailable);
				if(u1->p.quantityAvailable<=pd[i].quantityAvailable) {
					fcost = fcost + (u1->p.quantityAvailable * pd[i].Price);
					 u1->p.Price = pd[i].Price;
					pd[i].quantityAvailable=pd[i].quantityAvailable-u1->p.quantityAvailable;
				} else {
					printf("not available");
				}

			}

		}
		printf("take another product(enter -1 to exit):- ");
		scanf("%d",&j);
	}
	return fcost;
	printf("Not available try another product");
}
void display1(tb* u1) {
	printf("\nProduct name:- %s  Price:- %d pQuantity:- %d ",u1->p.pname,u1->p.Price,u1->p.quantityAvailable);
}