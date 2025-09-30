#include<stdio.h>
#include<string.h>

void main() {
    char s1[1000];
    scanf(" %[^\n]", s1);

    int len = strlen(s1);
    int i, j = 0;

    for(i = 0; i < len; i++) {
        if(i % 2 == 0) { 
            s1[j] = s1[i];
            j++;
        }
    }

    s1[j] = '\0';
    printf("%s", s1);
}
