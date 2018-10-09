#include<stdio.h>
int main()
{
  double salary,value;
  double Total;
  char name;
  scanf("%s %lf %lf",&name,&salary,&value);

  Total = salary+value*.15;
  printf("Total = R$ %.2lf\n",Total);
  return 0;
}
