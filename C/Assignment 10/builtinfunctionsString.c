#include<stdio.h>
#include<string.h>
int leng(char*);
void strcopy(char*,char*);
void upper(char*);
void lower(char*);
int compare(char*,char*);
char* firstoccur(char*);
void strstrsubval(char*);
void addstring(char*,char*);
void strncopy(char*,char*);
void addnstring(char*,char*);
int ncompare(char*,char*);
char* lastoccur(char*);
int ignorecacompare(char*,char*);
void tokent(char*);
void duplicate(char*);
void main() {
	char arr[]="Aniket gursal";
	char brr[20];
	char crr[]="Rohit Sharma";
	char drr[]="Virat kholi";
	char s1[]="aniket@gmail.com";
	char s2[]="My_favorite_player_is_RO45";
	int choice;
	printf("Enter your choice:- ");
	scanf("%d",&choice);
	while(choice!=-1){
	if(choice==1) {
		printf("%d",leng(arr));// 						(1). strlen.
	}else if(choice==2){
		strcopy(arr,brr);//								(2). strcpy.
		printf("%s",brr);
	}else if(choice==3){
		upper(arr);// 								    (3). strupr.
		printf("%s",arr);
	}else if(choice==4){
		lower(arr);// 									(4). strlwr.
		printf("%s",arr);
	}else if(choice==5){
		printf("%d",compare(arr,crr));//				(5). strcmp.
	}else if(choice==6){
		printf("%s",firstoccur(crr));//					(6). strchr.
	}else if(choice==7){
		strstrsubval(s1);//								(7).strstr.
	}else if(choice==8){
		addstring(crr,drr);//							(8).strcat.
		printf("%s",crr);
	}else if(choice==9){
		strncopy(arr,brr);//							(9). strncpy.
		printf("%s",brr);
	}else if(choice==10){
		addnstring(crr,drr);//							(10).strncat.
		printf("%s",crr);
	}else if(choice==11){
		printf("%d",ncompare(arr,crr));//				(11). strncmp.
	}else if(choice==12){
		printf("%s",lastoccur(crr));//					(12). strrchr.
	}else if(choice==13){
		int result=ignorecacompare(arr,crr);//			(13). strcasecmp.
		if(result==0)
			printf("String are same(ignore case)");
		else
			printf("not same");
			
	}else if(choice==14){
		tokent(s2);	//									(14). strtok.
	}else if(choice==15){
		duplicate(s1);//									(15).strdup.
	}
	printf("\nEnter a choice if you want to try another(to exit (-1)):-");
	scanf("%d",&choice);   
}

}
int leng(char* arr) {
	int len=strlen(arr);
	return len;
}
void  strcopy(char* arr,char* brr){
	strcpy(brr,arr); //(d,s).
}
void  upper(char* arr){
	strupr(arr);
}
void lower(char* arr){
	strlwr(arr);
}
int compare(char* arr,char* crr){
	return strcmp(arr,crr);
}
char* firstoccur(char* crr){
	return strchr(crr,'S');
}
void strstrsubval(char* s1){
	char* result=strstr(s1,"@gmail.com");
		if(result != NULL)
			printf("allowed");
		else
			printf("not allowed");
}
void addstring(char* crr,char* drr){
	strcat(crr,drr);
}
void  strncopy(char* arr,char* brr){
	strncpy(brr,arr,9); //(d,s).
	brr[9]='\0';
}
void addnstring(char* crr,char* drr){
	strncat(crr,drr,5);
}
int ncompare(char* arr,char* crr){
	return strncmp(arr,crr,1);
}
char* lastoccur(char* crr){
	return strchr(crr,'S');
}
int ignorecacompare(char* arr,char* crr){
	return strcasecmp(arr,crr);
}
void tokent(char* s2){
	char* tok=strtok(s2,"_");
	
	while(tok !=NULL){
		printf("%s\n",tok);
		tok=strtok(NULL,"_");
	}
}
void duplicate(char* s1){
	char* s4= strdup(s1);
	printf("%s",s4);
}