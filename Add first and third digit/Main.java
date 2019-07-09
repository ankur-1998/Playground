#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int first = n/100;
  int last = n%10;
  printf("%d", first+last);
  return 0;
}