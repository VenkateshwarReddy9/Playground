#include<iostream>
using namespace std;
int main()
{
  int n,x,r=11,i;
  std::cin>>n;
  x=r*r;
  std::cout<<x<<" ";
  for(i=1;i<n;i++)
  {
   r=r+4;
    x=r*r;
  
  std::cout<<x<<" ";
}
}