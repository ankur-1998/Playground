#include <stdio.h>
int main() {
	//Type your code
  int n, t;
  scanf("%d", &n);
  int sum = 0, rem;
  while(n > 0)
  {
    sum = sum + (n%10);
    n = n/10;
  }
  printf("%d", sum);
	return 0;
}