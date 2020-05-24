#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  int sum=a+b;
  int sub=a-b;
  int mul=a*b;
  int div=a/b;
 int rem=a%b;
  std::cout<<"a+b="<<sum<<"\n";
  std::cout<<"a-b="<<sub<<"\n";
  std::cout<<"a*b="<<mul<<"\n";
  std::cout<<"a/b="<<div<<"\n";
  std::cout<<"a%b="<<rem<<"\n";
}