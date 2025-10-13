#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Book {
	int Bid;
	char BName[20];
	char AName[20];
	char Category[20];
	int Price;
	float Rating;
} Book;

void hardcoded(Book*);
void Addbook(Book*, int*);
void removebook(Book*, int*);
void searchbId(Book*, int);
void searchbnm(Book*, int);
void showabauthor(Book*, int);
void showabcategory(Book*, int);
void updatepricerating(Book*, int);
void sortpricerating(Book*, int);
void topthreeB(Book*, int);
void display(Book*, int);

void main() {
	int n = 4;
	Book *sj;
	sj = (Book*)malloc(n * sizeof(Book)); 

	int choice = 0;

	hardcoded(sj);

	while (choice != 11) {
		printf("\n===== Book Management System =====");
		printf("\n1. Add Book");
		printf("\n2. Remove Book");
		printf("\n3. Search Book by ID");
		printf("\n4. Search Book by Name");
		printf("\n5. Show All Books by Author");
		printf("\n6. Show All Books by Category");
		printf("\n7. Update Book Price/Rating");
		printf("\n8. Display Sorted Books");
		printf("\n9. Display Top 3 Books");
		printf("\n10. Display All Books");
		printf("\n11. Exit");
		printf("\n\nEnter Choice(11 to Exit):- ");
		scanf("%d", &choice);

		if (choice == 1) {
			Addbook(sj, &n);  
		} else if (choice == 2) {
			removebook(sj, &n);
		} else if (choice == 3) {
			searchbId(sj, n);
		} else if (choice == 4) {
			searchbnm(sj, n);
		} else if (choice == 5) {
			showabauthor(sj, n);
		} else if (choice == 6) {
			showabcategory(sj, n);
		} else if (choice == 7) {
			updatepricerating(sj, n);
		} else if (choice == 8) {
			sortpricerating(sj, n);
		} else if (choice == 9) {
			topthreeB(sj, n);
		} else if (choice == 10) {
			display(sj, n);
		}
	}

	free(sj); 
}

void Addbook(Book* sj, int* n) {
	printf("Add Book's\n");
	int newbooks;
	printf("Enter number of books to add:- ");
	scanf("%d", &newbooks);

	for (int i = *n; i < *n + newbooks && i < 100; i++) { 
		printf("\nEnter Book ID:- ");
		scanf("%d", &sj[i].Bid);
		printf("Enter Book Name:- ");
		scanf(" %[^\n]", sj[i].BName);
		printf("Enter Author Name:- ");
		scanf(" %[^\n]", sj[i].AName);
		printf("Enter Category:- ");
		scanf(" %[^\n]", sj[i].Category);
		printf("Enter Price:- ");
		scanf("%d", &sj[i].Price);
		printf("Enter Rating:- ");
		scanf("%f", &sj[i].Rating);
	}

	*n += newbooks;
}

void removebook(Book* sj, int* n) {
	int id;
	printf("Enter Book ID to remove book:- ");
	scanf("%d", &id);

	for (int i = 0; i < *n; i++) {
		if (id == sj[i].Bid) {
			for (int j = i; j < *n - 1; j++) {
				sj[j] = sj[j + 1];
			}
			(*n)--;
			return;
		}
	}
	printf("Book id not found\n");
}

void searchbId(Book* sj, int n) {
	int bsi;
	int flag = 0;
	printf("\nEnter Id of Book To search:- ");
	scanf("%d", &bsi);

	for (int i = 0; i < n; i++) {
		if (bsi == sj[i].Bid) {
			flag = 1;
			printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f\n",
			       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			break;
		}
	}

	if (flag == 0)
		printf("Enter valid Book id(try again)\n");
}

void searchbnm(Book* sj, int n) {
	char bsn[20];
	int flag = 0;
	printf("\nEnter Book Name To search:- ");
	scanf(" %[^\n]", bsn);

	for (int i = 0; i < n; i++) {
		if (strcasecmp(bsn, sj[i].BName) == 0) {
			flag = 1;
			printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f\n",
			       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			break;
		}
	}

	if (flag == 0)
		printf("Enter valid Book name(try again)\n");
}

void showabauthor(Book* sj, int n) {
	char aname[20];
	int flag = 0;
	printf("\nEnter Author name to search Book:- ");
	scanf(" %[^\n]", aname);

	for (int i = 0; i < n; i++) {
		if (strcasecmp(sj[i].AName, aname) == 0) {
			flag = 1;
			printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f\n",
			       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
		}
	}

	if (flag == 0) {
		printf("\nEnter correct name of Author or book is not available");
	}
}

