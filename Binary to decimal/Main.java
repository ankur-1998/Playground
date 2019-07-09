#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int n, rem, temp, decimal=0, i=0;
  scanf("%d", &n);
  temp = n;
  while(n>0)
  {
    rem = n%10;
    decimal += rem*pow(2,i);
    n /= 10;
    ++i;
  }
  printf("%d", decimal);
  return 0;
}