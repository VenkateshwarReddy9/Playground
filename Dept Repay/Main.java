#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  double intr,amm,dis,fin;
  std::cin>>x>>y>>z;
  intr=(x*y*z)/100;
  amm=x+(x*y*z)/100;
  dis=(intr*2)/100;
  fin=amm-dis;
  std::cout<<intr<<"\n"<<amm<<"\n"<<dis<<"\n"<<fin<<"\n";
}