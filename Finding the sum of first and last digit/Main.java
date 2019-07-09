#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int last_digit = n % 10;
  int first_digit = n;
  while(n>10)
  {
    n /= 10;
  }
  first_digit = n;
  int sum = first_digit + last_digit;
  printf("%d", sum);
	return 0;
}