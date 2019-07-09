#include<stdio.h>
int main()
{
  float r, angle;
  scanf("%f %f", &r, &angle);
  float arc = (angle*3.14*r)/180;
  printf("%.2f", arc);
  return 0;
}
