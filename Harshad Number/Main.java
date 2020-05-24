#include<iostream>
using namespace std;
int main()
{
int n,m,a,sum;
  std::cin>>n;
  m=n;
  while(n!=0)
  {
    a=n%10;
    n=n/10;
    sum=sum+a;
  }
  if(m%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}
