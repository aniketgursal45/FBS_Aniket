#include<stdio.h>
typedef struct player {
	char PName[20];
	int MPlayed;
	int Runs;
	int Wickets;
} pl;
int find(pl*,int);
int mrun(pl* arr);
void store(pl*);
void display(pl*);
void displayone(pl*,int);
int mwic(pl*);
int find1(pl*,int);
void main() {
	pl arr[10];
	store(arr);
	display(arr);
	int maxr=mrun(arr);
	int i=find(arr,maxr);
	printf("\nMost Runs player Name:- ");
	displayone(arr,i);
	int maxw=mwic(arr);
	int j=find1(arr,maxw);
	printf("\nMost Wicket player Name:- ");
	displayone(arr,j);
}
void store(pl* arr) {
	printf("\nPlayer Details");
	for(int i=0; i<10; i++) {
		printf("\nEnter Player Name:- ");
		scanf(" %[^\n]",arr[i].PName);
		printf("Enter Matches Played:- ");
		scanf("%d",&arr[i].MPlayed);
		printf("Enter Runs:- ");
		scanf("%d",&arr[i].Runs);
		printf("Enter Wickets:- ");
		scanf("%d",&arr[i].Wickets);
	}
}
void display(pl* arr) {
	printf("\n Player's Detail");
	for(int i=0; i<10; i++) {
		printf("\nName:- %s  Matches Played:- %d Runs :- %d  Wickets:- %d  ",arr[i].PName,arr[i].MPlayed,arr[i].Runs,arr[i].Wickets);
	}
}
int mrun(pl* arr) {
	int max=0;
	for(int i=0; i<10; i++) {
		if(arr[i].Runs>max) {
			max=arr[i].Runs;
		}
	}
	return max;
}
int find(pl* arr,int maxr) {
	for(int i=0; i<10; i++) {
		if(maxr==arr[i].Runs) {
			return i;
		}
		
	}
	return-1;
}
void displayone(pl* arr,int i) {
	if(i!=-1)
		printf("\nName:- %s  Matches Played:- %d Runs :- %d  Wickets:- %d  ",arr[i].PName,arr[i].MPlayed,arr[i].Runs,arr[i].Wickets);
	else
		printf("not found");
}
int mwic(pl* arr) {
	int max=0;
	for(int i=0; i<10; i++) {
		if(arr[i].Wickets>max) {
			max=arr[i].Wickets;
		}
	}
	return max;
}
int find1(pl* arr,int maxr) {
	for(int i=0; i<10; i++) {
		if(maxr==arr[i].Wickets)
			return i;
	}
	return -1;
}
