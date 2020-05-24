#include<iostream>
using namespace std;
int main()
{
  float n,ht,a,b,c,d;
  std::cin>>n>>ht;
b=n*ht;
  a=((ht/100)*50);
  c=b-a;
  d=2*ht;
  if(n==2)
  
    std::cout<<c;
  
  else if(n==3)
    std::cout<<d;
  else if(n>3)
    std::cout<<"Number of items is more";
}