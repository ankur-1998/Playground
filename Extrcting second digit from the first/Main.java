#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int secondDigit = n;
  while(n > 100)
  {
    n /= 10;
  }
  secondDigit = n%10;
  printf("%d", secondDigit);
	return 0;
}