void showabcategory(Book* sj, int n) {
	char categ[20];
	int flag = 0;
	printf("\nEnter Category  to search Book:- ");
	scanf(" %[^\n]", categ);

	for (int i = 0; i < n; i++) {
		if (strcasecmp(sj[i].Category, categ) == 0) {
			flag = 1;
			printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f\n",
			       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
		}
	}

	if (flag == 0) {
		printf("\nEnter correct category of book or book is not available for such category");
	}
}

void updatepricerating(Book* sj, int n) {
	int upr = 0;
	int updatep;
	float updater;

	while (upr != 3) {
		printf("\nenter 1 to update price or 2 to update Rating(3 to exit):- ");
		scanf("%d", &upr);

		if (upr == 1) {
			int searchid;
			int flag = 0;
			printf("Enter Book id:- ");
			scanf("%d", &searchid);
			printf("\nEnter price to update this book:- ");
			scanf("%d", &updatep);

			for (int i = 0; i < n; i++) {
				if (searchid == sj[i].Bid) {
					flag = 1;
					sj[i].Price = updatep;
					printf("\nPrice updated successfully");
				}
			}

			if (flag == 0)
				printf("Book not found");

		} else if (upr == 2) {
			int searchid;
			int flag = 0;
			printf("Enter Book id:-");
			scanf("%d", &searchid);
			printf("\nEnter updated rating for this book:- ");
			scanf("%f", &updater);

			for (int i = 0; i < n; i++) {
				if (searchid == sj[i].Bid) {
					flag = 1;
					sj[i].Rating = updater;
					printf("\nRating updated successfully");
				}
			}

			if (flag == 0)
				printf("Book not found");
		}
	}
}

void sortpricerating(Book* sj, int n) {
	int choice = 0;

	while (choice != 3) {
		printf("\nEnter 1 for sort by price or 2 for rating(3 for exit):- ");
		scanf("%d", &choice);

		if (choice == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sj[i].Price < sj[j].Price) {
						Book temp = sj[i];
						sj[i] = sj[j];
						sj[j] = temp;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f",
				       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			}

		} else if (choice == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sj[i].Rating < sj[j].Rating) {
						Book temp = sj[i];
						sj[i] = sj[j];
						sj[j] = temp;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f",
				       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			}
		}
	}
}

void topthreeB(Book* sj, int n) {
	int choice = 0;

	while (choice != 3) {
		printf("\nEnter 1 for Top 3 by price or 2 for Top 3 rating(3 for exit):- ");
		scanf("%d", &choice);

		if (choice == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sj[i].Price < sj[j].Price) {
						Book temp = sj[i];
						sj[i] = sj[j];
						sj[j] = temp;
					}
				}
			}

			for (int i = 0; i < 3 && i < n; i++) {
				printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f",
				       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			}

		} else if (choice == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sj[i].Rating < sj[j].Rating) {
						Book temp = sj[i];
						sj[i] = sj[j];
						sj[j] = temp;
					}
				}
			}

			for (int i = 0; i < 3 && i < n; i++) {
				printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f",
				       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
			}
		}
	}
}

void display(Book* sj, int n) {
	for (int i = 0; i < n; i++) {
		printf("\nId:- %d  |AName:-  %s  |BName:-%s  |Category:-%s  |Price:-%d  |Rating:-%f",
		       sj[i].Bid, sj[i].AName, sj[i].BName, sj[i].Category, sj[i].Price, sj[i].Rating);
	}
	printf("\n");
}

void hardcoded(Book* sj) {
	sj[0].Bid = 101, strcpy(sj[0].AName, "J.K. Rowling"), strcpy(sj[0].BName, "Harry Potter"), strcpy(sj[0].Category, "Fantasy"), sj[0].Price = 500, sj[0].Rating = 4.8;
	sj[1].Bid = 102, strcpy(sj[1].AName, "Paulo Coelho"), strcpy(sj[1].BName, "The Alchemist"), strcpy(sj[1].Category, "Fiction"), sj[1].Price = 300, sj[1].Rating = 4.5;
	sj[2].Bid = 103, strcpy(sj[2].AName, "Napoleon Hill"), strcpy(sj[2].BName, "Think and Grow Rich"), strcpy(sj[2].Category, "Self-Help"), sj[2].Price = 250, sj[2].Rating = 4.7;
	sj[3].Bid = 104, strcpy(sj[3].AName, "F. Scott Fitzgerald"), strcpy(sj[3].BName, "The Great Gatsby"), strcpy(sj[3].Category, "Classic"), sj[3].Price = 400, sj[3].Rating = 4.4;
}
