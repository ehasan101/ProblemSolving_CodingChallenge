#include<stdio.h>

int main()
{
    int i, n, str[100],  temp, plc=1;
    printf("Enter the number of elements\n");
    scanf("%d", &n);

    for(i=0; i<n; i++)  {
        scanf("%d", &str[i]);
    }

    int min=str[0];
    for(i=0; i<n; i++) {
            if(str[i]<min) {
                min=str[i];
                plc++;
            }

    }
    printf("Minimum = %d", min);
    return 0;

}
