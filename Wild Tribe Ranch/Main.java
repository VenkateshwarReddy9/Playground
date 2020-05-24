#include<iostream>
int main()
{
  int max,wf;
  std::cin>>max>>wf;
  if(max>wf)
    std::cout<<"Yes, you can enter.";
  else if(max==wf)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}