#include<iostream>
using namespace std;
int main()
{
 int n,a=11,i,x;
  std::cin>>n;
  x=a*a;
  std::cout<<x<<" ";
  for(i=1;i<n;i++)
  {
    a=a+4;
    x=a*a;
    std::cout<<x<<" ";
  }
    
}