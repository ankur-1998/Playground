#include <stdio.h>
int main() {
	//Type your code
  int n,rem,sum = 0,prod,i;
  scanf("%d",&n);
  int temp=n;
  while(n>0)
  {
    rem = n%10;
    prod=1,i=1;
    while(i<=rem)
    {
      prod *= i;
      i++;
    }
    sum = sum + prod;
    n = n/10;
  }
  if(sum == temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}