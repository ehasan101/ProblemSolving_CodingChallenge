#include<stdio.h>

int main()
{
    int i, n, str[100],  temp, plc=1;
    printf("Enter the number of elements\n");
    scanf("%d", &n);

    for(i=0; i<n; i++)  {
        scanf("%d", &str[i]);
    }

    int max=-9999;
    for(i=0; i<n; i++) {
            if(str[i]>max) {
                max=str[i];
                plc++;
            }

    }
    printf("Maximum = %d", max);
    return 0;

}
