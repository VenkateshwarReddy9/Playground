#include<iostream>
using namespace std;
int main()
{
  float st,age,mat;
  mat=13.30;
  std::cin>>age>>st;
  if(age>13 && st==mat)
    std::cout<<"$5.00";
  else if(age>13 && st!= mat)
    std::cout<<"$8.00";
  else if(age<=13 && st==mat)
    std::cout<<"$2.00";
  else if(age<=13 && st!=mat)
    std::cout<<"$4.00";
}
  