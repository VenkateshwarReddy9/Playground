#include<iostream>
using namespace std;
int main()
{
 int uc;
 int l2,l4,l6,g6;
  std::cin>>uc;
  l2=uc*0.5;
  l4=(uc*0.65)+100;
  l6=(uc*0.80)+200;
  g6=(uc*1.25)+425;
  if(uc<=200)
    std::cout<<"Rs."<<l2;
  else if(uc>200 && uc<=400)
    std::cout<<"Rs."<<l4;
  else if(uc>400 && uc<=600)
    std::cout<<"Rs."<<l6;
  else if(uc>600)
    std::cout<<"Rs."<<g6;
}