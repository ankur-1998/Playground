#include<stdio.h>
int main()
{
  int num,rem,sum=0,temp;
  scanf("%d", &num);
  while(num>0)
  {
    rem = num%10;
    sum += rem;
    num /= 10;
  }
  
  if(sum >10)
  {
    temp = sum;
    sum = 0;
    while(temp>0)
    {
      rem = temp%10;
      sum += rem;
      temp /= 10;
    }
  }
  printf("%d", sum);
  return 0;
}
   