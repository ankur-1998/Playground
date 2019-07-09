#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,orig,rem,res=0,count=0;
  scanf("%d", &n);
  orig=n;
  while(orig != 0)
  {
    orig /= 10;
    ++count;
  }
  orig = n;
  while(orig != 0)
  {
    rem = orig%10;
    res += pow(rem, count);
    orig /= 10;
  }
  if(res == n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}