// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n;
  scanf("%d", &n);
  if(n==0||n==1)
  {
    printf("neither\n");
  }
  else if(n<0)
  {
    printf("composite\n");
  }
  else if(n>=2)
  {
  	for(int i=2; i<=n; i++)
  	{
    	if(n%i==0)
    	{
      		printf("composite\n");
          	break;
    	}
  	    else
  		{
    		printf("prime\n");
          	break;
  		}
    }
  }
  return 0;
}