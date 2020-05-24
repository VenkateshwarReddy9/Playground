#include<iostream>
int main()
{
  int rad,len,x;
  std::cin>>rad>>len;
  x=2*rad;
  if(x==len)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}