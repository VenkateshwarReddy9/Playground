#include<iostream>
using namespace std;
int main()
{
int target,score,sum=0,attemp=0;
  std::cin>>target;
  while(sum<target)
  {
    std::cin>>score;
    sum=sum+score;
    attemp++;
  }
  std::cout<<"The number of turns is "<<attemp;

}