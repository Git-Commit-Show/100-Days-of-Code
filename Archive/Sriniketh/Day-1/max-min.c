#include <stdio.h>
#include<stdlib.h>
int compare(int *a,int *b)
{
    return *(int*)a-*(int*)b;
}
int main(void)
{
    int n,k,i,j,min,a[100010];
    scanf("%d",&n);
    scanf("%d",&k);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    qsort(a,n,sizeof(int),compare);

    min=a[k-1]-a[0];
    for(i=0;i<=n-k;i++)    
    {
        if( (j=(a[i+k-1]-a[i]) ) <min)
            min=j;
    }
    printf("%d",min);
    return 0;
}