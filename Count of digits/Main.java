#include<iostream>
int main()
{
  int num,temp,count,n;
  std::cin>>num;
  temp=num;
  do
  {
   count++;
    n=temp%10;
    temp/=10;
  }
  
  while(temp!=0);
   
  std::cout<<count;
}