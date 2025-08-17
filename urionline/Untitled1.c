#include<stdio.h>
int main()
{

    int i, j, k=1, s, ss=5;
    for (i=1; i<=5; i++) {

            for (s=ss; s>=1; s--) {
                    printf(" ");

            }
        for (j=1; j<=i; j++) {
            printf("%d ", i);


        }
        printf("\n");
        ss--;
    }









}

