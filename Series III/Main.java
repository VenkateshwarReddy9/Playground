#include<iostream>
using namespace std;
int main()
{
  int n,a=6,i;
  std::cin>>n;
  std::cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    a=a+5*i;
    std::cout<<a<<" ";
  }
}