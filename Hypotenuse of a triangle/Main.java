#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float opp, adj, hyp;
  scanf("%f %f", &opp, &adj);
  hyp = sqrt(pow(opp,2)+pow(adj,2));
  printf("%.2f", hyp);
  return 0;
}