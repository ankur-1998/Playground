#include<stdio.h>
int main()
{
  //Type your code here
  int d;
  scanf("%d", &d);
  float r, area;
  r = (float)d/2;
  area = 3.14*r*r;
  printf("%.2f", area);
  return 0;
}