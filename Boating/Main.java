#include<iostream>
using namespace std;
int main()
{
  int a,c,t,m;
  std::cin>>t>>a>>c;
  m=(a*75)+(c*30);
  if(m<=t)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}