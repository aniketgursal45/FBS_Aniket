#include<stdio.h>
#include<string.h>
void main(){
    char sj[20];
    printf("Enter a string to see each word occurance in string:- ");
    scanf("%s",sj);
    
    int len=strlen(sj);
    int occurence=0;
    int i=0;
    while(sj[i]!='\0'){
        occurence=0;
        for(int j=0;j<len;j++){
            if(sj[i]==sj[j]){
                occurence++;
            }
        }
        printf("%c occurence is %d\n",sj[i],occurence);
        i++;
    }
}
