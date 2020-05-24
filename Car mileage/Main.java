#include<iostream>
using namespace std;
int main()
{
int ap,d2t;
  float mil;
  std::cin>>mil>>ap>>d2t;
  if(d2t<=mil*ap)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}