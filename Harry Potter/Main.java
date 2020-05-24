#include<iostream>
using namespace std;
int main()
{
  long int n,first,last,ans;
  std::cin>>n;
  first=n/1000;
  last=n%10;
  ans=first+last;
  std::cout<<first+last;
}