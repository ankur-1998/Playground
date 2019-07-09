#include<stdio.h>
int main()
{
	//your code here
  long int f=1;
  int n;
  scanf("%d", &n);
  for(int i=1; i<=n; i++)
    f = f*i;
  printf("%ld",f);
  return 0;
}